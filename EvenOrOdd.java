import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]){
        int num;
        System.out.println("Enter an Integer number:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();


        if(num % 2 == 0){
            System.out.println("The number is Even!");
        } else {
            System.out.println("The number is Odd!");
        }
    }
}
