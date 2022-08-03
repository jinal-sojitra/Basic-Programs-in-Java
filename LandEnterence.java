/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Element{
  int n;
  String name;
	Element(int n,String name){
    	this.n=n;
      	this.name=name;
        }
}
public class LandEnterence{
        static int getEmotionValue(String emot){
            if(emot.equals("Happy")){
                return 10;
            }
            
            if(emot.equals("Sad")){
                return 5;
            }
            if(emot.equals("Neutral")){
                return 2;
            }
            if(emot.equals("None")){
                return 1;
            }
        return 0;
        }
        static boolean isPrime(int score){
            for(int i=2;i<=Math.sqrt(score);i++){
                if(score%i==0)
                    return false;
            }
            return true;
        }
        
        static String getinWords(int d){
            if(d==0)
                return "Zero";
            if(d==1)
                return "One";
            if(d==2)
                return "Two";
            if(d==3)
                return "Three";
            if(d==4)
                return "Four";
            if(d==5)
                return "Five";
            if(d==6)
                return "Six";
            if(d==7)
                return "Seven";
            if(d==8)
                return "Eight";
            if(d==9)
                return "Nine";
            return "";
        }
        
        static int getNoOfVowels(String s){
            int vowels=0;
            for(char c:s.toCharArray()){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                    vowels++;
            
            }
            return vowels;
        }
	public static void main(String[] args) throws IOException{
            ArrayList<Element> input=new ArrayList<>();
            ArrayList<Integer> emotion=new ArrayList<>();
            Scanner sc=new Scanner(System.in);
            BufferedReader bi=new BufferedReader(new InputStreamReader(System.in));
            int n=sc.nextInt();
            sc.nextLine();
            String[] in=bi.readLine().split(" ");
            int score=0;
            for(int i=0;i<n;i++){
                    
                    int d=(int)in[i].charAt(0);
                    String desc=in[i].substring(1);
                    input.add(new Element(d,desc));
            }
            String[] mood=bi.readLine().split(" ");
            for(int i=0;i<n;i++){
               emotion.add(getEmotionValue(mood[i]));
            }
            
            for(int i=0;i<n;i++){
               int val=input.get(i).n * emotion.get(i);
               score+=val;
            }
            
            int vowels=0;
            for(int i=0;i<n;i++){
               int vowel=getNoOfVowels(input.get(i).name);
               vowels+=input.get(i).n * vowel;
            }
            
            if(score<vowels){
                score=(int)Math.floor(vowels/score);
            }
            else{
                score=(int)Math.floor(score/vowels);
            }
            
            boolean prime=isPrime(score);
            if(prime){
                System.out.println("Yes "+getinWords(score));
            }
            else{
                System.out.println("No "+getinWords(score));
            }
            

    }
}