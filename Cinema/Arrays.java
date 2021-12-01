package cinema;

public class Arrays{
	private String[][] cinema= { {"1","2","3","4","5","6","7","8","9"},{"1","2","3","4","5","6","7","8","9"},{"1","2","3","4","5","6","7","8","9"},{"1","2","3","4","5","6","7","8","9"},{"1","2","3","4","5","6","7","8","9"},{"1","2","3","4","5","6","7","8","9"}};
	
	public void Choose(int x,int y)
	{
		cinema[x][y]="X";
	}
	
	public int Check(int x,int y)
	{
		if(cinema[x][y]=="X")
		{
			return 0;
		}
		else {
			return 1;
		}
			
		
		
	}
	
	public void Print()
	{
		for(int i=0;i<6;i++)
		{
			System.out.print("Row "+(i+1)+" ");
			for(int j=0;j<9;j++)
			{
				System.out.print("["+cinema[i][j]+"]");
			}
			System.out.print("\n");
		}
	}
	
}
