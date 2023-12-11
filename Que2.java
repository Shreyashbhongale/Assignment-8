import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Que2 {
    public static void main(String[] args) {

        int[] SaleM = {125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,150000};
        int[] SaleQ = new int[4];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

            System.out.println("Sales Monthly = "+ Arrays.toString(SaleM));

            for (int i = 0; i < SaleM.length; i++) {
                if ( i < 3) {
                    sum1 = sum1 + SaleM[i];
                } else if ( i > 2 && i < 6) {
                    sum2 = sum2 + SaleM[i];
                } else if ( i > 5 && i < 9) {
                    sum3 = sum3 + SaleM[i];
                } else {
                    sum4 = sum4 + SaleM[i];
                }
            } 
            SaleQ[0] = sum1;
            SaleQ[1] = sum2;
            SaleQ[2] = sum3;
            SaleQ[3] = sum4;  

             System.out.println("Reports of Quartly = "+ Arrays.toString(SaleQ));
             System.out.println();
             System.out.println("Reports of yearly = "+ (sum1+sum2+sum3+sum4));
    }}
       