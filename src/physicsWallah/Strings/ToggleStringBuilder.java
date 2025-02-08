package physicsWallah.Strings;

//toggle means to convert Uppercase character to lower character and vice versa

import java.util.Scanner;
public class ToggleStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        //phySICs -> PHYsicS

        //Ascii A -> 65 , a -> 97 , 0 -> 48
        // a - A -> 32

        for(int i=0;i<sb.length();i++){
            //P -> p
            //check alphabet small , capital
            boolean flag = true; //true -> Capital
            char ch = sb.charAt(i); // A
            if(Character.isDigit(ch)) continue; // if digit is present skip them
            if(ch ==' ')continue; //if space is present then it will continue
            int asci = (int)ch; // A -> 65
            if(asci >= 97) flag = false; // Small
            if(flag == true) { //Capital
                asci = asci + 32;  // Making it small
                char dh = (char)asci;  //typecasting to char
                sb.setCharAt(i,dh);  // setting the value of capital to small
            }
            else{ //small
                asci = asci - 32;  // Making it capital
                char dh = (char)asci;   //typecasting to char
                sb.setCharAt(i,dh);   // setting the value of small to capital
            }
        }
        System.out.println(sb);
    }
}
