package HomeworkAssignment5Driver;

public class HomeworkAssignment5 {
public static int count = 0;
	public static void main(String args[])
	{
		System.out.println("Fibonacci(3): " + Fibonacci(5));
		System.out.println("Number of times run: " + count);
	}
	public static int Fibonacci(int num)
	{
		count++;
		if (num >= 2)
	    {           
            return Fibonacci(num-1) + Fibonacci(num-2);

	    }
	    else
	    {		 
	       return 1; 
	    }

	}
}
