import java.util.Scanner;
public class ArrayKnowledge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stringToArray(scanner);
        generateArrayWithBounds(scanner);
    }

    public static void stringToArray(Scanner scanner) {

        System.out.print("Enter a word Here ->");
        String word = scanner.nextLine();

        char[] result = stringToArray1(word);

        System.out.println("Here is the array");
        for (char c : result) {
            System.out.print("'" + c + "',");
        }
    }

        public static char[] stringToArray1(String str) {
            char[] array = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i);
            }
            return array;
        }


    public static void generateArrayWithBounds(Scanner scanner) {

        System.out.print("\nEnter the start number Here->: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number Here ->: ");
        int end = scanner.nextInt();

        System.out.print("Enter the step Here ->: ");
        int step = scanner.nextInt();

        int[] result = generateArrayWithBounds1(start, end, step);

        System.out.println("Generated array:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] generateArrayWithBounds1(int start, int end, int step) {
        int length = (end - start - 1) / step + 1;
        int[] array = new int[length];
        int value = start;
        for (int i = 0; i < length; i++) {
            array[i] = value;
            value += step;
        }
        return array;
    }
}
