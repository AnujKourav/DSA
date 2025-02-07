package physicsWallah.Recursion;
import java.util.*;
//public class Recursion {
//    static void Pi(int n){
//        if (n > 0) {
//            Pi(n - 1);
//            System.out.print(n+" ");
//        }
//    }
//    public static void main(String[] args) {
//    int n = 10;
//    Pi(n);
//    }
//}

//class Recursion{
//    public static void PD(int n){
//        if(n == 1){
//            System.out.println(1);
//            return;
//        }
//        System.out.print(n+" ");
//        PD(n-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        PD(n);
//    }
//}

//class Recursion{
//    static int ans = 1;
//    static void Factorial(int n){
//        if(n == 0 || n == 1){
//            System.out.println(ans);
//            return;
//        }
//        ans = ans * n;
//        Factorial(n-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        Factorial(n);
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a digit: ");
//        int a = sc.nextInt();
//        System.out.print("Sum of digits is: "+sod(a));
//    }
//    public static int sod(int a){
//        if(a>=0 && a<=9) return a;
//        return sod(a/10) + a%10;
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        int count = 0;
//        System.out.print("number of digits is: "+nod(a,count));
//    }
//    static int nod(int n,int count){
//        if(n==0) return count;
//        count++;
//        return nod(n/10,count);
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the values of p and q: ");
//        int p = sc.nextInt();
//        int q = sc.nextInt();
//        System.out.print(power(p,q));
//    }
//    public static int power(int p, int q) {
//        if (q == 0) return 1;
//        return power(p,q-1) * p;
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the values of p and q: ");
//        int p = sc.nextInt();
//        int q = sc.nextInt();
//        System.out.println(power(p,q));
//    }
//    public static int power(int p, int q){
//        if(q == 0) return 1;
//        else if(q % 2 == 0){
//            int ans = power(p,q/2);
//            return ans * ans;
//        }
//        else {
//            int ans = power(p, q/2);
//            return ans * ans * p;
//        }
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num and value: ");
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        printMultiple(n,k);
//    }
//    public static void printMultiple(int n, int k){
//        if(k == 1){
//            System.out.print(n+" ");
//            return;
//        }
//        printMultiple(n,k-1);
//        System.out.print((n*k)+" ");
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print("ans is: "+ series(n));
//    }
//    public static int series(int n){
//        if(n == 0) return 0;
//        return series(n-1) + n;
//    }
//}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print("ans is: "+ series(n));
//    }
//    public static int series(int n){
//        if(n == 0) return 0;
//        if (n % 2 == 0) {
//            return series(n-1) - n;
//        }
//        else{
//            return series(n-1) + n;
//        }
//    }
//}


//class Recursion{
//    public static int GCD(int a,int b){
//        for(int i=Math.min(a,b);i>=2;i--){
//            if(a % i == 0 && b % i == 0){
//                return i;
//            }
//        }
//        return 1;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(GCD(a,b));
//    }
//}


//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(gcd(a,b));
//    }
//    public static int gcd(int x, int y){
//        while(y%x!=0){
//            int r = y;
//            y = x;
//            x = r%x;
//        }
//        return x;
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(gcd(a,b));
//    }
//    public static int gcd(int x,int y){
//        if(y == 0) return x;
//        return gcd(y,x%y);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(lcm(gcd(a,b),a,b));
//    }
//    public static int gcd(int x,int y){
//        if(y == 0) return x;
//        return gcd(y,x%y);
//    }
//    public static int lcm(int gcd, int a, int b){
//        return a*b/gcd;
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int i = 0;
//        print(arr,i);
//    }
//    static void print(int[]arr , int i){
//        if(i==arr.length) return;
//        System.out.print(arr[i]+" ");
//        print(arr, i+1);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the element in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(printMax(arr,0));
//    }
//    static int printMax(int[] arr, int i){
//        if(i == arr.length-1) return arr[i];
//        if(arr[i] > arr[i+1]){
//            int temp = arr[i+1];
//            arr[i+1] = arr[i];
//            arr[i] = temp;
//        }
//        return printMax(arr,i+1);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the element in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(sum(arr,0,0));
//    }
//    static int sum(int[] arr, int i, int sum){
//        if(i==arr.length) return sum;
//        return sum(arr,i+1,sum+arr[i]);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target: ");
//        int target = sc.nextInt();
//        System.out.println(printTarget(arr,0, target));
//    }
//    static int printTarget(int []arr, int i, int target){
//        if(i==arr.length)return -1;
//        if(arr[i] == target) return i;
//        return printTarget(arr,i+1,target);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target: ");
//        int target = sc.nextInt();
//        System.out.println(printTarget(arr,0, target));
//    }
//    static boolean printTarget(int []arr, int i, int target){
//        if(i==arr.length)return false;
//        if(arr[i] == target) return true;
//        return printTarget(arr,i+1,target);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target: ");
//        int target = sc.nextInt();
//        printTarget(arr,0, target);
//    }
//    static void printTarget(int []arr, int i, int target){
//        if(i==arr.length) return;
//        if(arr[i] == target) System.out.print(i+" ");;
//        printTarget(arr,i+1,target);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target: ");
//        int target = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(printTarget(arr,0, target,list));
//    }
//    static List<Integer> printTarget(int []arr, int i, int target,List<Integer> list){
//        if(i==arr.length) return list;
//        if(arr[i] == target) list.add(i);
//        return printTarget(arr,i+1,target,list);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(isSorted(arr,0));
//    }
//    static boolean isSorted(int []arr, int i){
//        if(i==arr.length-1) return true;
//        if(arr[i] > arr[i+1]) return false;
//        return isSorted(arr,i+1);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target: ");
//        int target = sc.nextInt();
//        int last = -1;
//        System.out.println(printTarget(arr,0, target,last));
//    }
//    static int printTarget(int []arr, int i, int target,int last){
//        if(i==arr.length) return last;
//        if(arr[i] == target){
//            last = i;
//        }
//        return printTarget(arr,i+1,target,last);
//    }
//}

//class Recursion{
//    public static String Remove_a(String str,String s){
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i) != 'a'){
//                s = s + str.charAt(i);
//            }
//        }
//        return s;
//    }
//    public static void main(String[] args) {
//        String str = "abcax";
//        String s = "";
//        System.out.println(Remove_a(str,s));
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        String s = "";
//        System.out.print(removea(str,s,0));
//    }
//    public static String removea(String str,String s,int i){
//        if(i==str.length())return s;
//        if(str.charAt(i) != 'a') s = s + str.charAt(i);
//        return removea(str,s,i+1);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        String s = "";
//        System.out.print(removea(str,s));
//    }
//    public static String removea(String str,String s){
//        if(str.isEmpty()) return s;
//        if(str.charAt(0) != 'a') s = s + str.charAt(0);
//        return removea(str.substring(1),s);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        String s = "";
//        System.out.println(reverseString(str,s));
//    }
//    public static String reverseString(String str,String s){
//        if(str.isEmpty()) return s;
//        else s = s + str.charAt(str.length()-1);
//        return reverseString(str.substring(0,str.length()-1),s);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        System.out.println(reverseString(str,0));
//    }
//    public static String reverseString(String str,int i){
//        if(i==str.length()) return "";
//        return reverseString(str,i+1) + str.charAt(i);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        System.out.println(reverseString(str));
//    }
//    public static String reverseString(String str){
//        if(str.isEmpty()) return "";
//        return reverseString(str.substring(1)) + str.charAt(0);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.nextLine();
//        String s = reverseString(str);
//          if(str.equals(s)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//    }
//    public static String reverseString(String str){
//        if(str.isEmpty()) return "";
//        return reverseString(str.substring(1)) + str.charAt(0);
//    }
//}


//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String s = sc.nextLine();
//        int l = 0;
//        int r = s.length()-1;
//        System.out.println(isPalindrome(s,l,r));
//    }
//    public static boolean isPalindrome(String s, int l, int r){
//        if(l>=r) return true;
//        return (s.charAt(l) == s.charAt(r) && isPalindrome(s,l+1,r-1));
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the number in an array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int l = 0;
//        int r = n-1;
//        System.out.println(isPalindrome(arr,l,r));
//    }
//    public static boolean isPalindrome(int []a, int l, int r){
//        if(l>=r) return true;
//        return (a[l] == a[r] && isPalindrome(a,l+1,r-1));
//    }
//}


//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int a = sc.nextInt();
//        int rev = 0;
//        int s = reverseint(a,rev);
//          if(a == s){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//    }
//    public static int reverseint(int a,int rev){
//        if(a == 0) return rev;
//        rev = (rev*10) + a % 10;
//        return reverseint(a/10,rev);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String str = sc.next();
//        System.out.println(getSSQ(str));
//    }
//    public static ArrayList<String> getSSQ(String s){
//        ArrayList<String> list = new ArrayList<>();
//        if(s.isEmpty()){
//            list.add("");
//            return list;
//        }
//        char curr = s.charAt(0);
//        ArrayList<String> ans = getSSQ(s.substring(1));
//        for(String ss: ans){
//            list.add(ss);
//            list.add(curr + ss);
//        }
//        return list;
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str = sc.next();
//        String currAns = "";
//        printSSQ(str,currAns);
//    }
//    public static void printSSQ(String s, String currAns){
//        if(s.isEmpty()) {
//            System.out.println(currAns);
//            return;
//        }
//        char curr = s.charAt(0);
//        String remString = s.substring(1);
//        printSSQ(remString, currAns + curr);
//        printSSQ(remString, currAns);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.print("Enter the number in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        int i = 0;
//        int currSum = 0;
//        System.out.println(0);
//        printSum(arr,i,currSum);
//    }
//    public static void printSum(int []arr, int i, int currSum){
//        if(i == arr.length) {
//            return;
//        }
//        System.out.println(arr[i] + currSum);
//        int x = arr[i];
//        printSum(arr, i+1, currSum);
//        printSum(arr,i+1,currSum + x);
//    }
//}

//class Recursion{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.println("Enter the height in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(minCost(arr,0));
//    }
//    public static int minCost(int []arr, int i){
//        if(i == arr.length-1) return 0;
//        int x = Math.abs(arr[i] - arr[i+1]) + minCost(arr, i+1);
//        if(i == arr.length-2) return x;
//        int y = Math.abs(arr[i] - arr[i+2]) + minCost(arr, i+2);
//        return Math.min(x, y);
//    }
//}

class Recursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits in a string: ");
        String str = sc.next();
        String res = "";
        String []kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //              0   1    2      3      4      5      6       7      8       9
        combination(str,kp,res);
    }
    static void combination(String dig,String []kp,String res){
        if(dig.isEmpty()) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0'; // 2
        String currChoices = kp[currNum]; // "abc"
        for(int i=0;i<currChoices.length();i++){ // "abc"
            combination(dig.substring(1),kp,res + currChoices.charAt(i));
        }
    }
}