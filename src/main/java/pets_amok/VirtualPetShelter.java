package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> virtualShelter = new HashMap<>();

    public Collection<VirtualPet> availableVirtualPets() {
        return virtualShelter.values();
    }

    public void walkAllDogs() {
        for (VirtualPet pet :availableVirtualPets()){
            if (pet instanceof Dog){
                ((Dog) pet).walk();
            }
        }
    }

    public void cleanAllCages() {
        for(VirtualPet pet: availableVirtualPets()){
            if (pet instanceof OrganicDog){
                ((OrganicDog) pet).cleanOrganicPetCage();
            }
        }
    }

    public void oilAllRoboticPets() {
        for(VirtualPet pet: availableVirtualPets()){
            if (pet instanceof Robotic){
                ((Robotic) pet).oilRoboticPet();
            }
        }
    }
}
