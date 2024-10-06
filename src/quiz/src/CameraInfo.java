public class CameraInfo {
    private int city;
    private int maxSpeed;
    private CarInfo[] cars;

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarInfo[] getCars() {
        return cars;
    }

    public void setCars(CarInfo[] cars) {
        this.cars = cars;
    }

    public boolean allGood() {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null && this.cars[i].illegal(maxSpeed)) {
                return false;
            }
        }
        return true;
    }
}
