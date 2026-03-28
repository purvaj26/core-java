class Factorial 
{
    public static void calculateFactorial(int num) 
	{
        int i = 1;
        int fact = 1;

        while(i <= num) 
		{
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial = " + fact);

    }
}