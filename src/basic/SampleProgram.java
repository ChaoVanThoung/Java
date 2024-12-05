package basic;

import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        enum DAY {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }
        do {
            System.out.println("1. Wage Calculator");
            System.out.println("2. Money Exchange Program");
            System.out.println("5. Exit ");

            System.out.println("Choose (1 - 5) : ");
            option = input.nextInt();
            switch (option) {
                case 1: {
                    float hour;
                    float wage;
                    String day;
                    float result;
                    DAY enumday;
                    // wages -> 10
                    // hours -> 2 , 3, 4,
                    // SAT, SUN -> result * 2
                    System.out.println("--------------<<<Wage Calculator>>>-------------");
                    System.out.println("Enter hour(hrs): ");
                    hour = input.nextFloat();
                    System.out.println("Enter wage($): ");
                    wage = input.nextFloat();
                    System.out.println("Enter day (ex. MONDAY,...,SUNDAY): ");
                    day = input.next().toUpperCase();
                    result = wage*hour;
                    //convert normal to string to enum
                    enumday = DAY.valueOf(day);
                    float finalResult = switch (enumday){
                        case DAY.SATURDAY, DAY.SUNDAY -> result*2;
                        default -> result;
                    };

                    System.out.println("=======================");
                    System.out.println("Hour is : " + hour + "hr" + (hour>1? "s" : ""));
                    System.out.println("Wage is : " + wage + "$/1hrs");
                    System.out.println("Day of work : " + day);
                    System.out.println("Result: " + finalResult);
                    System.out.println("=======================");
                    break;
                }
                case 2: {
                    float riel;
                    float dollar;
                    float result;
                    final float RATE = 4000;
                    do {
                        System.out.println("---------> Money Exchange <---------");
                        System.out.println("1. Khmer to Dollar");
                        System.out.println("2. Dollar to Khmer");
                        System.out.println("5. Exit ");
                        System.out.println("Enter your choice: ");
                        option = input.nextInt();
                        switch (option) {
                            case 1: {
                                System.out.println("----<<< Khmer -> Dollar >>>----");
                                System.out.print("Enter khmer: ");
                                riel = input.nextFloat();
//                                System.out.println("--------------------------------");

                                result = riel/RATE;
                                System.out.println("""
                                        ====================================
                                               Currency Conversion       \s
                                        ====================================
                                        ----<<< Khmer -> Dollar >>>----
                                        """);
                                System.out.println("Exchange Rate: 1 USD = "+ RATE +" KHR" );
                                System.out.println("Converted Amount: "+riel+ " KHR = "+result+ " USD" );
                                System.out.println("""
                                        ------------------------------------
                                               Thank You for Using        \s
                                        ====================================
                                        """);
                                break;
                            }
                            case 2: {
                                System.out.println("----<<< Dollar -> khmer >>>----");
                                System.out.print("Enter USD: ");
                                dollar = input.nextFloat();
                                System.out.println("""
                                        ====================================
                                               Currency Conversion       \s
                                        ====================================
                                        ----<<< Khmer -> Dollar >>>----
                                        """);

                                result = dollar*RATE;
                                System.out.println("Exchange Rate: 1 USD = "+ RATE +" KHR" );
                                System.out.println("Converted Amount: "+dollar+ " USD = "+result+ " KHR" );
                                System.out.println("""
                                        ------------------------------------
                                               Thank You for Using        \s
                                        ====================================
                                        """);
                                break;
                            }
                            case 5: {
                                System.out.println("----<<< Exit <------");

                            }
                            default:
                                System.out.println("Invalid option");
                        }
                    }while (option != 5);


                }
                default:
                    System.out.println("Invalid option!! Try again!");
                    break;
            }
        } while (option != 5);
    }
}
