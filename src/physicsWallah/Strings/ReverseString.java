package physicsWallah.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "I am an educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans = ans + sb;
                ans = ans + " ";
                sb.delete(0,sb.length()); //Or sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans = ans + sb;
        System.out.println(ans);
    }
}
