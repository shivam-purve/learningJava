import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello and welcome!");// always by default goes to nextline
//        System.out.print("Hello world!");
//        int firstVariable = 5;
//        byte marks = 99;
//        boolean isPassed = true;
//        long phoneNumber = 9876543217L; // take care of putting L
//        long salary = 1_50_000;// just for readability like 1 lakh 50 thousand
//        float percentage = 85.5F;
//        double pi = 3.1478878846;

//        String firstEssay = new String("This is my first essay"); // declaring  classes
//
//        Date newDate = new Date(); // again declaring classes

//        int a = 5;
//        int b = a;
//        a = 7;
//        System.out.println(b);  here yu can see after changing a the print statement still printing 5 only as its read by value from top to bottom

//        Point a = new Point(1,2);  //here yu can assume a is a address
//        Point b = a; // here addresses copy
//
//        a.x = 3;
//        System.out.println(b);

        // string declaration

//        String a = new String("value 1");
//        String b = "value 2";
//        String c = new String("This is my test string");
//        System.out.println(b.contains("al")); // check substring is there or not
//        System.out.println(b.toUpperCase());
//        System.out.println(a.startsWith("al")); //check does string starts with al or not
//        System.out.println(a.endsWith("1"));
//        System.out.println(c.indexOf("test"));  // index of test starts with 11 (indexing always start from 0 note it)   // when that particular substring is not there in string it will return -1
//        System.out.println(c.charAt(11));  // this will give character at 11th index
//        System.out.println(c.replace("test","final"));  //yu can replace string but not change as it is immutable

        int[] marks = new int[] {50,55,90,30};
//        marks[0] = 50;
//        marks[1] = 55;
//        marks[2] = 90;
//        marks[3] = 30;

//        System.out.println(marks[0]);// for accessing particular element at index
        // but let say yu want all elements of arrays..//

//        System.out.println(Arrays.toString(marks));

        //sort function
//        Arrays.sort(marks);
//        System.out.println(Arrays.toString(marks));


//        int[][] marksNew = new int[][] {{50,55},{90,30}};
        //System.out.println(Arrays.deepToString(marksNew)); // for multi dimensional array print out

//        final float PI_IN_MY_PROGRAM = 3.14F; //constant value cant be changed

//        int a = 5;
//        int b = 3;
//        System.out.println(a+b);  // arithmetic operations
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        a = a + 1;
//        System.out.println(a); // will be updated and printed as 6
//        System.out.println(a++); // first it will use a then update as a=a+1;
//        System.out.println(++a);// first updated a=a+1 then it will be used
        // compound assignment lie p+=q  or p-=q or p*=q  p/=q p%=q

//   int a = 10;
//   long b = a;//yu can do this as int is having 4 bytes of memotry space and long is having 8 bytes of memory space
//         // but
//     long c = 5;
//     int d = (int)c;// will give wrror due to not casted properly 8 bytes can be fitted in to 4 bytes but when yu do explicit conversion
//
//        // byte->short->int->long->float->double
//
//      int x = "5"; // this is not allowed but yu can do like below
//
//        int y = Integer.parseInt("5"); //but dont think that it will parse for big string like some name or something like that
//
//        System.out.println(y);


//        int a = 5,b = 20;
////        System.out.println(Math.max(a,b));
////        System.out.println(Math.min(a,b));
//
//
//        float percentage = 85.678F;
//        System.out.println(Math.round(percentage));
//        System.out.println(Math.floor(percentage)); // lower bound
//        System.out.println(Math.ceil(percentage)); //upper bound

//        int num = 144;
//        System.out.println(Math.sqrt(num));
//        System.out.println(Math.pow(num,3));
//
//
//        double random = Math.random();
//        System.out.println(random*100); //this is by default random*1 but if yu want between 1 to 100 then


  //---------------USER INPUT----//

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("please enter your name: ");
//        String name = scanner.nextLine(); //just it will read token, for full line use nextline
//        System.out.println("your name as yu entered is: ");
//        System.out.println(name);

//        System.out.println("please enter your age: ");
//        short age = scanner.nextShort();
////        System.out.println("your age is: ");
////        System.out.println(age);
//       // System.out.println("your age is: " + age);

        // control statements----//

        // operators//  comparison operator
//        int a = 5;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number : ");
//        int b = scanner.nextInt();
//        System.out.println(a==b); // results boolean

//        boolean isPassed = true;
//        boolean inUniform = false;
//        boolean aachaBacha = isPassed || inUniform; // logical operators
//        System.out.println(!isPassed); // negation operator(logical operator)
//        System.out.println(aachaBacha);

// if-else
        //integer comparison
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your day as integer: ");
//        int date = scanner.nextInt();
//        if(date==1){
//            System.out.println("monday");
//        }
//        else if(date==2){
//            System.out.println("tuesday");
//        }
//        else{
//            System.out.println("some other day");
//        }
        // string comparison

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your day as string integer: ");
//        String date = scanner.next();
//        if(date.equals("1")){
//            System.out.println("monday");
//        }
//        else if(date.equals("2")){
//            System.out.println("tuesday");
//        }
//        else{
//            System.out.println("some other day");
//        }

        //ternary operator
//        int a = 5;
//        int b= a == 5 ? 1:2;
//        System.out.println(b);

        //switch case

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter day as charcter: ");
//        String day = scanner.next();
//        switch (day){
//            case "1":
//                System.out.println("monday");
//                break;
//            case "2":
//                System.out.println("tuesday");
//                break;
//            case"3":
//                System.out.println("wednesday");
//                break;
//            default:
//                System.out.println("some other day");
//                break;3
//        }

        //loops
    // while loops

//    int a = 10; //initialisation
//    while(a <= 15){ // condition check
//        System.out.println(a);//work
//        a++;//updation
//    }

        //for loop
//        for(int b=10;b>0;b--){
//            System.out.println(b);
//        }

        //do while
//            int c= 5;
//            do{
//                System.out.println(c);
//                c++;
//
//            }while(c<10);


        //for each loop
        int[] scores = new int[]{50,100,200,30};
        for(int mark:scores){
            System.out.println(mark);

        }











        // remains in sameline
        // naming conventions-
        // pascal naming convention // camel naming convention
    }


}