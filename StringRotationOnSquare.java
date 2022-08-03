/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

/*

input: "rhdt:246,ghftd:1246"
output: "trhd" "ftdgh"

*/

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class StringRotationOnSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String[] arr=s.split(",");
        for(String str: arr){
            String[] obj=str.split(":");
            String word=obj[0];
            int len=word.length();
            int sq=0;
            int number=Integer.parseInt(obj[1]);
            
            while(number>0){
                int d=number%10;
                sq+=d*d;
                number/=10;
            }
            if(sq%2==0){
                System.out.println(word.charAt(len-1)+word.substring(0,len-1));
            }
            else{
                
                System.out.println(word.substring(2,len)+word.substring(0,2));
            }
        
        }
    }
}
