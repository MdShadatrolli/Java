import java.util.*;
public class CommandLineArguements {
    public static void main(String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ") ;

        a = sc.nextInt();
        System.out.print("Enter b: ");
        b= sc.nextInt();
        if(a==b){
            System.out.print("a and b are equal");
        }
        else if(a>b){
            System.out.print("a is greater than b");
        }
        else{
            System.out.print("a is smaller than b");
        }

    }
    
}
