package main;

import helper.Helper;

import java.util.Scanner;

/**
 * Entry point into my app
 *
 * Responsible for:
 * - creating the Library object that stores all the books
 * - displaying a menu screen with different options
 *
 */

public class Main {
    public static int STATE;
    public static final int END_STATE = 0;
    public static final int MENU_STATE = 1;

    static Scanner scanner = new Scanner(System.in);
    static helper.Helper h = new Helper();

    static int menuItem;

    public static void main(String[] args) {
        STATE = MENU_STATE;

        while (STATE != END_STATE) {

            switch(STATE) {
                case MENU_STATE:
                    runMenuState();
                    break;
            }
        }
    }

    private static void runMenuState() {
        menuItem = displayMenu();

        switch(menuItem) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7:
                h.delayTime(750);
                System.out.println("\n\nProcessing request...");
                h.delayTime(750);
                System.out.println("\n\nExiting program...");
                h.delayTime(750);
                STATE = END_STATE;
                break;
            default:
                h.delayTime(750);
                System.out.println("\n\nInvalid input, please try again.");
                h.delayTime(750);
                break;
        }
    }
    
    private static int displayMenu() {
        h.delayTime(750);
        System.out.println("\n\n");
        System.out.println("""
                ### Menu ###
                
                1. Search Book
                2. Borrow Book
                3. Return Book
                4. Add Book
                5. Add Member
                6. Search Member
                7. Exit App
                """);

        System.out.print("Please select an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
