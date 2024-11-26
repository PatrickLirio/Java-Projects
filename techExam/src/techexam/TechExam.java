/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techexam;

/**
 *
 * @author Patrick
 */
import java.util.Arrays;
public class TechExam {
  
    /**
     * 
     * Given an array of Strings, provide a pseudo-code on how would you sort it?
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] str1 = {"name1", "name3", "name2"};
        int size = str1.length;
        
        for(int i = 0; i<size-1; i++){
            for (int j = i+1; j<str1.length; j++){
                if(str1[i].compareTo(str1[j])>0){  
                   String temp = str1[i];  
                   str1[i] = str1[j];  
                   str1[j] = temp;
                }
  
            }
            
        }
        System.out.println(Arrays.toString(str1));  
        
    }
    
}
