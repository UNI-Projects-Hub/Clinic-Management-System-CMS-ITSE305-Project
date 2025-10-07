package business;

import data.PatientDAO;
import models.Patient;

// Service layer = business logic of the system
// It interacts between UI and Data layers
public class PatientService {
    private final PatientDAO patientDAO; // DAO instance for data operations

    // Constructor - inject DAO dependency
    public PatientService(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    // Get patient info by ID
    public Patient getPatient(int id) {
        return patientDAO.getPatientById(id);
    }

    // Update patient contact info if patient exists
    public boolean updateContactInfo(int id, String email, String phone, String address) {
        Patient patient = patientDAO.getPatientById(id);
        if (patient == null) return false; // if patient not found

        // Update patient data
        patient.setEmail(email);
        patient.setPhone(phone);
        patient.setAddress(address);

        // Save updated data
        patientDAO.updatePatient(patient);
        return true;
    }
}
