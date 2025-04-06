import java.io.*;
import java.util.Scanner;
class stb{
    public static void main(String[]args){
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the STring: ");
        String str=ob.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed +str.charAt(i);

        }
        System.out.println(reversed);

    }

}