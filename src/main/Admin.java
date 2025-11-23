package main;

import helper.Helper;

import java.util.Random;
import java.util.Scanner;

public class Admin {
    String adminName;
    int adminID;
    String adminType;

    static Scanner scanner = new Scanner(System.in);

    public Admin() {

        helper.Helper h = new Helper();

        do {
            Helper.delayTime(750);
            System.out.print("\n\nAre you a new user or existing user? Press (1) for new or (2) for existing: ");
            adminType = scanner.nextLine().trim();

        } while (!adminType.equals("1") && !adminType.equals("2"));

        if (adminType.equals("1")) {
            Helper.delayTime(750);
            System.out.println("\n\nWelcome new admin!");
            adminName = getAdminName();
            adminID = getAdminId();

            Helper.delayTime(750);
            System.out.printf("\n\nName: %s", adminName);
            System.out.printf("\nID: %d", adminID);
        }
    }

    private static String getAdminName() {
        String adminName;

        do {
            System.out.print("\n\nPlease enter your first name: ");
            adminName = scanner.nextLine();
        } while (adminName.length() < 3);

        return adminName;
    }

    private static int getAdminId() {
        Random rand = new Random();

        return 10000000 + rand.nextInt(90000000);
    }

}
