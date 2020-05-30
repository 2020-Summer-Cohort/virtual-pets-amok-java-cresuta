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

    public void cleanOrganicDogCage() {
        levelOfWaste = 0;
    }

    @Override
    public void updateVirtualPetFields(){
        this.hunger += 5;
        this.thirst += 5;
        this.levelOfWaste += 5;
    }

    @Override
    public void feedOrganicPet() {
        hunger -= 10;
        thirst += random.nextInt(7);
        levelOfWaste += random.nextInt(7);
    }

    @Override
    public void waterOrganicPet() {
        thirst -= 10;
        hunger += random.nextInt(7);
        levelOfWaste += random.nextInt(7);
    }
}


