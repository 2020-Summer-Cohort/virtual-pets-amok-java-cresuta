package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VirtualPetTest {

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

    @Test
    public void getOilMaintenanceLevelForRoboticDog(){
        RoboticDog underTest = new RoboticDog("Mya","a robotic dog");
        int result = underTest.getOilMaintenanceLevel();
        assertEquals(50,result);
    }

    @Test
    public void setOilMaintenanceLevelForRoboticDog() {
        RoboticDog underTest = new RoboticDog("Mya", "a robotic dog");
        underTest.setOilMaintenanceLevel(30);
    }

    @Test
    public void getOilMaintenanceLevelForRoboticCat(){
        RoboticCat underTest = new RoboticCat("Lacy","a robotic cat");
        int result = underTest.getOilMaintenanceLevel();
        assertEquals(50,result);
    }

    @Test
    public void setOilMaintenanceLevelForRoboticCat(){
        RoboticCat underTest = new RoboticCat("Lacy","a robotic cat");
        underTest.setOilMaintenanceLevel(30);
    }

    @Test
    public void getHungerForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        int result = underTest.getHunger();
        assertEquals(30,result);
    }

    @Test
    public void setHungerForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        underTest.setHunger(30);
    }

    @Test
    public void getThirstForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        int result = underTest.getThirst();
        assertEquals(30,result);
    }

    @Test
    public void setThirstForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        underTest.setThirst(30);
    }

    @Test
    public void getLevelOfWasteForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        int result = underTest.getLevelOfWaste();
        assertEquals(15,result);
    }

    @Test
    public void setLevelOfWasteForOrganicDog(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        underTest.setLevelOfWaste(15);
    }

    @Test
    public void getHungerForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        int result = underTest.getHunger();
        assertEquals(30,result);
    }

    @Test
    public void setHungerForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        underTest.setHunger(30);
    }

    @Test
    public void getThirstForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        int result = underTest.getThirst();
        assertEquals(30,result);
    }

    @Test
    public void setThirstForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        underTest.setThirst(30);
    }

    @Test
    public void getLevelOfWasteForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        int result = underTest.getLevelOfWaste();
        assertEquals(15,result);
    }

    @Test
    public void setLevelOfWasteForOrganicCat(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        underTest.setLevelOfWaste(15);
    }

    @Test
    public void letsGetOrganicDogName(){
        OrganicDog underTest = new OrganicDog("Mya","an organic dog");
        String result = underTest.getName();
        assertEquals("Mya",result);
    }

    @Test
    public void letsGetOrganicCatName(){
        OrganicCat underTest = new OrganicCat("Lacy","an organic cat");
        String result = underTest.getName();
        assertEquals("Lacy",result);
    }

    @Test
    public void letsGetRoboticCatName(){
        OrganicCat underTest = new OrganicCat("Robo Lacy","a robotic cat");
        String result = underTest.getName();
        assertEquals("Robo Lacy",result);
    }

    @Test
    public void checkThatOrganicDogIsADog(){
        Dog underTest = new OrganicDog("Mya","an organic dog");
        assertNotNull(underTest);
    }

    @Test
    public void checkThatOrganicCatIsACat(){
        Cat underTest = new OrganicCat("Lacy","an organic cat");
        assertNotNull(underTest);
    }

    @Test
    public void checkThatRoboticDogIsADog(){
        Dog underTest = new RoboticDog("Robo Mya","a robotic dog");
        assertNotNull(underTest);
    }

    @Test
    public void checkThatRoboticCatIsACat(){
        Dog underTest = new RoboticDog("Robo Lacy","a robotic cat");
        assertNotNull(underTest);
    }
}
