import java.util.Scanner;

class book 
{
	String name,author;
	double price;
	int pages;
	book()
	{}
	Scanner s=new Scanner(System.in);
	void set()
	{
		System.out.println("Enter Book Name ");
	  	name=s.nextLine();
		System.out.println("Enter author name ");
		author=s.nextLine();
		System.out.println("Enter book price ");
		price=s.nextDouble();
		System.out.println("Enter number of pages in that book");
		pages=s.nextInt();
	}
	
	
		public String toString()
		{
		return("Name:"+name+"\nAuthor:"+author+"\nNumber of pages:"+pages+"\nBook Price:"+price);
			}
	
}

class lab3
{
	public static void main(String xx[])
		{
			Scanner ss=new Scanner(System.in);
			int n;
			System.out.println("Enter number of books ");
			n=ss.nextInt();
			book b[]=new book[n];
			for(int i=0;i<n;i++)
			{
			b[i]=new book();
			b[i].set();
			System.out.println(b[i]);
			}
		}
}