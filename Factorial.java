import java.io.*;
import java.lang.*;
 
class Factorial
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Enter Number: ");
        int num=Integer.parseInt(br.readLine());
 
        int result = 1;
        while(num>0)
        {
            result = result * num;
            num--;
        }
        System.out.println("Factorial of Given Number is : "+result);
    }
}