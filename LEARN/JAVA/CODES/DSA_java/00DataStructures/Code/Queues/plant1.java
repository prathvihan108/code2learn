public class plant1{

    // Simulating soil moisture sensor readings
    private static int soilMoistureLevel = 50; // Initial moisture level

    public static void main(String[] args) {
        // Check soil moisture and water the plant if needed
        checkSoilMoisture();
    }

    private static void checkSoilMoisture() {
        if (soilMoistureLevel < 30) {
            // Soil is dry, water the plant
            System.out.println("Soil moisture is low. Watering the plant...");
            waterPlant();
        } else {
            // Soil moisture is sufficient
            System.out.println("Soil moisture is sufficient. No need to water.");
        }
    }

    private static void waterPlant() {
        // Simulating the watering process
        System.out.println("Watering the plant...");
        
        // Update soil moisture level after watering
        soilMoistureLevel = 80; // Assuming the plant is adequately watered
    }
}