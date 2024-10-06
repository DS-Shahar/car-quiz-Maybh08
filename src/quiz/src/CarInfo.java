public class CarInfo {
    private String id;
    private boolean privateCar;
    private int speed;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPrivateCar() {
        return privateCar;
    }

    public void setPrivateCar(boolean privateCar) {
        this.privateCar = privateCar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean illegal(int maxSpeed) {
        if ( this.speed < maxSpeed || this.privateCar) // I confused < with >
            return true;
        else
            return false;
    }
}