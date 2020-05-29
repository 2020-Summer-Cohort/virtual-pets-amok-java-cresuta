package pets_amok;

public class OrganicDog extends Dog implements Organic {

    private int hunger;
    private int thirst;
    private int levelOfWaste;

    public OrganicDog(String name, String description) {
        super(name, description);
        this.hunger = random.nextInt(75);
        this.thirst = random.nextInt(75);
        this.levelOfWaste = random.nextInt(75);
    }

    public void cleanOrganicPetCage(){
        levelOfWaste = 0;
    }

    @Override
    public void feedOrganicPet() {
        hunger -= random.nextInt(6);
        thirst += random.nextInt(6);
        levelOfWaste += random.nextInt(6);
    }

    @Override
    public void waterOrganicPet() {
        thirst -= random.nextInt(6);
        hunger += random.nextInt(6);
        levelOfWaste += random.nextInt(6);
    }

    @Override
    public void tick() {

    }
}


