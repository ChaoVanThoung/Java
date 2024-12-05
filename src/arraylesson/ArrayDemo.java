package arraylesson;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; // number of student
        System.out.println("Enter the number of student : ");
        n = scanner.nextInt();

        // int scores = new int[-1] wrong can not input negitive number
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the score"+ (i+1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // print all values of score
        System.out.println("All scores :");
        System.out.println(Arrays.toString(scores));

        System.out.println("Even number");
        for (int i = 0; i < n; i++) {
            if (scores[i]%2 == 0){
                System.out.print(scores[i] + " ");
            }
        }
        System.out.println("\n odd number");
        for (int mum : scores) {
            if (mum%2 == 0){
                continue;
            }
            System.out.print(mum + " ");
        }



        //find sum
        // 11,33,44,55
        int sum = 0;
        for (int num : scores) {
            sum += num; // or sum = sum + num
        }
        System.out.println("total score: " + sum);
        // find avg
        float avg = sum /(float) n;
        System.out.println("average score: " + avg);

//         finding the max/min value of the array
        System.out.println("\nfind max");
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println(max);

        int min = scores[0];
        for (int i = 0; i < n; i++) {
            if (scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println(min);

        // sort ( bubble sort , built-in sorts ( TimSort, Dual-pivot quick sort )
        // Sort ( small -> large ( ASC ) , large -> small (DESC)
        Arrays.sort(scores);
        System.out.println("Final score ");
        System.out.println(Arrays.toString(scores));
    }
}
