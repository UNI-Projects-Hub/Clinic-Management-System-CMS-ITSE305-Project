package com.clinic.provideMedicine;

/**
 * Data Layer Class
 * This class simulates the storage of medicines and prescriptions.
 * It allows retrieving prescription information and checking medicine availability.
 */
public class Data {

    // Sample list of available medicines in the pharmacy
    private String[] availableMedicines = {
            "Panadol",
            "Ibuprofen",
            "Amoxicillin",
            "Vitamin C"
    };

    // The medicine required by the patient's prescription
    private String prescribedMedicine = "Panadol";

    /**
     * Returns the name of the medicine required in the prescription.
     * @return prescribed medicine as a String
     */
    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    /**
     * Checks if a specific medicine is available in the inventory.
     * @param medicine the name of the medicine to check
     * @return true if the medicine exists, otherwise false
     */
    public boolean checkAvailability(String medicine) {
        for (String item : availableMedicines) {
            if (item.equalsIgnoreCase(medicine)) {
                return true;
            }
        }
        return false;
    }
}

