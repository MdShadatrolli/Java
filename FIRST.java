import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
//  import java.util.ArrayList;

 class FIRST {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        System.out.println("Hello, World!");
        // System.out.println(args[0]);
        // System.out.println(args[2]);
        // System.out.println(args[1]);
        // System.out.println(args[0]);
        int b=154;
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(b*a);
        System.out.println(b%a);
        System.out.println(b/a);
        int x=10;
        if(a%2==0 &&  b%2==0 && x%2==0 ){
            System.out.println("All are even");
        }
        Scanner obj= new Scanner(System.in);
        int helll=obj.nextInt();
        System.out.println("My age is "+helll);
        Scanner obj1= new Scanner(System.in);
        String yy=obj1.nextLine();
        System.out.println("My name is "+yy);
        obj.close();
        obj1.close();
        List<String> fruits = new ArrayList<>();
        System.out.println("Enter the number of fruits you want in the array: ");
        Scanner num= new Scanner(System.in);
        int numm=num.nextInt();
        System.out.println("Enter the names of the fruits: ");
        for(int i=0;i<numm;i++){
            Scanner temp =new Scanner(System.in);
            String ff=temp.nextLine();
            fruits.add(ff);
            temp.close();
        }
        for(int i=0;i<numm;i++){
            System.out.println(fruits.get(i));
        }

    }
}
