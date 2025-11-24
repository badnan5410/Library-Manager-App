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

    public static void delayTime() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String hidePassword(String password) {
        String hiddenPassword = "";

        for (int i = 0; i < password.length(); i++) {
            hiddenPassword += "*";
        }

        return hiddenPassword;
    }
}
