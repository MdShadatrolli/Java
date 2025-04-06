import java.io.*;

class string11{

    static void sout(StringBuilder x ){
        System.out.println(x);
    }
    static void sout(String x){
        System.out.println(x);
    }
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Akshay");
        System.out.println(sb);
        sb.append(" is a faculty of java");
        System.out.println(sb);
        sb.insert(23,"Python and ");
        System.out.println(sb);
        sb.replace(0,6,"Vaibhav");
        sout(sb);

        
        

    }
}