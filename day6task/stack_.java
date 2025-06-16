package day6;

public class stack_ {
	int mystack[]=new int[5];
	int top=-1;
	
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("stack overflow");
		}
		else
		{
			mystack[++top]=num;
		}
	}
	public void pop()
	{
		if(top<0) {
			System.out.println(mystack[top]+" popped out");
			--top; }
	}

		public void display()
		{
			for(int i=0;i<mystack.length;i++)
			{
				System.out.print(mystack[i]+" ");
		}
		}
	}


