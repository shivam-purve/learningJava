package in.shivam.learnJava.Oops;

public class Circle  implements Shape  { //use extends in case of public parent class or abstract parent class and use implements in case of interface
    private static final double PI = 3.14;
    public int radius ;
    public Circle(int radius){
        super();
        this.radius = radius;
        System.out.println("I am inside constructor in circle");
    }
   public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    public void printArea(){
        System.out.println("Area of circle is " + (PI*radius*radius));

    }
}
