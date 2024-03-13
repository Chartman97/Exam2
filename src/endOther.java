import java.util.Scanner;

public class endOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data
        System.out.print("Enter Here->");
        String firstInput = scanner.nextLine();
        System.out.print("Enter Here->");
        String secondInput = scanner.nextLine();

        // This is where the Magic Happens
        System.out.println(mumboJumbo(firstInput, secondInput));
        scanner.close();
    }

    public static boolean mumboJumbo(String a, String b) {
        String changeA = a.toLowerCase();
        String changeB = b.toLowerCase();

        return changeA.endsWith(changeB) || changeB.endsWith(changeA);
    }
}