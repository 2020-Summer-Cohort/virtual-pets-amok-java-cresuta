package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter wallysShelter = new VirtualPetShelter();
        wallysShelter.admitHomelessVirtualPet("Mya", new OrganicDog("Mya","an organic golden retriever dog"));
        wallysShelter.admitHomelessVirtualPet("Lacy", new OrganicCat("Lacy", "an organic himilayan cat"));
        wallysShelter.admitHomelessVirtualPet("Robo Mya", new RoboticDog("Robo Mya", "a robotic golden retriever dog"));
        wallysShelter.admitHomelessVirtualPet("Robo Lacy", new RoboticCat("Robo Lacy", "a robotic himilayan cat"));
        System.out.println("\nThank you for volunteering at Wally's Virtual Pet Shelter!");
        String petChoice;
        int userChoice;
        boolean isShelterOpen = true;
        while (isShelterOpen) {
            wallysShelter.virtualPetsStatusChartHeader();
            displayInstructions();
            userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("** You feed all the organic pets! **");
                wallysShelter.feedOrganicPets();
            } else if (userChoice == 2) {
                System.out.println("** You water all the organic pets! **");
                wallysShelter.waterOrganicPets();
            } else if (userChoice == 3) {
                System.out.println("** You clean all the organic dog cages! **");
                wallysShelter.cleanAllCages();
            } else if (userChoice == 4) {
                System.out.println("** You clean all the organic cat litter boxes! **");
                wallysShelter.cleanAllLitterBoxes();
            } else if (userChoice == 5) {
                System.out.println("** You oiled all the robotic pets! **");
                wallysShelter.oilAllRoboticPets();
            } else if (userChoice == 6) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(wallysShelter.availableVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                wallysShelter.userChoiceEqualsSix(petChoice);
            } else if (userChoice == 7) {
                System.out.println("** You walked all the dogs! **");
                wallysShelter.walkAllDogs();
            } else if (userChoice == 8) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(wallysShelter.availableVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                wallysShelter.userChoiceEqualsEight(petChoice);
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
                wallysShelter.userChoiceEqualsNine(choice,newAdmitName,newAdmitDescription);
            } else if (userChoice == 10) {
                System.out.println("\n" + wallysShelter.availableVirtualPets().keySet());
                System.out.println("Which pet would you like to know more about?");
                input.nextLine();
                petChoice = input.nextLine();
                wallysShelter.userChoiceEqualsTen(petChoice);
            } else if (userChoice == 11){
                goodbyeMessage();
                break;
            }
            wallysShelter.updateVirtualPetShelter();
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
        System.out.println("10. Read a description about a pet");
        System.out.println("11. Quit");
    }

    public static void goodbyeMessage() {
        System.out.println("\nWally's Virtual Pet Shelter is now closed for the evening.");
        System.out.println("Thanks for volunteering today.");
        System.out.println("Goodbye!");
    }

}
