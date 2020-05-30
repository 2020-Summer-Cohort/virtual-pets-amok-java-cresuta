package pets_amok;

public class OrganicCat extends Cat implements Organic{

    private int hunger;
    private int thirst;
    private int levelOfWaste;

    public OrganicCat(String name, String description) {
        super(name, description);
        this.hunger = 30;
        this.thirst = 30;
        this.levelOfWaste = 15;
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
