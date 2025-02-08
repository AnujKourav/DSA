package physicsWallah.Strings;
import java.util.*;

public class toggleString {
    public static void main(String[] args) {
        String str = "PhySicS";
        for(int i=0;i<str.length();i++){
            //P -> p
            //check alphabet small , capital
            boolean flag = true; //true -> Capital
            char ch = str.charAt(i); // A
            if(Character.isDigit(ch)) continue; // if digit is present skip them
            if(ch ==' ')continue; //if space is present then it will continue
            int asci = (int)ch;// A -> 65
            if(asci >= 97) flag = false; // Small
            if(flag == true) { //Capital
                asci = asci + 32;  // Making it small
                char dh = (char)asci;  //typecasting to char
                str = str.substring(0,i) + dh + str.substring(i+1);  // setting the value of capital to small
            }
            else{ //small
                asci = asci - 32;  // Making it capital
                char dh = (char)asci;   //typecasting to char
                str = str.substring(0,i) + dh + str.substring(i+1);   // setting the value of small to capital
            }
        }
        System.out.println(str);
    }
}
