//Easy 1
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal 
//substring consisting of non-space characters only.

//to import all java libraries
import java.util.*;
public class Easy1 {
    public static void main(String[] args){
        //making an object in scanner class for taking input
        Scanner sc=new Scanner(System.in);
        //taking string input  and storing it in variable s
        String s=sc.nextLine();
        //to break all words in the string and storing them in array of type strings
        String[] arrWords=s.split(" ");
        //for getting the last word
        String lstWord=arrWords[arrWords.length-1];
        //for getting the size of last word
        int sizeOfword=lstWord.length();
        System.out.println(sizeOfword);
        
    }
}
