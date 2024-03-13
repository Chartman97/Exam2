import java.util.Scanner;

public class StringKnowledge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        endOther(scanner);
        findRepeats(scanner);

        scanner.close();
    }

    static void endOther(Scanner scanner) {

        // Input Data
        System.out.print("Enter Here->");
        String firstInput = scanner.nextLine();
        System.out.print("Enter Here->");
        String secondInput = scanner.nextLine();

        // This is where the Magic Happens
        System.out.println(lowerCase(firstInput, secondInput));
    }

    static boolean lowerCase(String a, String b) {
        String changeA = a.toLowerCase();
        String changeB = b.toLowerCase();

        return changeA.endsWith(changeB) || changeB.endsWith(changeA);
    }
    //  END

    static void findRepeats(Scanner scanner) {
        // Data Entry
        System.out.print("Enter Here->");
        String testStuff = scanner.nextLine();
        boolean result = magicHappens(testStuff);
        System.out.println("Result = " + result);

    }

    static boolean magicHappens(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String substring = toTest.substring(i, j);
                int count = countOccurrences(toTest, substring);
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}