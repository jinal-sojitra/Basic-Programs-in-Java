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
public class MatrixSpiralTraversal {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    int[][] matrix=new int[n][m];
    for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        matrix[i][j]=sc.nextInt();
    }
    }
//    //AntiClockWise Traversal
//    int minR=0,minC=0;
//    int maxR=matrix.length-1,maxC=matrix[0].length-1;
//    int count=0;
//    int total=n*m;
//    while(count<total){
//    //leftwall
//    for(int i=minR,j=minC;i<=maxR && count<total;i++){
//        System.out.print(matrix[i][j]+" ");
//        count++;
//    }
//    minC++;
//    
//    //bottomwall
//    for(int i=maxR,j=minC;j<=maxC && count<total;j++){
//        System.out.print(matrix[i][j]+" ");
//        count++;
//    }
//    maxR--;
//    
//    //rightwall
//    for(int i=maxR,j=maxC;i>=minR && count<total;i--){
//        System.out.print(matrix[i][j]+" ");
//        count++;
//    }
//    maxC--;
//    
//    //topwall 
//    for(int i=minR,j=maxC;j>=minC && count<total;j--){
//        System.out.print(matrix[i][j]+" ");
//        count++;
//    }
//    minR++;
//    }

//ClockWise Traversal
}
}