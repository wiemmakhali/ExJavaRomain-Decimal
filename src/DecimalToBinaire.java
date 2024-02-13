
import java.util.Scanner;

public class DecimalToBinaire {
    // function for converting decimal to binary number
    public static String decimalVersBinaire(int decimalNumber) {
        String binaryNumber = "";

        while (decimalNumber > 0) {
            int res = decimalNumber % 2;
            binaryNumber =  res+ binaryNumber;
            decimalNumber = decimalNumber / 2;

        }
        return binaryNumber;
    }

    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner un nombre ");
        n = scanner.nextInt();
        System.out.println(" Le nombre décimal  " + n + "  en binaire est : " + decimalVersBinaire(n));
        scanner.close();
        // System.out.println("Decimal value is: "+getDecimalNumber(111010));
        // System.out.println("Decimal value is: "+getDecimalNumber(001010));

    }
}