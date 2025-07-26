package in.shivam.learnJava.Oops;

public interface Shape {
//    public Shape(){
//        System.out.println("I am inside shape constructor");
//    }
//
//    public void draw(){
//        System.out.println("Drawing a shape");
//    }







    //FOR MAKING IT ABSTRACT INTERFACE REMOVE INNER FIELD AND CONSTRUCTOR AND METHOD DEFINITION(also the we define abstract class shape as interface class shape)


     void printArea();//method declaration will should be defined in child cases

     void draw();                                   //thats why we used abstract



}
