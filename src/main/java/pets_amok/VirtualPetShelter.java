package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    protected Map<String, VirtualPet> virtualShelter = new HashMap<>();

    public Collection<VirtualPet> availableVirtualPets() {
        return virtualShelter.values();
    }

    public VirtualPet showVirtualPet(String name){
       return virtualShelter.get(name);
    }

    public void feedOrganicPets() {
        for (VirtualPet pet : availableVirtualPets()) {
            if (pet instanceof Organic) {
                ((Organic) pet).feedOrganicPet();
            }
        }
    }

    public void waterOrganicPets() {
        for (VirtualPet pet : availableVirtualPets()) {
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
        for (VirtualPet pet : availableVirtualPets()) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : availableVirtualPets()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanOrganicDogCage();
            }
        }
    }

    public void cleanAllLitterBoxes() {
        for (VirtualPet pet : availableVirtualPets()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanOrganicCatLitterBox();
            }
        }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet pet : availableVirtualPets()) {
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

}
