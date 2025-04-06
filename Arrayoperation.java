import java.util.Arrays;
import java.util.Scanner;
class Arrayoperation{
    public static void main(String[]args){
        int arr[];
        arr =new int [5];
        System.out.println("Enter the elements: ");
        for(int i=0;i<5;i++){
            Scanner sc= new Scanner(System.in);
            arr[i]=sc.nextInt();


        }
        Arrays.sort(arr);
        System.out.println(" Here is your sorted array: \n");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("Enter the target");

        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        int  xxx=Arrays.binarySearch(arr,a);
        System.out.println(xxx);


    }
}