package pets_amok;

import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    @Test
    public void createVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void createWalkAllDogsMethod(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.walkAllDogs();
    }

    @Test
    public void createCleanAllDogCagesMethod(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.cleanAllCages();
    }

    @Test
    public void createOilAllRoboticPetsMethod(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.oilAllRoboticPets();
    }


}
