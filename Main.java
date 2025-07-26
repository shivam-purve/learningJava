import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
             //s=u*t + 1/2*a*t*t;
        System.out.println("Lets begin with some standards input for displacement calculation: ");
        // making a scanner class

        Scanner scanner = new Scanner(System.in);

        // declare initial speed



        float speed ; //speed is always positive
        do{
            System.out.println("enter initial speed of object(in m/s in positive values ): ");
            speed = scanner.nextFloat();
        }while(speed < 0);


        // declaring acceleration

        float a;
        do{
            System.out.println("enter acceleration with which the object is moving(in m/s^2 in positive value ): ");
            a = scanner.nextFloat();

        }while(a<0);
        // declaring time



        float time;
        do{
            System.out.println("enter time for which long the object motioned(in sec in positive value ): ");
            time = scanner.nextFloat();

        }while(time < 0);
        // declaring displacement variable

        float s;
        float totalTime = (float)Math.pow(time,2);

        s = (speed)*(time) + (0.5f)*(a)*(totalTime);
        System.out.println("the total displacement for given specified value of parameters is (in meter): ");
        System.out.println(s);

        System.out.println(" *** congratulations yu finally found your displacement ***");




    }
}