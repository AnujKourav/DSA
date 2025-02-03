package physicsWallah;
//
//public class Array {
//        static void printArray(int []arr){
//            for(int i=0;i<arr.length;i++){
//                System.out.print(arr[i]+" ");
//            }
//        }
//            public static void array(){
//                    int []arr1 = new int[5];
//            arr1[0]=6;
//            arr1[1]=7;
//            arr1[2]=8;
//            arr1[3]=9;
//            arr1[4]=5;
//                    System.out.println("Original Array: ");
//            printArray(arr1);
//                    // int []arr2 = arr1;
//            // System.out.println("\nCopied Array: ");
//            // printArray(arr2);
//                        int []arr2 = new int[arr1.length];
//            for(int i=0;i<arr1.length;i++){
//                arr2[i] = arr1[i];
//            }
//            System.out.println("\nCopied Array");
//            printArray(arr2);
//                    arr2[0] = 0;
//            arr2[1] = 0;
//                    System.out.println("\nOriginal array");
//            printArray(arr1);
//            System.out.println("\nNew Array");
//            printArray(arr2);
//
//        }
//
//        public static void main(String []args) {
//            array();
//        }
//}


//class Array{
//
//    static int countOfOccurrence(int []arr, int x){
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countOfOccurrence(new int[]{1,2,3,4,5,3,4,3,2,7},9));
//    }
//}


//class Array{
//
//    static int lastOccurrence(int []arr, int x){
//        int index = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                index = i;
//            }
//        }
//        return index;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(lastOccurrence(new int[]{1,2,3,2,3,2,4,5,3,5,6,6},7));
//    }
//}

//class Array{
//
//    static int countGreaterNumber(int []arr,int x){
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>x){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countGreaterNumber(new int[]{1,2,3,2,3,2,4,5,3,5,6,6},5));
//    }
//}

//class Array{
//
//    static boolean isSorted(int []arr){
//        for(int i=0;i<arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isSorted(new int[]{1,2,3,4,4,7,8,9}));
//    }
//}

//import java.util.Arrays;
//
//public class Array {
//    static int x = Integer.MIN_VALUE;
//    static int y = Integer.MAX_VALUE;
//    static int []a = new int[2];
//    static int[] smallestAndLargest(int []arr){
////        Arrays.sort(arr);
////        return new int[]{arr[0],arr[arr.length-1]};
//
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>x){
//                x = arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] < y) {
//                y = arr[i];
//            }
//        }
//        a[0] = y;
//        a[1] = x;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int []ans=smallestAndLargest(new int[]{2,4,1,5,7,3,6});
////        System.out.println("Smallest: "+ans[0]);
////        System.out.println("Largest: "+ans[1]);
//
//        System.out.println("Smallest: "+a[0]);
//        System.out.println("Largest: "+a[1]);
//    }
//}

//class Array{
//
//    static int sumIsX(int []arr,int x){
//        int a = 0;
//        for (int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==x){
//                    a++;
//                }
//            }
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sumIsX(new int[]{4,6,3,5,8,1},9));
//    }
//}
//
//class Array{
//
//    static int sumIsX(int []arr,int x){
//        int a = 0;
//        for (int i=0;i<arr.length;i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] +arr[k] == x) {
//                        a++;
//                    }
//                }
//            }
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sumIsX(new int[]{1,4,5,6,3},12));
//    }
//}

//class Array{
//    static int uniqueNumber(int []arr){
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(i!=j && arr[i] == arr[j]){
//                    break;
//                }
//                if(j == arr.length-1){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        System.out.println(uniqueNumber(new int[]{1,2,3,4,3,2,1}));
//    }
//}

//class Array{
//    static int repeatingValueInArray(int []arr){
//        int x = -1;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]==arr[i]){
//                    x = arr[j];
//                    return x;
//                }
//            }
//        }
//        return x;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(repeatingValueInArray(new int[]{1,5,3,4,6,3,8,4}));
//    }
//}
//
//class Array{
//
//    static void reverseArray(int []arr){
//        int []ans = new int[arr.length];
//        int j = 0;
//        for(int i=arr.length-1;i>=0;i--){
//            ans[j] = arr[i];
//            j++;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(ans[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        reverseArray(new int[]{1,2,3,4,5});
//    }
//}
//
//class Array{
//
//    static void swapArray(int []arr){
//        int i=0,j=arr.length-1,temp;
//        while(i<j){
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for(int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
//        swapArray(arr);
//    }
//}

//class Array{
//
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    static int[] rotateArray(int []arr,int k){
//        int n = arr.length;
//        k = k%n;
//        int []ans = new int[n];
//        int j = 0;
//        for(int i=n-k;i<n;i++){
//            ans[j++] = arr[i];
//        }
//        for(int i=0;i<n-k;i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5,6};
//        System.out.println("Before rotation: ");
//        printArray(arr);
//        System.out.println("\nAfter rotation: ");
//        int []ans = rotateArray(arr,2);
//        printArray(ans);
//    }
//}

//import java.util.*;
//class Array{
//
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    static void reverseArray(int []arr,int i,int j){
//        int temp;
//        while(i<j){
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//    static void rotateArrayInPlace(int []arr,int k){
//        int n = arr.length;
//        k = k%n;
//        reverseArray(arr,0,n-k-1);
//        reverseArray(arr,n-k,n-1);
//        reverseArray(arr,0,n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.println("Enter the number in array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//        System.out.println("Original array: ");
//        printArray(arr);
//
//        rotateArrayInPlace(arr,k);
//        System.out.println("\nArray after rotation: ");
//        printArray(arr);
//
//    }
//}
//

//import java.util.Scanner;
//class Array{
//
//    static int [] makeFrequencyArray(int []arr){
//        int []freq = new int[100005];
//        for(int i=0;i<arr.length;i++){
//            freq[arr[i]]++;
//        }
//        return freq;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter "+n+" element in array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int []freq = makeFrequencyArray(arr);
//
//        System.out.print("Enter number of queries: ");
//        int q = sc.nextInt();
//
//        while(q>0){
//            System.out.print("Enter number to be searched: ");
//            int x = sc.nextInt();
//            if(freq[x]>0){
//                System.out.println("Yes");
//            }
//            else{
//                System.out.println("No");
//            }
//            q--;
//        }
//    }
//}

//class Array{
//
//    static void sortArray01(int []arr) {
//        int zeros = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                zeros++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i < zeros) {
//                arr[i] = 0;
//            }
//        else{
//            arr[i] = 1;
//        }
//    }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int []arr = {0,1,0,0,1,1,0,1,0};
//        sortArray01(arr);
//    }
//}
//
//class Array{
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    static void sortZerosOne(int []arr){
//        int i = 0;
//        int j = arr.length-1;
//        while(i<j) {
//            while(arr[i] == 0 && i<j){
//                i++;
//            }
//            while(arr[j] == 1 && i<j){
//                j--;
//            }
//            if (i < j) {
//                arr[i] = 0;
//                arr[j] = 1;
//                i++;
//                j--;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,0,0,1,0,0,1,0};
//        sortZerosOne(arr);
//        printArray(arr);
//    }
//}

//class Array{
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    static void sortEvenOdd(int []arr){
//        int i = 0;
//        int j = arr.length-1;
//        int temp;
//        while(i<j){
//            while(arr[i]%2==0 && i<j){
//                i++;
//            }
//            while(arr[j]%2!=0 &&i<j){
//                j--;
//            }
//            if(i<j){
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,3,5,7,9};
//        sortEvenOdd(arr);
//        printArray(arr);
//
//    }
//}

//class Array{
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    static int[] sortSquaredNumber(int[] arr){
//        int i = 0;
//        int j = arr.length - 1;
//        int []ans = new int[arr.length];
//        int k = arr.length - 1;
//        while(i<=j){
//            if(Math.abs(arr[i])>Math.abs(arr[j])){
//                ans[k] = arr[i]*arr[i];
//                i++;
//            }
//            else{
//                ans[k] = arr[j]*arr[j];
//                j--;
//            }
//            k--;
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5,6};
//        int []ans = sortSquaredNumber(arr);
//        printArray(ans);
//    }
//}

//class Array{
//    static void printArray(int []arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    static void prefixSumArray(int []arr){
//        for(int i=1;i<arr.length;i++){
//            arr[i] = arr[i]+arr[i-1];
//        }
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
//        prefixSumArray(arr);
//        printArray(arr);
//    }
//}

//import java.util.*;
//class Array{
//    static int sumOfQueries(int []arr,int l,int r){
//        int sum = 0;
//        int []arr1 = new int[arr.length+1];
//        for(int i=0;i<arr.length;i++){
//            arr1[i+1] = arr[i];
//        }
//        for(int i=l;i<=r;i++){
//            sum = sum + arr1[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.println("Enter the numbers in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter number of queries: ");
//        int q = sc.nextInt();
//        int l,r;
//        int sum;
//        while(q>0){
//            System.out.print("\nEnter the first index: ");
//            l = sc.nextInt();
//            System.out.print("Enter the last index: ");
//            r = sc.nextInt();
//            sum = sumOfQueries(arr,l,r);
//            System.out.print("Sum is: "+sum);
//            q--;
//        }
//    }
//}
//
//import java.util.*;
//class Array{
//
//    static void prefixSum(int []arr){
//        for(int i=1;i<arr.length;i++){
//            arr[i] = arr[i] + arr[i-1];
//        }
//    }
//    static int optimisedSumOfArray(int []arr,int l,int r){
//        if(l==0){
//            return arr[r];
//        }
//        else {
//            return arr[r] - arr[l-1];
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.println("Enter the number in an array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter number of queries: ");
//        int q = sc.nextInt();
//        prefixSum(arr);
//        while(q>0){
//            System.out.print("Enter first index: ");
//            int l = sc.nextInt();
//            System.out.print("Enter last index: ");
//            int r = sc.nextInt();
//            System.out.println(optimisedSumOfArray(arr,l,r));
//            q--;
//        }
//    }
//}

class Array{

    static boolean Sum(int []arr){
        int i = 0;
        int j = arr.length-1;
        int prefixsum = 0;
        int suffixsum = 0;
        while(i<=j){
            if(prefixsum<=suffixsum) {
                prefixsum = prefixsum + arr[i];
                i++;
            }
            else{
                suffixsum = suffixsum + arr[j];
                j--;
            }
        }
        if(suffixsum == prefixsum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Sum(new int[]{1,3,2,4,5}));
    }
}























