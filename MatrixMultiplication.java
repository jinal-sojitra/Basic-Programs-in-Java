/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns of 1st Matrix respectively: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter rows and columns of 2nd Matrix respectively: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        
        int[][] m=new int[r][c];
        if(c==r2){
            int[][] a=new int[r][c];
            int[][] b=new int[r2][c2];

            System.out.println("Enter Elements of 1st Matrix: ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter Elements of 2nd Matrix: ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("Your Multiplication Matrix: ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    for(int k=0;k<c;k++){
                    m[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
            
            
            
        }
        else{
            System.out.println("1st Matrix's Column size and 2nd Matrix's row size must be same!!");
        }
        
    }
}
