class A{
    int a;
    A(){
        this(1000);
        System.out.println("Constructer of class A");
        System.out.println(a);
    }
    A(int a){
        this.a=a;
    }


}
class B extends A{
    int a;
    B(){
        System.out.println("Constructer of class B");

    }

}
class C extends B{
    int a;
    C(){
    System.out.println("Constructer of class C");
    }
}
class bank{

    public static void main(String[]args){
        C c=new C();

    }

}