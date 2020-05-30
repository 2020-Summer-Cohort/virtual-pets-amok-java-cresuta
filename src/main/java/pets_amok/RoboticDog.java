package pets_amok;

public class RoboticDog extends Dog implements Robotic {

    private int oilMaintenanceLevel;

    public RoboticDog(String name, String description) {
        super(name, description);
        this.oilMaintenanceLevel = 30;
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
