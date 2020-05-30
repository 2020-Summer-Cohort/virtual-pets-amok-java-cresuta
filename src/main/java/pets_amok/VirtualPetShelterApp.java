package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter wallysShelter = new VirtualPetShelter();
        VirtualPet mya = new OrganicDog("Mya", "an organic golden retriever dog");
        VirtualPet lacy = new OrganicCat("Lacy", "an organic himilayan cat");
        VirtualPet roboMya = new RoboticDog("Robo Mya", "a robotic golden retriever dog");
        VirtualPet roboLacy = new RoboticCat("Robo Lacy", "a robotic himilayan cat");
        wallysShelter.admitHomelessVirtualPet("Mya", mya);
        wallysShelter.admitHomelessVirtualPet("Lacy", lacy);
        wallysShelter.admitHomelessVirtualPet("Robo Mya", roboMya);
        wallysShelter.admitHomelessVirtualPet("Robo Lacy", roboLacy);
        System.out.println("\nThank you for volunteering at Wally's Virtual Pet Shelter!");
        String petChoice;
        int userChoice;
        boolean isShelterOpen = true;
        while (isShelterOpen) {
            wallysShelter.organicDogStatusChartHeader();
            wallysShelter.organicCatStatusChartHeader();
            wallysShelter.roboticDogStatusChartHeader();
            wallysShelter.roboticCatStatusChartHeader();
            displayInstructions();
            userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("You feed all the organic pets!");
                wallysShelter.feedOrganicPets();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 2) {
                System.out.println("You water all the organic pets!");
                wallysShelter.waterOrganicPets();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 3) {
                System.out.println("You clean all the organic dog cages!");
                wallysShelter.cleanAllCages();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 4) {
                System.out.println("You clean all the organic cat litter boxes!");
                wallysShelter.cleanAllLitterBoxes();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 5) {
                System.out.println("You oiled all the robotic pets!");
                wallysShelter.oilAllRoboticPets();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 6) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(wallysShelter.availableVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                if (petChoice.equalsIgnoreCase("Mya")) {
                    wallysShelter.play("Mya");
                    System.out.println("You played with " + mya.getName() + "!");
                } else if (petChoice.equalsIgnoreCase("Lacy")) {
                    wallysShelter.play("Lacy");
                    System.out.println("You played with " + lacy.getName() + "!");
                } else if (petChoice.equalsIgnoreCase("Robo Mya")) {
                    wallysShelter.play("Robo Mya");
                    System.out.println("You played with " + roboMya.getName() + "!");
                } else if (petChoice.equalsIgnoreCase("Robo Lacy")) {
                    wallysShelter.play("Robo Lacy");
                    System.out.println("You played with " + roboLacy.getName() + "!");
                } else {
                    wallysShelter.play(petChoice);
                    System.out.println("You played with " + petChoice + "!");
                }
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 7) {
                System.out.println("You walked all the dogs!");
                wallysShelter.walkAllDogs();
            } else if (userChoice == 8) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(wallysShelter.availableVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                if (petChoice.equalsIgnoreCase("Mya")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adoptVirtualPet("Mya");
                } else if (petChoice.equalsIgnoreCase("Lacy")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adoptVirtualPet("Lacy");
                } else if (petChoice.equalsIgnoreCase("Robo Mya")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adoptVirtualPet("Robo Mya");
                } else if (petChoice.equalsIgnoreCase("Robo Lacy")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adoptVirtualPet("Robo Lacy");
                } else {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adoptVirtualPet(petChoice);
                }
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 9) {
                System.out.println("Please provide a name and description for the pet you would like to admit.");
                System.out.println("Name: ");
                input.nextLine();
                String newAdmitName = input.nextLine();
                System.out.println("Description: ");
                input.next();
                String newAdmitDescription = input.nextLine();
                System.out.println("What type of pet is " + newAdmitName + "?");
                System.out.println("Press 1 for Organic Dog" + "\nPress 2 for Organic Cat" + "\nPress 3 for Robotic Dog" + "\nPress 4 for Robotic Cat");
                int choice = input.nextInt();
                if (choice == 1){
                    VirtualPet newAdmit = new OrganicDog(newAdmitName,newAdmitDescription);
                    wallysShelter.admitHomelessVirtualPet(newAdmitName, newAdmit);
                } else if (choice == 2){
                    VirtualPet newAdmit = new OrganicCat(newAdmitName,newAdmitDescription);
                    wallysShelter.admitHomelessVirtualPet(newAdmitName, newAdmit);
                } else if (choice == 3){
                    VirtualPet newAdmit = new RoboticDog(newAdmitName,newAdmitDescription);
                    wallysShelter.admitHomelessVirtualPet(newAdmitName, newAdmit);
                } else if (choice == 4){
                    VirtualPet newAdmit = new RoboticCat(newAdmitName,newAdmitDescription);
                    wallysShelter.admitHomelessVirtualPet(newAdmitName,newAdmit);
                }
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 10){
                goodbyeMessage();
                break;
            }
        }
    }

    public static void displayInstructions() {
        System.out.println("\nWhat would you like to do next?");
        System.out.println("1. Feed all the organic pets");
        System.out.println("2. Water all the organic pets");
        System.out.println("3. Clean all the organic dog cages");
        System.out.println("4. Clean all the organic cat litter boxes");
        System.out.println("5. Oil all the robotic pets");
        System.out.println("6. Play with a pet");
        System.out.println("7. Walk all the dogs");
        System.out.println("8. Adopt a pet");
        System.out.println("9. Admit a pet");
        System.out.println("10. Quit");
    }

    public static void goodbyeMessage() {
        System.out.println("Wally's Virtual Pet Shelter is now closed for the evening.");
        System.out.println("Thanks for volunteering today.");
        System.out.println("Goodbye!");
    }
}
