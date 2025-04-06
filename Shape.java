class Shape{
    Shape(int side){
        System.out.println("Square: "+(side*side));
    }
    Shape(int length, int breadth){
        System.out.println("Rectangle: "+(length*breadth));

    }
    Shape(int length,int breadth,int height){
        System.out.println("Cuboid: "+(length*breadth*height));

    }
    Shape(double radius){
        System.out.println("Circle: "+(22/7*(radius*radius)));
    }
    public static void main(String[]args){
        Shape square = new Shape(5);
        Shape Rectangle = new Shape(5,10);
        Shape Cuboid = new Shape(5,10,20);
        Shape Circle = new Shape(45.10);
        


        
    }
}