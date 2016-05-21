class ArmstrongNumber
{
    public static void main(String args[])
    {
		//Read Command Line Argument
        int num = Integer.parseInt(args[0]); 
        int n = num; //use to compare at If stmt
        int check=0;
		int remainder;
		
        while(num > 0)
        {
            remainder = num % 10;
            check = check + (int)Math.pow(remainder,3);
            num = num / 10;
        }
		
        if(check == n)
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is not a Armstrong Number");
    }
}