public class Fibonacci2{
    public static int fib (int n){
        int prev1 = 0;
        int prev2 = 1;
        int temp;
        
        for(int i = 0; i<n; i++){
            temp = prev1;
            prev1 = prev2;
            prev2 = temp + prev1;
        }
        
        return prev1;
    }
    
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            System.out.println(fib(i) + " ");
        }
    }
}