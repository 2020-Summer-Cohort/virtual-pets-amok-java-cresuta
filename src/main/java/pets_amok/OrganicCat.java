package pets_amok;

public class OrganicCat extends Cat implements Organic {

    private int hunger;
    private int thirst;
    private int levelOfWaste;

    public OrganicCat(String name, String description) {
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

    public void cleanOrganicCatLitterBox(){
        levelOfWaste = 0;
    }

    @Override
    public void updateVirtualPetFields(){
        this.hunger += random.nextInt(7);
        this.thirst += random.nextInt(7);
        this.levelOfWaste += random.nextInt(7);
    }

    @Override
    public void feedOrganicPet() {
        hunger -= 15;
        thirst += 5;
        levelOfWaste += 10;
    }

    @Override
    public void waterOrganicPet() {
        thirst -= 15;
        hunger += 5;
        levelOfWaste += 10;
    }
}
