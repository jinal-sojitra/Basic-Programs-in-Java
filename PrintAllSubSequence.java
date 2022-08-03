/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class PrintAllSubSequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> res=new ArrayList<>();
        findAllSubSeq(str,0,res);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    static void findAllSubSeq(String str,int ind ,ArrayList<String> res){
        if(ind==str.length()){
            res.add("");
            return;
        }
        findAllSubSeq(str,ind+1,res);
        int size=res.size();
        for(int i=0;i<size;i++){
            res.add(str.charAt(ind)+res.get(i));
        }
    }
    
}
