
package strinng;

import java.util.Scanner;

public class Strinng {

    public static void main(String[] args) {

        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Text with comma(,): ");
        text = input.nextLine();
        text = text.replaceAll(",", "");
        System.out.println("The Text After Replacing: " + text);
    }

}
