package main;

import java.util.Scanner;

public class Main {
    public static int STATE;
    public static final int END_STATE = 0;
    public static final int MENU_STATE = 1;

    static Scanner scanner = new Scanner(System.in);

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
                delayTime(750);
                System.out.println("\n\nProcessing request...");
                delayTime(750);
                System.out.println("\n\nExiting program...");
                delayTime(750);
                STATE = END_STATE;
                break;
            default:
                delayTime(750);
                System.out.println("\n\nInvalid input, please try again.");
                delayTime(750);
                break;
        }
    }
    
    private static int displayMenu() {
        delayTime(750);
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

    public static void delayTime(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
