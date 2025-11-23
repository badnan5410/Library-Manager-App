package helper;

/**
 * Contains helper functions to use in different parts of my code.
 */

public class Helper {

    public static void delayTime(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
