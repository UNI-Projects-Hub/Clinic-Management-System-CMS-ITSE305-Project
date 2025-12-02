package business;

import data.PatientDAO;
import models.Patient;

import java.util.Optional;

public class PatientService {

    private final PatientDAO patientDAO;

    public PatientService(PatientDAO patientDAO) {
        if (patientDAO == null) {
            throw new IllegalArgumentException("patientDAO must not be null");
        }
        this.patientDAO = patientDAO;
    }

    // Return Optional instead of null
    public Optional<Patient> getPatient(int id) {
        return Optional.ofNullable(patientDAO.getPatientById(id));
    }

    // Update contact info with validation + safe update handling
    public boolean updateContactInfo(int id, String email, String phone, String address) {

        Optional<Patient> optionalPatient = getPatient(id);
        if (optionalPatient.isEmpty()) return false;

        if (!isValidEmail(email) || !isValidPhone(phone) || !isValidAddress(address)) {
            return false; // validation failed
        }

        Patient patient = optionalPatient.get();
        patient.setEmail(email);
        patient.setPhone(phone);
        patient.setAddress(address);

        // DAO update returns boolean so we know if it succeeded
        return patientDAO.updatePatient(patient);
    }

    // ---- Basic validation helpers ----
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.length() >= 5;
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\+?[0-9]{7,15}");
    }

    private boolean isValidAddress(String address) {
        return address != null && !address.isBlank();
    }
}

