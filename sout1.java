
class A{
    int a=10;
    static int b=100;
    void a1(){
        System.out.println("nonstatic fuction inside class A");

    }
    static void a2(){
        System.out.println("nonstatic fuction inside class B");
    }
    class B{

        int c=1000;
        void b1(){
            System.out.println("non static function inside the local nested class");
            A a= new A();
            a1.a();
            A.a2();
            System.out.println(a.a);
            System.out.println(a.b);

    

        }
    }

    public static void main(String[]args ){
        A a=new A();
        System.out.println("value of a : "+a.a);
        System.out.println("value of b : "+b);



        
        



    }
}
