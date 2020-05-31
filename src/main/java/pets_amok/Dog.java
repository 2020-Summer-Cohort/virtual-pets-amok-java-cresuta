package pets_amok;

public abstract class Dog extends VirtualPet {

    public Dog(String name, String description) {
        super(name, description);
    }

    public void walk(){
        setHappiness(getHappiness() + 10);
        setOverallHealth(getOverallHealth() + 10);
    }

}
