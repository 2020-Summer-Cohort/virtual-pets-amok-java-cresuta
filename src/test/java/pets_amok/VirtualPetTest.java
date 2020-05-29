package pets_amok;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    //TDD for creating all classes
    @Test
    public void createVirtualPet() {
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
    }

    @Test
    public void createCat(){
        Cat underTest = new Cat("Lacy","a general cat");
    }

    @Test
    public void createDog(){
        Dog underTest = new Dog("Mya", "a general dog");
    }

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

    //TDD for creating VirtualPet getter/setter methods
    @Test
    public void getName(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        String result = underTest.getName();
    }

    @Test
    public void setName(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setName("Virtual Pet");
    }

    @Test
    public void getDescription(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        String result = underTest.getDescription();
    }

    @Test
    public void setDescription(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setDescription("a general virtual pet");
    }

    @Test
    public void getHappiness(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        int result = underTest.getHappiness();
    }

    @Test
    public void setHappiness(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setHappiness(50);
    }

    @Test
    public void getSadness(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        int result = underTest.getSadness();
    }

    @Test
    public void setSadness(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setSadness(50);
    }

    @Test
    public void getBoredom(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        int result = underTest.getBoredom();
    }

    @Test
    public void setBoredom(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setBoredom(50);
    }

    @Test
    public void getOverallHealth(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        int result = underTest.getOverallHealth();
    }

    @Test
    public void setOverallHealth(){
        VirtualPet underTest = new VirtualPet("Virtual Pet", "a general virtual pet");
        underTest.setOverallHealth(50);
    }

}
