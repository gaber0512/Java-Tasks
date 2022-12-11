import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[5];
        System.out.print("Enter The Values:");
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("Enter The Value["+i+"]:");

            arr[i] = input.nextDouble();
        }

        double max = arr[0];
        for (double num : arr) {
            if (max < num)
                max = num;
        }
        System.out.println("Max element =" + max);

    }
}
