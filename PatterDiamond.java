package com.company;

import java.util.Scanner;

public class PatterDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n :");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){ //Upwards Pyramid
            //spaces
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();  /// Enter after every line
        }
        for(int m=1;m<=n-1;m++){  //Mirror image
            //Spaces
            for(int x=1;x<=m;x++){
                System.out.print(" ");
            }
            //Stars
            for(int y=1;y<=(2*n-2*m-1);y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
