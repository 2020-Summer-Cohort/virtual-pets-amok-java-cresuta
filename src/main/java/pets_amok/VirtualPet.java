package pets_amok;

import java.util.Random;

public class VirtualPet {

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
        this.happiness += random.nextInt(75);
        this.sadness += random.nextInt(75);
        this.boredom += random.nextInt(75);

    }
}
