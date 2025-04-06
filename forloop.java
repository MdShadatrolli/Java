import java.util.Scanner;

class forloop{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number of the starting point: ");
        int num=obj.nextInt();
        System.out.print("Enter the number of the Ending point: ");
        int num1=obj.nextInt();

        for(int i=num;i<num1+1;i++){
            
            System.out.println(i);
        }
    }
}