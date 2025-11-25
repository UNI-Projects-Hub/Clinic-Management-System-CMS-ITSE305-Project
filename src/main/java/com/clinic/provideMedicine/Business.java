package com.clinic.provideMedicine;



/**
 * Business Layer Class
 * This class contains the logic of the Provide Medicine use case.
 * It communicates with the Data layer to verify the prescription
 * and checks if the required medicine is available.
 */
public class Business {

    private Data data; // Object to access data layer methods

    /**
     * Constructor that initializes the Data layer.
     */
    public Business() {
        data = new Data();
    }

    /**
     * Gets the prescribed medicine from the Data layer.
     * @return the name of the prescribed medicine
     */
    public String getPrescriptionMedicine() {
        return data.getPrescribedMedicine();
    }

    /**
     * Checks if the prescribed medicine is available in inventory.
     * @return true if available, false if not
     */
    public boolean isMedicineAvailable() {
        String medicineNeeded = data.getPrescribedMedicine();
        return data.checkAvailability(medicineNeeded);
    }

    /**
     * Performs the medicine dispensing process.
     * @return a message indicating success or failure
     */
    public String dispenseMedicine() {
        String med = data.getPrescribedMedicine();

        if (data.checkAvailability(med)) {
            return "Medicine '" + med + "' has been successfully dispensed.";
        } else {
            return "Medicine '" + med + "' is not available in inventory.";
        }
    }
}
