import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ascii;
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The ASCII Value :");
        ascii = input.nextInt();
        ch = (char) ascii;
        System.out.println("The character is " + ch);

    }
}
