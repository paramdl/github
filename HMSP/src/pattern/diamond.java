package pattern;

public class diamond 
{
	public static void main(String[] args) 
	{
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print("");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(" * ");
			}
			star=star+2;
			space--;	
			System.out.println( );
		}
		int star1=5;
		int space1=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print("");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print(" * ");
			}
			star1=star1-2;
			space1++;
			System.out.println();
		}
	}
}
