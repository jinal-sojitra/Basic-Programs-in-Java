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
public class fibbonaciSeries {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        short n=sc.nextShort();
        
        short a=0;
        short b=1;
        short c;
        System.out.print(a+" "+b+" ");
        for (int i=0;i<=n-2;i++){
            c=(short)(a+b);
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
    }
}
