/*  Given a string s check if it is "Panagram" or not.
    A "Panagram" is a sentence containing every letter in the English Alphabet.

    Expected TC-O(n)
             SC-O(1)
*/
import java.util.Scanner;
public class Day1{
    public static void main(String[] args) {
        //1st approach
        // int n=s.length();
        // if(n<26)
        //     return false;
        
        // s=s.toLowerCase();
        // int arr[]=new int[26];
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        //         arr[s.charAt(i)-'a']++;
        //     }
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]==0)
        //         return false;
        // }
        
        // return true;

        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string :");
        s=sc.nextLine();
        int n=s.length();
        if(n<26)
            System.out.println("false");
            
        char ch='a';
        
        s=s.toLowerCase();
        for(int i=0;i<26;i++){
            if(s.contains(Character.toString(ch)))
                ch++;
            else
            System.out.println("false");
        }
        System.out.println("true");
        sc.close();
    }
}