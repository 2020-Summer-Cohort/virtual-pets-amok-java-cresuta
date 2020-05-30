package pets_amok;

import java.util.Random;

public abstract class VirtualPet {

    private String name;
    private String description;
    private int happiness;
    private int sadness;
    private int boredom;
    private int overallHealth;

    Random random = new Random();

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.happiness += 30;
        this.sadness += 30;
        this.boredom += 30;
        this.overallHealth += 30;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getSadness() {
        return sadness;
    }

    public void setSadness(int sadness) {
        this.sadness = sadness;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getOverallHealth() {
        return overallHealth;
    }

    public void setOverallHealth(int overallHealth) {
        this.overallHealth = overallHealth;
    }

    public void play(){
        happiness += random.nextInt(11);
        sadness -= random.nextInt(6);
        boredom -= random.nextInt(6);
    }

    public abstract void tick();
}
