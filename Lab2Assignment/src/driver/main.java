package driver;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n = s.nextInt();
		int Tar;
		int Value;
		int i;
		
		
		int[] Trans = new int[n];
		
		System.out.println("Enter the values of array");
		for(i=0;i<n;i++)
		{
			
			Trans[i]= s.nextInt();
			
		}
		
		System.out.println("Enter the Total no of targets to be achieved");
		Tar = s.nextInt();
		for(int j=0;j<Tar;j++)
		{
			 int sum=0;
			 int match=0;
			System.out.println("Enter the value of Target");
			Value=s.nextInt();
			for(i=0;i<n;i++)
			{
				sum= sum+Trans[i];
				if(sum>=Value)
				{
					match=1;
					System.out.println("Target achieved after "+(i+1)+" transaction");
					break;
				}
			}	
		
			if(match==0)
				System.out.println("Target not achieved");
			
		
		// TODO Auto-generated method stub

	}

	}
	
}
