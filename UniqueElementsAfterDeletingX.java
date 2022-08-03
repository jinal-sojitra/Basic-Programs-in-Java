/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class UniqueElementsAfterDeletingX {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] arr=s.split(",");
        HashSet<Integer> hs=new HashSet<>();
        for(String i:arr){
            int d=Integer.parseInt(i);
            hs.add(d);
        }
        System.out.println(hs.size()-n);
    }
}
