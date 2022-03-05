import java.util.*;

public class DSExam3 {
  static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int r1 ,c1, r2, c2;
        try{
        System.out.println("Enter rows then column for Matrix A");
        r1= s.nextInt();
        c1= s.nextInt();

        System.out.println("Enter rows then column for Matrix B");
        r2= s.nextInt();
        c2= s.nextInt();
        if(r2 != c1 ){
            System.out.println("~~~ Wrong dimensions ~~~");
        }
        else{
        multiplyMatrices( r1, c1, r2,  c2);
        }}catch(Exception e){
            System.out.println("Input might be negative");
        }
}
    static void multiplyMatrices(int r1, int c1, int r2, int c2) {
        int A[][], B[][];
        int i,j;

        A = new int[r1][c1];
        B = new int[r2][c2];
        
            System.out.println("Enter data for Matrix A");
                for (i = 0; i < r1; i++)
                    for (j = 0; j < c1; j++)
                        A[i][j] = s.nextInt();
            System.out.println("Enter data for Matrix B");
                for (i = 0; i < r2; i++)
                    for (j = 0; j < c2; j++)
                        B[i][j] = s.nextInt();

        int[][] prod = new int[r1][c2];
        for(i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("\nThe product is:");
        System.out.println(Arrays.deepToString(prod).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}