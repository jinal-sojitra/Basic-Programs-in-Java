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
public class TransposeMatrix {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=3;
    int m1=3;
    int[][] m=new int[n][m1];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          m[i][j]=sc.nextInt();  
        }
    }
    if(n==m1){
        for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
        int temp=m[i][j];
        m[i][j]=m[j][i];
        m[j][i]=temp;
        }
        }
        //return m;
    }
    else{
    int[][] m2=new int[m1][n];
        for(int i=0;i<m1;i++){
        for(int j=0;j<n;j++){
            m2[i][j]=m[j][i];
        }
        }
        //return m2;
    }
//    //clockwise
//    for(int i=0;i<n;i++){
//    int left=0,right=n-1;
//    
//    while(left<right){
//    int temp=m[i][left];
//    m[i][left]=m[i][right];
//    m[i][right]=temp;
//    left++;
//    right--;
//    }
//    
//    }
//    
    //Anticlockwise
    int j1=0;
    while(j1<n){
    int up=0,bottom=n-1;
    while(up<bottom){
        int temp=m[up][j1];
        m[up][j1]=m[bottom][j1];
        m[bottom][j1]=temp;
        up++;
        bottom--;

    }
    j1++;
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(m[i][j]+" ");  
        }
        System.out.println();
    }
    
    }
}
