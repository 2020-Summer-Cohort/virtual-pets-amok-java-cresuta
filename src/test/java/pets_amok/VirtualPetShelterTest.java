package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    @Test
    public void createVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertNotNull(underTest);
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

    @Test
    public void checkThatWalkAllDogsMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Mya", new OrganicDog("Mya","an organic golden retriever dog"));
        underTest.admitHomelessVirtualPet("Robo Mya", new RoboticDog("Robo Mya", "a robotic golden retriever dog"));
        underTest.walkAllDogs();
        assertNotNull(underTest);
    }

    @Test
    public void checkThatCleanAllCagesMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Mya", new OrganicDog("Mya","an organic golden retriever dog"));
        underTest.cleanAllCages();
        assertNotNull(underTest);
    }

    @Test
    public void checkThatCleanAllLitterBoxesMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Lacy", new OrganicCat("Lacy","an organic himalayan cat"));
        underTest.cleanAllLitterBoxes();
        assertNotNull(underTest);
    }

    @Test
    public void checkThatOilAllRoboticPetsMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Robo Lacy", new RoboticCat("Lacy","a robotic himalayan cat"));
        underTest.admitHomelessVirtualPet("Robo Mya", new RoboticDog("Mya","a robotic golden retriever dog"));
        underTest.oilAllRoboticPets();
        assertNotNull(underTest);
    }

    @Test
    public void checkThatFeedOrganicPetsMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Mya", new OrganicDog("Mya","an organic golden retriever dog"));
        underTest.admitHomelessVirtualPet("Lacy", new OrganicCat("Lacy","an organic himalayan cat"));
        underTest.feedOrganicPets();
        assertNotNull(underTest);
    }

    @Test
    public void checkThatWaterOrganicPetsMethodWorks(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitHomelessVirtualPet("Mya", new OrganicDog("Mya","an organic golden retriever dog"));
        underTest.admitHomelessVirtualPet("Lacy", new OrganicCat("Lacy","an organic himalayan cat"));
        underTest.waterOrganicPets();
        assertNotNull(underTest);
    }
}
