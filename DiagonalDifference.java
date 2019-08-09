package Hackerrank.ProblemSolving;
import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leftDiagonal = input.nextInt(); //Handles first edge case of the element at matrix pos 0
        int rightDiagonal = 0;
        for(int i = 1; i<n*n; i++) {
            int value = input.nextInt();
            if(i%(n+1) == 0) {
                leftDiagonal += value;
            }
            if(i%(n-1) == 0 && i != (n*n)-1) {
                rightDiagonal += value;
            }
        }
        System.out.println(Math.abs(leftDiagonal-rightDiagonal));
    }
}