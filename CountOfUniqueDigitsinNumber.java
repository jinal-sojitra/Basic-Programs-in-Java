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
public class CountOfUniqueDigitsinNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int countOfUnique=0;
        
        int[] count=new int[10];
        
        while(n>0){
            int digit=n%10;
            count[digit]+=1;
            n/=10;
        }
        
        for(int j=0;j<10;j++){
            if(count[j]==1){
                countOfUnique++;
            }
        }
        
        System.out.println(countOfUnique);
    }
}
