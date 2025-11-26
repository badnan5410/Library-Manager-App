package main;

import helper.Helper;

import java.util.Random;
import java.util.Scanner;

/**
 * Instantiates an Admin object, either new or existing.
 */

public class Admin {
    private String name;
    private int id;
    private String userType;
    private String email;
    private String password;

    private Scanner scanner;

    public Admin(Scanner scanner) {
        this.scanner = scanner;

        do {
            Helper.delayTime();
            System.out.print("\n\nAre you a new user or existing user? Press (1) for new or (2) for existing: ");
            userType = scanner.nextLine().trim();

        } while (!userType.equals("1") && !userType.equals("2"));

        if (userType.equals("1")) {
            setupNewAdmin();

        } else {
            //TODO
        }
    }

    private void setupNewAdmin() {
        name = getName();
        email = getEmail();
        password = getPassword();
        id = generateId();

        Helper.delayTime();
        System.out.printf("\n\nWelcome %s!", name);
        Helper.delayTime();
        System.out.printf("\n\nPlease use your email address [%s] as your username when logging in.", email);
        Helper.delayTime();
        System.out.printf("\n\nLog in using your password [%s], make sure to write it down somewhere so you don't forget it!", Helper.hidePassword(password));
        Helper.delayTime();
        System.out.printf("\n\nHere is your unique admin ID [%d].\n\n", id);
    }

    private void setupOldAdmin() {}

    public String getName() {
        String adminName;

        do {
            System.out.print("\n\nPlease enter your first name: ");
            adminName = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (adminName.length() < 3);

        Helper.delayTime(800);
        return adminName;
    }

    public int generateId() {
        Random rand = new Random();

        return 10000000 + rand.nextInt(90000000);
    }

    public String getEmail() {
        String adminEmail;

        do {
            System.out.print("\n\nPlease enter a valid email address: ");
            adminEmail = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (!adminEmail.contains("@") || !adminEmail.contains(".") || adminEmail.startsWith("@") || adminEmail.endsWith("@"));

        Helper.delayTime(800);
        return adminEmail;
    }

    public String getPassword() {
        String adminPassword;

        do {
            System.out.print("\n\nPlease create a password (make sure it is greater than 7 characters and it includes numbers and special characters): ");
            adminPassword = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (adminPassword.length() < 8 || !adminPassword.matches(".*\\d.*") || !adminPassword.matches(".*[^a-zA-Z0-9].*") || !adminPassword.matches(".*[A-Z].*"));

        Helper.delayTime(800);
        return adminPassword;
    }

    public int getID() {
        return id;
    }
}
