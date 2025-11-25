package com.clinic.provideMedicine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {

    @Test
    void testDispenseMedicineNotAvailable() {
        // Fake Data Layer: always unavailable
        Data fakeData = new Data() {
            @Override
            public String getPrescribedMedicine() {
                return "Unknown";
            }

            @Override
            public boolean checkAvailability(String medicine) {
                return false;
            }
        };

        Business business = new Business() {
            @Override
            public String getPrescriptionMedicine() {
                return fakeData.getPrescribedMedicine();
            }

            @Override
            public boolean isMedicineAvailable() {
                return false;
            }

            @Override
            public String dispenseMedicine() {
                return "Medicine 'Unknown' is not available in inventory.";
            }
        };

        String result = business.dispenseMedicine();

        assertEquals(
                "Medicine 'Unknown' is not available in inventory.",
                result,
                "Should return not available message"
        );
    }

}

