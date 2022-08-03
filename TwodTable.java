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
public class TwodTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tableOf=sc.nextInt();
        for(int i=1;i<=tableOf;i++){
            for (int j=1;j<=20;j++){
                System.out.print(i*j+" ");    
            }
            System.out.println();
        }
        
    }
}
