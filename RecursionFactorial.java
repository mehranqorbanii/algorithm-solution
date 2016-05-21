import java.io.*;

class Factorial
{
    int fact(int n)
    {
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
}

class RecursionFactorial
{
    public static void main(String args[]) throws IOException
    {
        int no;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number: ");
        no = Integer.parseInt(br.readLine());
 
        if(no<0)
        {
            System.out.println("Negative number is not acceptable.");
        }
 
        else
        {
            Factorial f=new Factorial();
            System.out.println("Factorial of "+no+" is: "+f.fact(no));
        }
    }
}