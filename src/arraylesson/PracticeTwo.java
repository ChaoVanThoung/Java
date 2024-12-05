package arraylesson;

public class PracticeTwo {
    public static void main(String[] args) {
//        int[] scores = {1,2,3,4,5,6,7,8};
//        System.out.println("All score (normal order)");
//        for (int scr : scores){
//            System.out.print(scr + " ");
//        }
//
//        System.out.println();
//        System.out.println("All score (reverse order)");
//        for (int i = scores.length-1 ; i >= 0; i--){  // length-1 mean last index
//            System.out.print(scores[i] + " ");
//        }

        int[][] condo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // count row
        System.out.println("Row: " + condo.length);
        // count the col in specific row
        System.out.println("col in row: " + condo[0].length);

        for (int i = 0; i< condo.length; i++){
            for (int j = 0; j< condo[i].length; j++){
                System.out.print(condo[i][j]);
            }
            System.out.println();
        }
    }
}
