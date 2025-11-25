package main;

import helper.Helper;

import java.util.Random;
import java.util.Scanner;

/**
 * Instantiates an Admin object, either new or existing.
 */

public class Admin {
    String adminName;
    int adminID;
    String adminType;
    String adminEmail;
    String adminPassword;

    private Scanner scanner;

    public Admin(Scanner scanner) {
        this.scanner = scanner;

        do {
            Helper.delayTime();
            System.out.print("\n\nAre you a new user or existing user? Press (1) for new or (2) for existing: ");
            adminType = scanner.nextLine().trim();

        } while (!adminType.equals("1") && !adminType.equals("2"));

        if (adminType.equals("1")) {
            setupNewAdmin();

        } else {
            //TODO
        }
    }

    private void setupNewAdmin() {
        Helper.delayTime();
        adminName = getAdminName();
        Helper.delayTime();
        adminEmail = getAdminEmail();
        Helper.delayTime();
        adminPassword = getAdminPassword();
        Helper.delayTime();
        adminID = getAdminId();

        Helper.delayTime();
        System.out.printf("\n\nWelcome %s!", adminName);
        Helper.delayTime();
        System.out.printf("\n\nPlease use your email address [%s] as your username when logging in.", adminEmail);
        Helper.delayTime();
        System.out.printf("\n\nLog in using your password [%s], make sure to write it down somewhere so you don't forget it!", Helper.hidePassword(adminPassword));
        Helper.delayTime();
        System.out.printf("\n\nHere is your unique admin ID [%d].", adminID);
    }

    private void setupOldAdmin() {}

    private String getAdminName() {
        String adminName;

        do {
            System.out.print("\n\nPlease enter your first name: ");
            adminName = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (adminName.length() < 3);

        Helper.delayTime(800);
        return adminName;
    }

    private int getAdminId() {
        Random rand = new Random();

        return 10000000 + rand.nextInt(90000000);
    }

    private String getAdminEmail() {
        String adminEmail;

        do {
            System.out.print("\n\nPlease enter a valid email address: ");
            adminEmail = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (!adminEmail.contains("@") || !adminEmail.contains(".") || adminEmail.startsWith("@") || adminEmail.endsWith("@"));

        Helper.delayTime(800);
        return adminEmail;
    }

    private String getAdminPassword() {
        String adminPassword;

        do {
            System.out.print("\n\nPlease create a password (make sure it is greater than 7 characters and it includes numbers and special characters): ");
            adminPassword = scanner.nextLine().trim();
            Helper.delayTime(800);
        } while (adminPassword.length() < 8 || !adminPassword.matches(".*\\d.*") || !adminPassword.matches(".*[^a-zA-Z0-9].*") || !adminPassword.matches(".*[A-Z].*"));

        Helper.delayTime(800);
        return adminPassword;
    }
}
