package Hackerrank.ProblemSolving;
import java.util.*;
public class aVeryBigSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        long sum = 0;
        for(int i = n; i>0; i--)
        {
            sum += input.nextInt();
        }
        System.out.println(sum);
    }
}
