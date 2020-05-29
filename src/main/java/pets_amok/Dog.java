package pets_amok;

public abstract class Dog extends VirtualPet {

    public Dog(String name, String description) {
        super(name, description);
    }

    public void walk(){
        setHappiness(getHappiness() + random.nextInt(6));
    }

    @Override
    public void tick(){

    }

}
