package arraylesson;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, col, option;
        String r,c;
        int floorNum, roomNum;
        int value = 0;

        while (true) {
            try{
                System.out.print("Enter the row number: ");
                r = scanner.nextLine();
                row = Integer.parseInt(r);
                if (row <= value){
                    System.out.println("Row must be greater than 0 ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Row must be number");
            }
        }

        while (true){
            try{
                System.out.print("Enter the column number: ");
                c = scanner.nextLine();
                col = Integer.parseInt(c);
                if (col <= value){
                    System.out.println("Column must be greater than 0 ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Column must be number");
            }
        }




        String[][] condo = new String[row][col];
        for (int i = 0; i < 3 ; i++){
            System.out.println();
        }
        System.out.println("====<<You have successfully setup condo! >====");
        System.out.println("Total Room: " + (row * col) + " rooms");
        System.out.println("Total Flore: " + row + "flores");
        System.out.println("Room in each floor: " + col + "rooms");

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
                    scanner.nextLine();
                    while(true){
                        try {
                            System.out.print("Enter the floor number(1-" + row + "): ");
                            String floor = scanner.nextLine();
                            floorNum = Integer.parseInt(floor);
                            if (floorNum <= value){
                                System.out.println("Floor number must be greater than 0");
                            } else break;
                        } catch (NumberFormatException e) {
                            System.out.println("Floor number must be number");
                        }
                    }

                    while(true){
                        try {
                            System.out.print("Enter the room number(1-" + col + "): ");
                            String room = scanner.nextLine();
                            roomNum= Integer.parseInt(room);
                            if (roomNum <= value){
                                System.out.println("Room number must be greater than 0");
                            } else break;
                        } catch (NumberFormatException e) {
                            System.out.println("Room number must be number");
                        }
                    }

                    if (condo[floorNum - 1][roomNum - 1] == null) {
                        System.out.print("Enter your name to buy condo: ");
                        String name = scanner.nextLine();
                        condo[floorNum - 1][roomNum - 1] = name;
                    } else {
                        System.out.println("Sorry! This room already has an owner!");
                        System.out.println("Owner name: " + (condo[floorNum - 1][roomNum - 1]));
                    }
                    break;
                }
                case 2: {
                    System.out.println("------- Sell Condo -------");
                    scanner.nextLine();
                    while (true) {
                        try{
                            System.out.print("Enter the floor number(1-" + row + "): ");
                            String floor = scanner.nextLine();
                            floorNum = Integer.parseInt(floor);
                            if (floorNum <= value){
                                System.out.println("Floor number must be greater than 0");
                            } else break;
                        } catch (NumberFormatException e) {
                            System.out.println("Floor number must be number");
                        }
                    }

                    while (true) {
                        try{
                            System.out.print("Enter the room number(1-" + col + "): ");
                            String room = scanner.nextLine();
                            roomNum = Integer.parseInt(room);
                            if (roomNum <= value){
                                System.out.println("room number must be greater than 0");
                            } else break;
                        } catch (NumberFormatException e) {
                            System.out.println("room number must be number");
                        }
                    }


                    if (condo[floorNum - 1][roomNum - 1] == null) {
                        System.out.println("Cannot sell the condo \n Is doesn't belong to anyone yet !");
                    } else {
                        System.out.println("Confirm your name: ");
                        String ownerName = scanner.nextLine();
                        if (ownerName.equals(condo[floorNum - 1][roomNum - 1])) {
                            System.out.println("You have successfully sold a condo");
                            condo[floorNum - 1][roomNum - 1] = null;
                        } else {
                            System.out.println("This is condo doesn't belong to you!");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("------- Show information -------");

                    for (int i = row - 1; i >= 0; i--) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%-15s", condo[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    int searchOption = 0;

                    do {
                        System.out.println("------- Search Condo -------");
                        System.out.println("1. Search by owner name");
                        System.out.println("2. Search by floor");
                        System.out.println("3. Search by room [floor,room]");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        searchOption = scanner.nextInt();
                        switch (searchOption) {
                            case 1:
                                System.out.println("-----< Search by owner name >-----");
                                System.out.println("Enter the owner name: ");
                                scanner.nextLine();
                                String ownerName = scanner.nextLine();

                                boolean isFound = false;
                                for (int i = 0; i < row ; i++){
                                    for(int j = 0; j < condo[i].length ; j++){
                                        if (ownerName.equals(condo[i][j])){
                                            isFound = true;
                                            System.out.println("Owner Name: " + ownerName);
                                            System.out.println("Floor Number: " + (i+1));
                                            System.out.println("Room Number: " + (j+1));
                                        }
                                    }
                                }
                                // ! isFound = (isFound==false), (isFound != true)
                                if (!isFound) {
                                    System.out.println("Owner " + ownerName + " not found");
                                }
                                break;
                            case 2:
                                System.out.println("-----< Search by floor <-----");
                                scanner.nextLine();
                                // validation here
                                while (true) {
                                    try {
                                        System.out.print("Enter Floor Number: ");
                                        String floor = scanner.nextLine();
                                        floorNum = Integer.parseInt(floor);
                                        if (floorNum <= value){
                                            System.out.println("Floor number must be greater than 0");
                                        } else break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Floor number must be number");
                                    }
                                }
                                for (int i = 0; i <condo[floorNum - 1].length ; i++){
                                    System.out.print(condo[floorNum - 1][i] + "     ");
                                }
                                System.out.println();
                                break;
                            case 3:
                                boolean Found = false;
                                System.out.println("-----< Search by room <-----");
                                System.out.print("Enter floor Number: ");
                                int floor = scanner.nextInt();
                                System.out.print("Enter room Number: ");
                                int room = scanner.nextInt();

                                for (int i = 0 ; i < row ; i++ ){
                                    for (int j = 0; j < col ; j++) {
                                        if (condo[i][j] == condo[floor-1][room-1]){
                                            Found = true;
                                            System.out.println("Owner Name: " + condo[i][j]);
                                            System.out.println("Floor Number: " + (i+1));
                                            System.out.println("Room Number: " + (j+1));
                                        }
                                    }
                                }
                                if (!Found) {
                                    System.out.println("Room " + room + " not found");
                                }

                                break;
                            case 4:
                                System.out.println("-----< exit <-----");
                                break;
                            default: {
                                System.out.println("Invalid Option");
                                break;
                            }
                        }
                    } while (searchOption != 4);
                    break;
                }
                case 5: {
                    System.out.println("Exit the program");
                    break;
                }
                default: {
                    System.out.println("Invalid Option");
                    break;
                }
            }
            if (option != 5) {
                System.out.println("---------------Press ENTER to continue -----------");
                scanner.nextLine(); // clearing the buffer from int
                scanner.nextLine();
            }
        } while (option != 5);
    }
}
