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

// 1/1 + 1/2 + 1/3 + 1/4
public class FloatSeriesSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for (int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}
