import java.util.Scanner;

class secondsmallest{
    public static void main(String[]args){
        int arr[];
        arr= new int[10];
        for(int i=0;i<10;i++){
            Scanner obj= new Scanner(System.in);
            int a=obj.nextInt();
            arr[i]=a;
        }
        // int first =0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }
        }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        // System.out.println(arr[arr.length-1]);




    }
}
/*
12
10
8
14
6
16
4
18
2
20 
*/