class SumDigitsInteger { 

    public static void main(String[] args) {
        System.out.println("sum: " + sumDigits(234)); 
    } 

    private static int sumDigits(int digits) {
        int sum = 0; 
        while ( digits > 0 )
        {
            sum += digits % 10; 
            digits /= 10;
        }

        return sum;
    }
}