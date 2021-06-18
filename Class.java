package odd;

public class Product_Of_OddNo {
	
	public void Product_of_oddno()
	{
		int i=0;
		int sum=1;
		
		for(i=1;i<=15;i+=2)
		{
			sum=sum*i;
			
		}
		System.out.printf("\nOdd Number Cumulative value from 1 t0 15: %d",sum);	
		System.out.printf("\n\nValue %d has been finalized ", sum);
	}
}
