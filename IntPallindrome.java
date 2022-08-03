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
public class IntPallindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //at the end i'll have to compare n with rev so i am not updating n ,i'll just work on temp.
        int temp=n;
        int rev=0;
        while(temp>0){
           int digit= temp%10;
           rev=rev*10+digit;
           temp/=10;
        }
        if(rev==n)
            System.out.println(n+" is Pellindrom!! ");
        else
            System.out.println(n+" is not Pellindrom!! ");
            
        
    }
}
