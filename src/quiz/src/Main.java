public class Main {
    public static void main (String[] args) {

    }

    public int legalCities(CameraInfo[] cameras, int code) {
        int count = 0;

        for (int i = 0; i < cameras.length; i++) {
            if (cameras[i].getCity() == code && !cameras[i].allGood()) {
                count++;
            }
        }

        return count;

    }
}