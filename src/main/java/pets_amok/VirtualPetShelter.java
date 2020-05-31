package pets_amok;

import java.util.HashMap;
import java.util.Map;

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
}
