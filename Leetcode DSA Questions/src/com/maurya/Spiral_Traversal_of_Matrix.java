package com.maurya;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_Traversal_of_Matrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int[][] matrix=new int[n][m];

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
        System.out.println(matrix[0].length);

        //Spiral
//        ArrayList<Integer> list=new ArrayList<>();
//        int top = 0;
//        int bottom = n-1;
//        int left = 0;
//        int right = m-1;
//        while(top<=bottom && left<=right){
//            for(int i=left;i<=right;i++){
//             //   System.out.print(matrix[top][i]+" ");
//                list.add(matrix[top][i]);
//
//            }
//            top++;
//            for(int i=top;i<=bottom;i++){
//               // System.out.print(matrix[i][right]+" ");
//                list.add(matrix[i][right]);
//
//            }
//            right--;
//            for(int i=right;i>=left;i--){
//             //   System.out.print(matrix[bottom][i]+" ");
//                list.add(matrix[bottom][i]);
//            }
//            bottom--;
//            for(int i=bottom;i>=top;i--){
//             //   System.out.print(matrix[i][left]+" ");
//                list.add(matrix[i][left]);
//            }
//            left++;
//        }
//        System.out.println(list.toString());



    }
}
