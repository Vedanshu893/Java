package com.company.Function;

import java.util.Scanner;

public class NumberOfFactor {

    public static boolean isfactor(int n, int i){
        if(n%i==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i =1; i<=num; i++){
            if(isfactor(num,i)){
                System.out.print(i + " ");
                count +=1;
            }
            continue;
            }
        System.out.println(" ");
        System.out.println("Total no. of factors are "+ count);
        }
}
