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
public class xPowerY {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       byte x=sc.nextByte();//2
       short y=sc.nextShort();//6
       int result=x;
       for (short i=1;i<y;i++){
           result*=x;
       }
       System.out.println(result);
           
       
    }
    
}
