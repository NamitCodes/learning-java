import java.util.Arrays;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        // first program - single line comment

        /*
        * multiple line comments
        * */

//        System.out.println("Hello World");
//        System.out.print("Hello World");

//        VARIABLES
//        String name = "Namit";
//        String neighbour = "Purr";
//        int age = 23;
//
//        String friend = neighbour;

//        PRIMITIVE DATA TYPES
//        byte - 1 [-128 to 127]
//        short - 2
//        int - 4
//        long - 8
//        float - 4
//        double - 8
//        char - 2
//        boolean - 1

//        byte age = 30;
//        int phone = 1234567890;
//        long phone2 = 123123123123L;
//        float pi = 3.14F;
//        char letter = '@';
//        boolean isAdult = false;

//        NON PRIMITIVE DATA TYPES
//        String name = "Aman";
//        String friend = new String("Purr");
//
//        System.out.println(name.length());

//        STRINGS
//        concatenate
//        String name1 = "Namit ";
//        String name2 = "M. ";
//        String name3 = "Gupta";
//        String fullName = name1 + name2 + name3;
//        System.out.println(fullName);


//        charAt
//        String name = "Namit";
//        System.out.println(name.charAt(0));

//        replace
//        String name = "Namit";
//        String name2 = name.replace('a', 'b');
//        System.out.println(name2);
//        System.out.println(name);

//        in Java, strings are immutable.

//        substring
//        String name = "Namit and G";
//        System.out.println(name.substring(0, 4));
//        4th index is not included in this.
//        System.out.println(name.substring(6,9));

//        int physics = 97;
//        int chem = 98;
//        int eng = 95;

//        int[] marks = new int[3];
//        each position of int array is by default initialized to 0
//        each position of boolean array is by default initialized to false

//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        //length
//        System.out.println(marks.length);
        // note that in String, it is length()

        //sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

//        int[] marks = {97, 98, 95};
//        int[][] finalMarks = {{97,98,95},{95,95,98}};
//        System.out.println(finalMarks[1][0]);

        //casting
//        double price = 100.00;
//        double finalPrice = price + 18;
//        System.out.println(finalPrice);

//        int p = 100;
//        int fp = p + 18.0;
//      Java main this is called implicit casting

//        Explicit Casting
//        int p = 100;
//        int fp = p + (int)18.99;
//        System.out.println(fp);

//        Constants
//        int age = 30;
//        age = 31;
//        age = 32;
//
//        float PI = 3.14F;
//        PI = 1.1F;

//      but if we put final
//        final float PI = 3.14F;   // As a convention final variable ke naam are in UPPERCASE
//        PI = 1.1F;                => error

//        OPERATORS
//        int a  = 1;
//        int b = 2;
//
//        int sum = a + b;
//        System.out.println(sum); //3
//
//        int diff = a - b;
//        System.out.println(diff); //-1
//
//        int mul = a * b;
//        System.out.println(mul); //2
//
//        int div = a / b;
//        System.out.println(div);  //0
//
//        int modulo = a % b;
//        System.out.println(modulo); //1

//        int numb = 1;
//        numb = numb + 1;
//        System.out.println(numb); //2
//        numb++;
//        System.out.println(numb); //3
//
//        System.out.println(numb++); //3
//        System.out.println(numb); //4
//
//        System.out.println(++numb); //5
//        System.out.println(numb); //5
//
//        System.out.println(--numb); //4
//        System.out.println(numb--); //4
//        System.out.println(numb); //3

        // MATHS CLASS
        // 5, 6
//        System.out.println(Math.max(5, 6));
//        System.out.println(Math.min(5, 6));

//        System.out.println(Math.random());

//        System.out.println((int)(Math.random()*100));


        // HOW TO TAKE INPUT
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Input your name: ");
//        String name = sc.nextLine();
//        System.out.println("Your name is " + name);

//        System.out.print("Input your age: ");
//        float age = sc.nextFloat();
//        System.out.println("your age is " + age);

//        System.out.println("you can write a line now...");
//        String line = sc.nextLine(); // this does not work cuz of previous nextFloat(). After nextFloat(), the newline character (Enter) is still in the input buffer. So, nextLine() takes it in, reads it as an empty line and moves on.
//        System.out.println(line);

        // COMPARISION OPERATORS
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // conditional statements
//        boolean isSunUp = false;
//        if (isSunUp == true)
//            System.out.println("day");
//        else System.out.println("night");

//        int age = 30;
//        if(age > 18) System.out.println("can vote");
//        else System.out.println("cannot vote");

        // LOGICAL OPERATORS
        // &&
//        int a = 60;
//        int b = 40;
//
//        if(a < 50 && b < 50) System.out.println("both less than 50");

        // ||
//        if(a < 50 || b < 50){
//            System.out.println("atleast one less than 50");
//        }

        // !
//        boolean isAdult = true;
//        if (!isAdult){
//            System.out.println("is adult");
//        } else {
//            System.out.println("not adult");
//        }

        // conditional statements
//        Scanner sc = new Scanner(System.in);
        // pen = 10; notebook = 40;

//        int cash = sc.nextInt();
//        if (cash < 10) {
//            System.out.println("cannot buy anything");
//            System.out.println("get more cash");
//        } else if (cash > 10 && cash < 40 ) {
//            System.out.println("can get 1 thing");
//        } else {
//            System.out.println("can get both");
//        }

        // conditional statements - SWITCH
//        int day = 2; // 1- monday; 2- tuesday and so on
//
//        switch (day){
//            case 1 :
//                System.out.println("monday");
//                break;
//            case 2 :
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("wed - sun");
//        }

        // LOOPS

        // FOR LOOP
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= 1; i--) {
//            System.out.println(i);
//        }

        // WHILE LOOP
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        while (i >= 1){
//            System.out.println(i);
//            i--;
//        }

        // DO WHILE LOOP
//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k - 1;
//        } while (k >= 1);

//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        do {
//            System.out.println("Input a number : ");
//            num = sc.nextInt();
//            System.out.print("here is your number : ");
//            System.out.println(num);
//        } while(num >= 0);
//        System.out.println("THE END");


        // BREAK & CONTINUE
//        int i = 0;
//        while(true){
//            if (i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//            if (i > 5){
//                break;
//            }
//        }

        // TRY - CATCH in EXCEPTION HANDLING
//        int[] marks = {97,98,95};
//        try{
//        System.out.println(marks[5]);
//        } catch (Exception exception){
//            // do things after catching
//            System.out.println("Some Error happened");
//        }
//        System.out.println("The name is Namit");

        // METHODS/FUNCTIONS
        printJava();

        printName("Namit");
        printName("Purrr");

        printSum(2, 3);

    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}