/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava;

/**
 *
 * @author Jinal Sojitra
 */
//Pelindrome
public class StringPelindrome {
    public static void main(String[] args){
        String s="nitin";
        int left=0;
        int right=s.length()-1;
        boolean isPelindrome=true;
        while(left<right){
        if(s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        else{
            isPelindrome=false;
            break;
        }
        }
        if(isPelindrome)
            System.out.println("Pellindrome");
        else
            System.out.println("Not Pellindrome");
        
        
    }
}
