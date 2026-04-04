package com.maurya;

import java.util.Scanner;

public class Rotate_matrix{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        int[][] matrix =new int[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }





        //transpose

        for(int i = 0 ; i< n ; i++){
            for(int j = i ; j < m ; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    //reversing
        for(int i = 0 ; i< n ; i++){

                int start = 0;
                int end = m-1;
                while( start < end ){
                    int temp = matrix[i][start];
                    matrix[i][start]=matrix[i][end];
                    matrix[i][end]=temp;
                    start++;
                    end--;

                }

        }
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Rotated Matrix");
    }
}
