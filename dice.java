package training;
import java.util.Random;
import java.util.Scanner;

public class dice {
	int side;
	String a[]= {"one","two","three","four","five","six"};
	dice(int n)
	{
		side=n;
	}
  public String ran()
  {
	 return a[new Random().nextInt(side)];
  }
}
class testdice
{
	public static void main(String[] args)
	{
		System.out.println("Enter size of dice 2,4 or 6");
		Scanner sc= new Scanner(System.in);
		int s=sc.nextInt();
		if(s==2||s==4||s==6)
		{
		dice d=new dice(s);
		System.out.println(d.ran());
	}
		else
			System.out.println("Invalid Output");
}
}
