import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Please add integer number: ");

        //add an integer number
        int number=scanner.nextInt();

        // Convert the integer to a string
        String convertedNumber=String.valueOf(number);

        // Print the converted string
        System.out.println("Converted string: " + convertedNumber);
    }
}