package pets_amok;

public class RoboticCat extends Cat implements Robotic {

    private int oilMaintenanceLevel;

    public RoboticCat(String name, String description) {
        super(name, description);
        this.oilMaintenanceLevel = random.nextInt(75);
    }

    public int getOilMaintenanceLevel() {
        return oilMaintenanceLevel;
    }

    public void setOilMaintenanceLevel(int oilMaintenanceLevel) {
        this.oilMaintenanceLevel = oilMaintenanceLevel;
    }

    @Override
    public void oilRoboticPet() {
        oilMaintenanceLevel += random.nextInt(6);
    }

}
