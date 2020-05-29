package pets_amok;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    //TDD for creating classes that aren't abstract
    @Test
    public void createOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
    }

    @Test
    public void createOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
    }

    @Test
    public void createRoboticCat(){
        RoboticCat underTest = new RoboticCat("Lacy","a robotic cat");
    }

    @Test
    public void createRoboticDog(){
        RoboticDog underTest = new RoboticDog("Mya","a robotic dog");
    }


}
