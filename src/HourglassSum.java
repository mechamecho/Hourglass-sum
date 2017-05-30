/**
 * Created by Engineer on 5/23/2017.
 */

/*
Hackerrank Challenge: https://www.hackerrank.com/challenges/2d-array
 */
import java.io.*;
import java.util.*;

public class HourglassSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][]numbers=new int[6][6];
        Scanner in=new Scanner(System.in);
        for (int r=0;r<6;r++){
            for(int c=0;c<6;c++){
                numbers[r][c]=in.nextInt();
//                System.out.print(numbers[r][c]+" ");
            }
//            System.out.print(System.lineSeparator());
        }
        long maxsum=Long.MIN_VALUE;
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
                int firstrsum=numbers[r][c]+numbers[r][c+1]+numbers[r][c+2];
                int secondrsum=numbers[r+1][c+1];
                int thirdrsum=numbers[r+2][c]+numbers[r+2][c+1]+numbers[r+2][c+2];
                int totalsum=firstrsum+secondrsum+thirdrsum;
                if (totalsum>maxsum){
                    maxsum=totalsum;
                }

            }
        }
        System.out.print(maxsum);
    }
}
