package session_02_java_assignment_03;

public class FindLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40,b=60,c=30,max=0;
		if((a>b && b>c) || (a>c && c>b) )
		{
			max=a;
			//System.out.print("The largest no is " + max);
		}
		else if((b>a && a>c )||(b>c && c>a))
		{
			max=b;
			//System.out.print("The largest no is " + max);
		}
		
		else if((c>a && a>b)||(c>b && b>a))
		{
			max=c;
			//System.out.print("The largest no is " + max);
		}
		
		
		
		System.out.print("The largest no is " + max);
	}

}
