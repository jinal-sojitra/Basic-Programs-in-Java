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
public class SubSumAlternative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float res=0;
        for(float i=1;i<=n;i++){
            if(i%2==1)
                res+=1/i;
            else
                res-=1/i;
        }
        System.out.println(res);
    }
}
