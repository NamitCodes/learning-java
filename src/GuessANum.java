import java.util.Scanner;

public class GuessANum {
    public static void main(String[] args) {
        // MINI PROJECT
        int myNum = (int) (Math.random() * 100);
        int userNum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Guess my number (1-100) : ");
            userNum = sc.nextInt();
            if(userNum == myNum){
                System.out.println("WOOHOO! CORRECT NUMBERR");
                break;
            } else if (userNum > myNum) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too smol");
            }
        } while(userNum >= 0);

        System.out.print("my number was " + myNum);
    }
}
