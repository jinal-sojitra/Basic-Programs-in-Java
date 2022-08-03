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
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int nd=(int)Math.log10(n)+1;
        System.out.println(nd);
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of Digits of "+n+": "+ sum);
    }
}
