/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 * InfyTQ
 */
public class LargestEvenNoInString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[A-Za-z]","");
        s=s.replaceAll("\\W","");
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i)-'0');
        }
        ArrayList<Integer> a=new ArrayList<>(hs);
        
        Collections.sort(a, Collections.reverseOrder());
        
        boolean noEven=true;
        int n=a.size();
        for(int i=n-1;i>0;i--){
            if(a.get(i)%2==0){
            a.add(a.get(i));
            a.remove(i);
            noEven=false;
            break;
            }
        }
        if(noEven){
            System.out.println(-1);
        }
        else{
            int res=0;
            for(int i=0;i<n;i++){
                res=res*10+a.get(i);
            }
            System.out.println(res);
        }
        
        
        
    }
}
