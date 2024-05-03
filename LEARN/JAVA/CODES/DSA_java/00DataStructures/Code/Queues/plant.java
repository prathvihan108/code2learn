import java.util.Scanner;

class PlantWaterAutomationSystem {
    private static int moistureLevel = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check Moisture Level");
            System.out.println("2. Water Plant");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkMoistureLevel();
                    break;
                case 2:
                    waterPlant();
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkMoistureLevel() {
        if (moistureLevel < 30) {
            System.out.println("Soil moisture is low. Watering the plant...");
            waterPlant();
        } else {
            System.out.println("Soil moisture is sufficient. No need to water.");
        }
    }

    private static void waterPlant() {
        System.out.print("Enter the amount of water to be provided: ");
        Scanner scanner = new Scanner(System.in);
        int waterAmount = scanner.nextInt();

        if (waterAmount > 0) {
            moistureLevel += waterAmount;
            System.out.println("Plant watered successfully. New Moisture Level: " + moistureLevel);
        } else {
            System.out.println("Invalid water amount. Please enter a positive value.");
        }
    }
}
