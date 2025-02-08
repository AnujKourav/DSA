package physicsWallah.Strings;

public class palindrome {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("abcdcba");
//        StringBuilder gtr = new StringBuilder();
//        gtr = str.reverse();
//        if(gtr.equals(str)) System.out.println("Palindrome");
//        else System.out.println("Not Palindrome");


        String str = "abcdcba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true; // true -> Palindrome
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println(" Not Palindrome");
        }
    }
}
