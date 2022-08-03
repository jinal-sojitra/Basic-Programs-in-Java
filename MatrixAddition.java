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

//m*n Matrix addition 

public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and colums respectively: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        System.out.println("Enter elements of Matrix A: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int d[][]=new int[r][c];
        System.out.println("Your Addition Matrix:  ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
       
        
    }
    
}
