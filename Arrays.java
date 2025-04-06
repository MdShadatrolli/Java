/*  two types of arrays:
premitive and non premitive


*/
import java.util.Scanner;
// import java.util.Array;
class Arrays{
    public static void main(String[]args){
        //DECLARING ARRAY
        int[] arr;
        int arr1[];//both are same
        //initializing of an array
        arr = new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[0]);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        arr1= new int[5];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<5;i++){
            Scanner obj = new Scanner(System.in);
            int a=obj.nextInt();
            arr1[i]=a;

        }
        System.out.println("Here is your array: ");
        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Here are  your lenghths of the arrays: ");

        System.out.println(arr.length);
        System.out.println(arr1.length);
        Arrays.sort(arr1);
        // Arrays.binarySearch(arr1);
        // Arrays.toString(arr1);
        // Arrays.sumArray(arr1);
        // Arrays.findMax(arr1);
        // Arrays.findMin(arr1);

        
    }
}