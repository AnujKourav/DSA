package physicsWallah.Strings;
import java.util.*;
public class stringBasics {
    public static void main(String[] args) {
//        char []arr = new char[10]; // String is a collection of character
//        String str = "Hello123&^%";
//        String str = new String();
//        str = "Anuj";

        //User input can be taken in two ways
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();  it will take input till whitespace
//        String str2 = sc.nextLine(); it will take complete input

        String str = "     Hello World     ";

        // -> Methods

        //1. trim(); it is used to remove leading and ending whitespace
        System.out.println(str.trim());
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());
        //above thing show the interning and immutable property of strings

        //2. length(); it is used to determine the length of string
        // it is method not the property in array t it is property
        System.out.println(str.length());

        //3.charAt(parameter); it is used to get the character at particular index
        System.out.println(str.charAt(4));

        //4. indexOf()  it return the index of particular character if present else -1
        System.out.println(str.indexOf('l'));

        //5. lastIndexOf();  it is used to return the last index of any character
        System.out.println(str.lastIndexOf('l'));

        //6. contains(); if return true or false if the given parameter is present return true
        System.out.println(str.contains("ello"));

        //7. compareTo(); it is used to compare two string lexicographically
        //it returns '0' if the strings are equal
        //it returns < '0' if the string is less than the compared string
        //it returns > '0' if the string is greater than compared string
        System.out.println(str.compareTo("Hello World"));

        //8. == operator is used to compare the address or reference of string
        //if both the reference is pointing towards same string value then return true
        String str2 = "Anuj";
        String str3 = "Anuj";
        String str4 = new String("Anuj");
        System.out.println(str3 == str2); //true
        System.out.println(str == str2); //false
        System.out.println(str3 == str4); //false

        //9. equals(); it is used to compare the content of the strings
        System.out.println(str2.equals(str4)); //true

        //10. startsWith() and endsWith() are used to check whether the string starts or ends
        // with given parameter or not if matched return true
        System.out.println(str.endsWith("Anj")); //false

        //11. toLowerCase() and toUpperCase() it is used to convert string to uppercase and vice versa
        System.out.println(str.toLowerCase()); //"hello world"

        //12. concat() it is used for concatenation of two strings
        System.out.println(str.concat(" How are you"));

        //13. + operator is also used for concatenation
        //it can concat String + int/char/String/anything
        System.out.println(str+10);

        //14. substring() it is used to return substring
        System.out.println(str.substring(2));
    }
}
