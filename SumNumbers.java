class SumNumbers
{
    public static void findSum() 
	{

        int i = 1;
        int sum = 0;

        while(i <= 10) 
		{
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}