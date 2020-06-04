package pets_amok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {
    protected Map<String, VirtualPet> virtualShelter = new HashMap<>();

    public Map<String,VirtualPet> availableVirtualPets() {
        return virtualShelter;
    }

    public VirtualPet showVirtualPet(String name){
       return virtualShelter.get(name);
    }

    public void feedOrganicPets() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).feedOrganicPet();
            }
        }
    }

    public void waterOrganicPets() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).waterOrganicPet();
            }
        }
    }

    public void adoptVirtualPet(String name) {
        virtualShelter.remove(name);
    }

    public void admitHomelessVirtualPet(String name, VirtualPet newVirtualPet) {
        virtualShelter.put(name, newVirtualPet);
    }

    public void play(String name){
        virtualShelter.get(name).play();
    }


    public void walkAllDogs() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanOrganicDogCage();
            }
        }
    }

    public void cleanAllLitterBoxes() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanOrganicCatLitterBox();
            }
        }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet pet : availableVirtualPets().values()) {
            if (pet instanceof Robotic) {
                ((Robotic) pet).oilRoboticPet();
            }
        }
    }

    public void updateVirtualPetShelter() {
        for (VirtualPet pet : virtualShelter.values()) {
            pet.updateVirtualPetFields();
        }
    }

    public void organicDogStatusChartHeader() {
        System.out.println("\nThis is the status of all the Organic Dogs: ");
        System.out.println("\nName      |Health  |Happiness  |Boredom  |Hunger  |Thirst  |Cage Waste");
        System.out.println("----------|--------|-----------|---------|--------|--------|--------");
        for (VirtualPet pet: availableVirtualPets().values()){
            if (pet instanceof OrganicDog){
                System.out.println(pet.getName() + "\t" + "\t" + "\t" + pet.getOverallHealth() + "\t" + "\t" + "\t" + pet.getHappiness() + "\t" + "\t" + "\t" + pet.getBoredom() + "\t" + "\t" + ((OrganicDog) pet).getHunger() + "\t" + "\t" + ((OrganicDog) pet).getThirst() + "\t" + "\t" + "\t" + ((OrganicDog) pet).getLevelOfWaste());
            }
        }
    }

    public void organicCatStatusChartHeader() {
        System.out.println("\nThis is the status of all the Organic Cats: ");
        System.out.println("\nName      |Health  |Happiness  |Boredom  |Hunger  |Thirst  |Litter Waste");
        System.out.println("----------|--------|-----------|---------|--------|--------|--------");
        for (VirtualPet pet: availableVirtualPets().values()){
            if (pet instanceof OrganicCat){
                System.out.println(pet.getName() + "\t" + "\t" + "\t" + pet.getOverallHealth() + "\t" + "\t" + pet.getHappiness() + "\t" + "\t" + pet.getBoredom() + "\t" + "\t" + "\t" + ((OrganicCat) pet).getHunger() + "\t" + "\t" + ((OrganicCat) pet).getThirst() + "\t" + "\t" + "\t" + ((OrganicCat) pet).getLevelOfWaste());
            }
        }
    }

    public void roboticDogStatusChartHeader() {
        System.out.println("\nThis is the status of all the Robotic Dogs: ");
        System.out.println("\nName      |Health  |Happiness  |Boredom |Oil Level");
        System.out.println("----------|--------|-----------|--------|--------");
        for (VirtualPet pet: availableVirtualPets().values()){
            if (pet instanceof RoboticDog){
                System.out.println(pet.getName() + "\t" + "\t" + pet.getOverallHealth() + "\t" + "\t" + pet.getHappiness() + "\t" + "\t" + "\t" + pet.getBoredom() + "\t" + "\t" + ((RoboticDog) pet).getOilMaintenanceLevel());
            }
        }
    }

    public void roboticCatStatusChartHeader() {
        System.out.println("\nThis is the status of all the Robotic Cats: ");
        System.out.println("\nName      |Health  |Happiness  |Boredom |Oil Level");
        System.out.println("----------|--------|-----------|--------|--------");
        for (VirtualPet pet: availableVirtualPets().values()){
            if (pet instanceof RoboticCat){
                System.out.println(pet.getName() + "\t" + "\t" + pet.getOverallHealth() + "\t" + "\t" + pet.getHappiness() + "\t" + "\t" + "\t" + pet.getBoredom() + "\t" + "\t" + ((RoboticCat) pet).getOilMaintenanceLevel());
            }
        }
    }

    // Organize each virtual pet status chart header into a single method to clean up code in main method of application
    public void virtualPetsStatusChartHeader(){
        organicDogStatusChartHeader();
        organicCatStatusChartHeader();
        roboticDogStatusChartHeader();
        roboticCatStatusChartHeader();
    }

    // Methods to simplify conditional statement body's for when userChoice = 6, 8, 9, or 10
    public void userChoiceEqualsSix(String petChoice){
        if (petChoice.equalsIgnoreCase("Mya")) {
            play("Mya");
            System.out.println("** You played with " + showVirtualPet("Mya").getName() + "! **");
        } else if (petChoice.equalsIgnoreCase("Lacy")) {
            play("Lacy");
            System.out.println("** You played with " + showVirtualPet("Lacy").getName() + "! **");
        } else if (petChoice.equalsIgnoreCase("Robo Mya")) {
            play("Robo Mya");
            System.out.println("** You played with " + showVirtualPet("Robo Mya").getName() + "! **");
        } else if (petChoice.equalsIgnoreCase("Robo Lacy")) {
            play("Robo Lacy");
            System.out.println("** You played with " + showVirtualPet("Robo Lacy").getName() + "! **");
        } else {
            play(petChoice);
            System.out.println("** You played with " + showVirtualPet(petChoice).getName() + "! **");
        }
    }

    public void userChoiceEqualsEight(String petChoice){
        if (petChoice.equalsIgnoreCase("Mya")) {
            System.out.println("** You adopted " + petChoice + "! **");
            adoptVirtualPet("Mya");
        } else if (petChoice.equalsIgnoreCase("Lacy")) {
            System.out.println("** You adopted " + petChoice + "! **");
            adoptVirtualPet("Lacy");
        } else if (petChoice.equalsIgnoreCase("Robo Mya")) {
            System.out.println("** You adopted " + petChoice + "! **");
            adoptVirtualPet("Robo Mya");
        } else if (petChoice.equalsIgnoreCase("Robo Lacy")) {
            System.out.println("** You adopted " + petChoice + "! **");
            adoptVirtualPet("Robo Lacy");
        } else {
            System.out.println("** You adopted " + petChoice + "! **");
            adoptVirtualPet(petChoice);
        }
    }

    public void userChoiceEqualsNine(int choice, String newAdmitName, String newAdmitDescription){
        Scanner input = new Scanner(System.in);
        if (choice == 1){
            VirtualPet newAdmit = new OrganicDog(newAdmitName,newAdmitDescription);
            admitHomelessVirtualPet(newAdmitName, newAdmit);
        } else if (choice == 2){
            VirtualPet newAdmit = new OrganicCat(newAdmitName,newAdmitDescription);
            admitHomelessVirtualPet(newAdmitName, newAdmit);
        } else if (choice == 3){
            VirtualPet newAdmit = new RoboticDog(newAdmitName,newAdmitDescription);
            admitHomelessVirtualPet(newAdmitName, newAdmit);
        } else if (choice == 4){
            VirtualPet newAdmit = new RoboticCat(newAdmitName,newAdmitDescription);
            admitHomelessVirtualPet(newAdmitName,newAdmit);
        }
    }

    public void userChoiceEqualsTen(String petChoice){
        if (petChoice.equalsIgnoreCase("Mya")) {
            System.out.println("** " + petChoice + ": " + showVirtualPet("Mya").getDescription() + ". **");
        } else if (petChoice.equalsIgnoreCase("Lacy")) {
            System.out.println("** " + petChoice + ": " + showVirtualPet("Lacy").getDescription() + ". **");
        } else if (petChoice.equalsIgnoreCase("Robo Mya")) {
            System.out.println("** " + petChoice + ": " + showVirtualPet("Robo Mya").getDescription() + ". **");
        } else if (petChoice.equalsIgnoreCase("Robo Lacy")) {
            System.out.println("** " + petChoice + ": " + showVirtualPet("Robo Lacy").getDescription() + ". **");
        } else {
            System.out.println("** " + petChoice + ": " + availableVirtualPets().get(petChoice).getDescription() + ". **");
        }
    }
}
