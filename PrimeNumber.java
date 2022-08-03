/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;
import java.util.Scanner;
/**
 *
 * @author Jinak Sojitra
 */
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true)
            System.out.println(n+" is Prime Number!");
        else if(n<2)
            System.out.println(n+" is Neither Prime nor non-prime!");
        else
            System.out.println(n+" is Not a Prime Number!");
            
    }
    
}
