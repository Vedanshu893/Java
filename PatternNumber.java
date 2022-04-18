package com.company;
//Print the number in sequence with input = desired row number
import java.util.Scanner;

public class PatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                count +=1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
