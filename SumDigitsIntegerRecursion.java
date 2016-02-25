public class SumDigitsIntegerRecursion { 

    public static void main(String[] args) {
        System.out.println("sum: "+ sumDigits(234)); 
    } 

    private static int sumDigits(int digits) { 
        if (digits < 10) {
            return digits; 
        }

        return digits % 10 + sumDigits(digits/10);
    }
}