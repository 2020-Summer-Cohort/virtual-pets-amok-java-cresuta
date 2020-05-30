package pets_amok;

public class OrganicDog extends Dog implements Organic {

    private int hunger;
    private int thirst;
    private int levelOfWaste;

    public OrganicDog(String name, String description) {
        super(name, description);
        this.hunger = 30;
        this.thirst = 30;
        this.levelOfWaste = 15;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getLevelOfWaste() {
        return levelOfWaste;
    }

    public void setLevelOfWaste(int levelOfWaste) {
        this.levelOfWaste = levelOfWaste;
    }

    public void cleanOrganicPetCage() {
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


