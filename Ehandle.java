class Animal{
    static int numofAnimals;
    boolean isAlive=false;


}
class Dog extends Animal{
    String name;
    void setname(String x){
        this.name=x;
        this.isAlive=true;
        numofAnimals++;
        
    }
    void makenoise(){
        System.out.println(this.name+" is *woofing*");
    }
}
class cat extends Animal{
    String name;
    void setname(String name){
        this.name=name;
        this.isAlive=true;
        numofAnimals++;
    } 
    void makenoise(){
        System.out.println(this.name+" is *meowing*");
    }  
}
class Ehandle{
    public static void main(String []args){
        Dog d1= new Dog();
        d1.setname("Tommy");
        d1.makenoise();
        cat c1= new cat();
        c1.setname("Minnu");
        c1.makenoise();
        System.out.println(d1.numofAnimals);
        
    }
    
}