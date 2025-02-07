package physicsWallah.Array;
//import java.util.*;
//public class Two_dArray {
//
//    static void printArray(int [][]arr){
//        for(int i=0;i<arr.length;i++) {
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int [][] arr = new int[3][2];
//
//        int [][]arr2 = {{1,2,3},
//                        {2,5,7,5},
//                        {12,34}};
//
////        System.out.print("Enter the number of rows: ");
////        int r = sc.nextInt();
////        System.out.print("Enter the number of columns: ");
////        int c = sc.nextInt();
////        int [][] arr3 = new int[r][c];
////        System.out.println("Enter "+(r*c)+" element: ");
////        for(int i=0;i<arr3.length;i++){//rows
////            for(int j=0;j<arr3[i].length;j++){//columns
////                arr3[i][j] = sc.nextInt();
////            }
////        }
//        printArray(arr2);
//    }
//}


//import java.util.*;
//class Two_dArray{
//
//    static void printArray(int[][] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void sumArray(int [][]arr1,int r1,int c1, int [][]arr2, int r2, int c2){
//        if(r1 != r2 || c1 != c2){
//            System.out.println("Wrong input - Addition not possible");
//            return;
//        }
//        int [][]arr = new int[r1][c1];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                arr[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println("Result of matrix1 + matrix2 is:");
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for first matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//        System.out.println("Enter number of rows & column for second matrix:");
//        System.out.print("r2: ");
//        int r2 = sc.nextInt();
//        System.out.print("c2: ");
//        int c2 = sc.nextInt();
//
//        int[][] arr1 = new int[r1][c1];
//        int [][] arr2 = new int[r2][c2];
//
//        System.out.println("Enter the element for first matrix:");
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter the element for second matrix:");
//        for(int i=0;i<arr2.length;i++){
//            for(int j=0;j<arr2[i].length;j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//
//        sumArray(arr1,r1,c1,arr2,r2,c2);
//    }
//}

//import java.util.*;
//class Two_dArray{
//
//    static void printArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void multiply(int [][]arr1, int r1,int c1,int [][]arr2,int r2,int c2){
//        if(c1!=r2){
//            System.out.println("Wrong input - Multiplication not possible.");
//            return;
//        }
//        int [][]arr = new int[r1][c2];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c2;j++){
//                for(int k=0;k<c1;k++){
//                    arr[i][j] = arr[i][j] + (arr1[i][k] * arr2[k][j]);
//                }
//            }
//        }
//        System.out.println("Result of matrix1 * matrix2 is: ");
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        int c2 = sc.nextInt();
//
//        int [][] arr2 = new int[r2][c2];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for first matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//
//        int[][] arr1 = new int[r1][c1];
//        System.out.println("Enter the element for first matrix:");
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter number of rows & column for second matrix:");
//        System.out.print("r2: ");
//        int r2 = sc.nextInt();
//        System.out.print("c2: ");
//        System.out.println("Enter the element for second matrix:");
//        for(int i=0;i<arr2.length;i++){
//            for(int j=0;j<arr2[i].length;j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//        multiply(arr1,r1,c1,arr2,r2,c2);
//    }
//}

//import java.util.*;
//class Two_dArray{
//
//    static void printArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void reverseArray(int [][]arr,int r1,int c1){
//        int temp;
//        int c2 = c1;
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                temp = arr[i][j];
//                arr[i][j] = arr[i][c1-1];
//                arr[i][c1-1] = temp;
//                c1--;
//            }
//            c1 = c2;
//        }
//        System.out.println("Reverse array is: ");
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//
//        int[][] arr = new int[r1][c1];
//        System.out.println("Enter the element for matrix:");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        reverseArray(arr,r1,c1);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void printArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static int[][] transpose(int [][]arr,int r1, int c1){
//        int [][]arr1 = new int[c1][r1];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                arr1[j][i] = arr[i][j];
//            }
//        }
//        return arr1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//
//        int[][] arr = new int[r1][c1];
//        System.out.println("Enter the element for matrix:");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Transposed matrix:");
//        int [][]ans = transpose(arr,r1,c1);
//        printArray(ans);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void printArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void transposeInPlace(int [][]arr, int r, int c){
//        int temp;
//        for(int i=0;i<r;i++){
//            for(int j=i;j<c;j++){
//                temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        System.out.println("Transpose matrix is:");
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//
//        int[][] arr = new int[r1][c1];
//        System.out.println("Enter the element for matrix:");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        transposeInPlace(arr,r1,c1);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void printArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void RotateMatrix(int [][]arr, int r, int c){
//        int temp;
//        for(int i=0;i<r;i++){
//            for(int j=i;j<c;j++){
//                temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        reverseArray(arr,r,c);
//    }
//    static void reverseArray(int [][]arr,int r1,int c1) {
//        int temp;
//        int c2 = c1;
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c1; j++) {
//                temp = arr[i][j];
//                arr[i][j] = arr[i][c1 - 1];
//                arr[i][c1 - 1] = temp;
//                c1--;
//            }
//            c1 = c2;
//        }
//        System.out.println("Rotated matrix is:");
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows & column for matrix: ");
//        System.out.print("r1: ");
//        int r1 = sc.nextInt();
//        System.out.print("c1: ");
//        int c1 = sc.nextInt();
//
//        int[][] arr = new int[r1][c1];
//        System.out.println("Enter the element for matrix:");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        RotateMatrix(arr,r1,c1);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void printArray(int [][]arr,int r){
//        for(int i=0;i<r;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static void pascalTriangle(int r){
//        int [][]arr = new int[r][];
//        for(int i=0;i<r;i++){
//            arr[i] = new int[i+1];
//            for(int j=0;j<=i;j++){
//                if(j==0 || j==i){
//                    arr[i][j] = 1;
//                }
//                else{
//                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//                }
//            }
//        }
//        System.out.println("Pascal's Triangle:");
//        printArray(arr,r);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int r = sc.nextInt();
//        pascalTriangle(r);
//        sc.close();
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void spiralTraversal(int [][]arr, int r, int c){
//        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
//        int totalElements = 0;
//        while(totalElements < r*c){
//            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
//                System.out.print(arr[topRow][j]+" ");
//                totalElements++;
//            }
//            topRow++;
//            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
//                System.out.print(arr[i][rightCol]+" ");
//                totalElements++;
//            }
//            rightCol--;
//            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
//                System.out.print(arr[bottomRow][j]+" ");
//                totalElements++;
//            }
//            bottomRow--;
//            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
//                System.out.print(arr[i][leftCol]+" ");
//                totalElements++;
//            }
//            leftCol++;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows and columns: ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][]arr = new int[r][c];
//        System.out.println("Enter the number of elements in matrix: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Spiral order traversed matrix is:");
//        spiralTraversal(arr,r,c);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void printArray(int [][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void generateSpiralMatrix(int n){
//        int [][]arr = new int[n][n];
//        int topRow = 0, rightCol = n-1, bottomRow = n-1, leftCol = 0;
//        int current = 1;
//        while(current <= n*n){
//            for(int j=leftCol;j<=rightCol && current <= n*n;j++){
//                arr[topRow][j] = current++;
//            }
//            topRow++;
//
//            for(int i=topRow;i<=bottomRow && current <= n*n;i++){
//                arr[i][rightCol] = current++;
//            }
//            rightCol--;
//
//            for(int j=rightCol;j>=leftCol && current <= n*n;j--){
//                arr[bottomRow][j] = current++;
//            }
//            bottomRow--;
//
//            for(int i=bottomRow;i>=topRow;i--){
//                arr[i][leftCol] = current++;
//            }
//            leftCol++;
//        }
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number n: ");
//        int n = sc.nextInt();
//        generateSpiralMatrix(n);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void precalculating(int [][]arr,int r,int c,int r1, int l1, int r2, int l2){
//        if(l1>l2 || r1>r2 || l1<0 || l2>c || r1<0 || r2>r){
//            System.out.println("Invalid Coordinates - Sum is not possible.");
//            return;
//        }
//        int sum = 0;
//        for(int i=r1;i<=r2;i++){
//            for(int j=l1;j<=l2;j++){
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.print("The sum is: "+ sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows and columns for matrix: ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][]arr = new int[r][c];
//        System.out.println("Enter the elements in a a matrix: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter the first Coordinates: ");
//        int r1 = sc.nextInt();
//        int l1 = sc.nextInt();
//        System.out.println("Enter the second Coordinates: ");
//        int r2 = sc.nextInt();
//        int l2 = sc.nextInt();
//        precalculating(arr,r,c,r1,l1,r2,l2);
//    }
//}

//import java.util.*;
//class Two_dArray{
//    static void precalculating(int [][]arr, int r, int c){
//        for(int i=0;i<r;i++){
//            for(int j=1;j<c;j++){
//                arr[i][j] = arr[i][j-1] + arr[i][j];
//            }
//        }
//    }
//    static void finalSum(int [][]arr,int r1, int l1, int r2, int l2){
//        int sum = 0;
//        for(int i=r1;i<=r2;i++){
//            if(l1 == 0){
//                sum = sum + arr[i][l2];
//            }
//            else {
//                sum = sum + arr[i][l2] - arr[i][l1 - 1];
//            }
//        }
//        System.out.println("Sum is :"+sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows and column for matrix: ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][]arr = new int[r][c];
//        System.out.println("Enter the elements in the matrix: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        precalculating(arr,r,c);
//        System.out.print("Enter the number of queries: ");
//        int q = sc.nextInt();
//        for(int i=0;i<q;i++){
//            System.out.println("Enter the first coordinates: ");
//            int r1 = sc.nextInt();
//            int l1 = sc.nextInt();
//            System.out.println("Enter the second coordinates: ");
//            int r2 = sc.nextInt();
//            int l2 = sc.nextInt();
//            finalSum(arr,r1,l1,r2,l2);
//        }
//    }
//}

import java.util.*;
class Two_dArray{
    static void prefixSum(int [][]arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] = arr[i][j] + arr[i][j - 1];
            }
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = arr[i][j] + arr[i-1][j];
            }
        }
    }
    static void finalSum(int [][]arr,int r1,int l1,int r2,int l2){
        int ans = 0, sum = 0, up = 0, left = 0, upLeft = 0;

        sum = arr[r2][l2];
        if(l1>0) {
            left = arr[r2][l1 - 1];
        }
        if(r1>0) {
            up = arr[r1 - 1][l2];
        }
        if(l1>0 && r1>0) {
            upLeft = arr[r1 - 1][l1 - 1];
        }
        ans = sum - up - left + upLeft;

        System.out.println("Sum is: "+ ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in a matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        System.out.println("Enter the elements in a matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        prefixSum(arr,r,c);
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter the first coordinates: ");
            int r1 = sc.nextInt();
            int l1 = sc.nextInt();
            System.out.println("Enter the second coordinates: ");
            int r2 = sc.nextInt();
            int l2 = sc.nextInt();
            finalSum(arr,r1,l1,r2,l2);
            q--;
        }
    }
}