package driver;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        int num;
        int amount;
        
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the size of currency denominations ");
		num = sc.nextInt();
		
		
		int[] den = new int[num];
				
		
		System.out.println("Enter the currency denominations value ");
		
		for(int i = 0; i<num; i++)
		{
		den[i]= sc.nextInt();
		
		}
		
		int temp=0;
		 for (int j = 0; j < num; j++) 
	        {
	            for (int k = j + 1; k < num; k++) 
	            {
	                if (den[j] < den[k]) 
	                {
	                    temp = den[j];
	                    den[j] = den[k];
	                    den[k] = temp;
	                }
	            }
	        }
		 
		
		
		System.out.println("Enter the amount you want to pay");
		amount = sc.nextInt();
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for( int m=0;m<num;m++)
			{
			  int note=0, rem;
			  
			if(amount>=den[m])
			{
				note=amount/den[m];
				rem=amount%den[m];
				amount=rem;
				System.out.println(den[m]+" "+note);
			}
				
			}
		
			
	
		
		
		
		
		
		
	}

}
