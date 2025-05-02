import java.io.*;
class A<T>{
    T a;
}
class streams {
    public static void main(String[] args) {
        A <Integer> a= new A<>();
        a.a= 10;
        System.out.println(a.a);
    }
}
