package utils;

public class WaitUtils {

    public static void sleepSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
