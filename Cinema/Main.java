package cinema;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int row,no,w1=0,w2=0;
		int movie,session;
		int number=0;
		int ticket;

		Calculate c=new Calculate();
		Menu m=new Menu();
		Arrays [] a=new Arrays[9];
		for(int i=0;i<9;i++)
		{
			a[i]=new Arrays();
		}
		
		while(w1==0)
		{
			number=0;
			w2=0;
			m.Movies();
			System.out.print("Choose Movie : ");
			movie=obj.nextInt();
			m.Sessions();
			System.out.print("Choose Session : ");
			session=obj.nextInt();
			System.out.println("\n\n");
			a[ ((movie-1)*2)+(session-1)].Print();
			
			while(w2==0)
			{
				System.out.print("Row Number : ");
				row=obj.nextInt();
				System.out.print("Column Number : ");
				no=obj.nextInt();
				System.out.println("\n\n");
				if(a[ ((movie-1)*2)+(session-1)].Check(row-1, no-1)==0)
				{
					System.out.println("-- Choose Someone Else --\n");
					w2=0;
				}
				if(a[ ((movie-1)*2)+(session-1)].Check(row-1, no-1)==1)
				{
					number++;
					a[ ((movie-1)*2)+(session-1)].Choose(row-1, no-1);
					a[ ((movie-1)*2)+(session-1)].Print();
					m.Ticket();
					ticket=obj.nextInt();
					if(ticket==1)
					{
						continue;
					}
					if(ticket==2)
					{
						System.out.print(c.calculate_price(number)+"$");
						w2=1;
					}
				}
					
			}
				
		}
		
	}
}
