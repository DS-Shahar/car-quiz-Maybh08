public class Main {
    public static void main (String[] args) {

    }

    public int legalCities(CameraInfo[] cameras) {
        int count = 0;
        int[] cityCodeArr = new int[100];

        for (int i = 0; i < cameras.length; i++) {
            if ( cameras[i].allGood() == false ) {
                cityCodeArr[ cameras[i].getCity() ] = -1;
            }
        }

        for (int i = 0; i < cityCodeArr.length; i++) {
            if (cityCodeArr[i] == 0) {
                count++;
            }
        }
        return count;

    }
}