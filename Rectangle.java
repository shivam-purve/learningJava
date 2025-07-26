package in.shivam.learnJava.Oops;

/*
ACCESS MODIFIER
* public
*protected
*default
*private

 */

public class Rectangle implements Shape {
//    public int length;
//    public int breadth;
    public int area;

    public Rectangle(int length,int breadth){
        super();// call parent constructor but can also happen by default
//        this.length = length;
//        this.breadth = breadth;
        this.area = length*breadth; //yu can use these length and breadth in any ways because of abstraction property one cant know changes in public class in other package that is encapsulated
        System.out.println("I am inside constructor in Rectangle");
    }

   public void draw(){
        System.out.println("Drawing Rectangle");
    }
   public void printArea(){
        System.out.println("Area is " + area);
    }


}
