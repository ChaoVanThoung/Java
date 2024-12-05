package arraylesson;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row,col, option;
        int floorNum, roomNum;
        System.out.print("Enter the row number: ");
        row = scanner.nextInt();
        System.out.print("Enter the column number: ");
        col = scanner.nextInt();
        String[][]  condo = new String[row][col];

        do {
            System.out.println("******* Welcome to my condo *******");
            System.out.println("1. Buy Condo");
            System.out.println("2. Sell Condo");
            System.out.println("3. Show information");
            System.out.println("4. Search Condo");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("------- Buy Condo -------");
                    System.out.println("Enter the floor number(1-" + row + "): ");
                    floorNum = scanner.nextInt();
                    System.out.println("Enter the room number(1-" + col + "): ");
                    roomNum = scanner.nextInt();
                    System.out.print("Enter your name to buy condo: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    condo[floorNum - 1][roomNum - 1] = name;
                    break;
                }
                case 2: {
                    System.out.println("------- Sell Condo -------");
                    System.out.println("Enter the floor number(1-" + row + "): ");
                    floorNum = scanner.nextInt();
                    System.out.println("Enter the room number(1-" + col + "): ");
                    roomNum = scanner.nextInt();
                    condo[floorNum - 1][roomNum - 1] = null;
                    break;
                }
                case 3: {
                    System.out.println("------- Show information -------");

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%-15s", condo[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("------- Search Condo -------");
                    System.out.println("Enter the floor number(1-" + row + "): ");
                    floorNum = scanner.nextInt();
                    System.out.println("Enter the room number(1-" + col + "): ");
                    roomNum = scanner.nextInt();
                    for (int i = 0; i < floorNum; i++) {
                        for (int j = 0; j < roomNum; j++) {
                            if (condo[i][j] == condo[floorNum - 1][roomNum - 1]) {
                                System.out.println();
                                System.out.println("The Condo has already been bought by " + condo[i][j]);
                            } else {
                                System.out.println("The Condo has not already been bought by " + condo[i][j]);
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Exit the program");
                    break;
                }
            }
        }while(option != 5);
    }
}
