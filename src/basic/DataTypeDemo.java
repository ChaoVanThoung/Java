package basic;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Working with primitive type
        // Integer number
        byte age = 12;
        short salary = 300;
        int workerId = 1234;
        long population = 1000000000;

        // Floating point number
        float average = 5.4f;
        double biggerAvg = 67.89;

        // boolean -> true | false
        boolean isFemale = true; // true

        // char -> 'a', 'B', ascii
        char gender = 'M';
        char unicode = '\u0051'; // Q
        char ascii = 97 ; // a
        System.out.println(ascii);

        // Wrapper Class
        Character wCharacter;
        Integer wInteger;
        Boolean wBoolean;

        int value = 5;
        System.out.println(Integer.toBinaryString(value));
    }
}
