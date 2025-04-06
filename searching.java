import java.util.Scanner;
class searching{
    public static void main(String[]args){
        System.out.println("We are performing linearsearch");
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);

        int a=sc.nextInt();
        int arr[];
        arr = new int [a];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<a;i++){
            arr[i]=sc1.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        for(int i=0;i<a;i++){
            if(arr[i]==target){
                System.out.println("Target found ");
                break;

            }
            else{
                System.out.println("Target not found");
                break;

            }
        }

    }
}