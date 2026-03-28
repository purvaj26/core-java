class ReverseNumber 
{
    public static void reverse(int num) 
	{
        int rev = 0;
        while(num != 0) 
		{
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse = " + rev);
    }
}