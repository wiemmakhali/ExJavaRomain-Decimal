public class DB {
    // function for converting binary to decimal number
    public static int decimalVersBinaire(int decimalNumber ){
        int binaryNumber = 0;
        int power = 0;
        while(binaryNumber > 0){
            //taking the rightmost digit from binaryNumber
            int temp = binaryNumber%10;
            //now multiplying the digit and adding it to decimalNumber variable
            decimalNumber += temp*Math.pow(2, power);
            //removing the rightmost digit from binaryNumber variable
            binaryNumber = binaryNumber/10;
            //incrementing the power variable by 1 to be used as power for 2
            power++;
        }
        return binaryNumber;
    }

    public static void main(String args[]){
        System.out.println("Binary value is: "+decimalVersBinaire(111010));
        System.out.println("Binary value is: "+decimalVersBinaire(001010));
    }
}