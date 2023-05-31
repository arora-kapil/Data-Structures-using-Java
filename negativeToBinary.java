
public class negativeToBinary{
    public static void main(String[] args) {
        int decimalNumber = -10; // The negative decimal number you want to convert

        // Convert the negative decimal number to binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Print the binary representation
        System.out.println("Binary representation: " + binaryNumber);
    }

    public static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        int absValue = Math.abs(decimalNumber);

        
        while (absValue > 0) {
            binary.insert(0, absValue % 2);
            absValue /= 2;
        }

        // Add sign bit for negative numbers
        if (decimalNumber < 0) {
            binary.insert(0, "1");
        }

        return binary.toString();
    }
}
