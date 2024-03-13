import java.util.Scanner;
public class LogicKnowledge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        greenTicket(scanner);
        makeChocolate(scanner);
        scanner.close();
    }
    public static void greenTicket(Scanner scanner) {

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int result = greenTicket1(a, b, c);
        System.out.println("Result: " + result);

    }

    public static int greenTicket1(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }


    public static void makeChocolate(Scanner scanner) {


        // Data Entry
        System.out.print("Small bars: ");
        int small = scanner.nextInt();
        System.out.print("Large bars: ");
        int large = scanner.nextInt();
        System.out.print("Goal number of pounds: ");
        int goal = scanner.nextInt();
        int result = makeChocolate1(small, large, goal);
        System.out.println("Small bars needed: " + result);
    }
    // Magic is done here
    public static int makeChocolate1(int small, int large, int goal) {
        int largePounds = large * 5;
        if (largePounds >= goal) {
            largePounds = goal;
        }
        int remainingGoal = goal - largePounds;
        if (small >= remainingGoal) {
            return remainingGoal;
        }
        return -1;
    }
}