package org.java;

 class Addition1 {

	void override(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
		
	}
}
	class  Subtraction extends Addition1{
		void override(int a,int b)
		{
			int d=a-b;
			System.out.println(d);
			
		}
	}
	class Multiplication extends Subtraction{
		void override(int a,int b)
		{
			int e=a*b;
			System.out.println(e);
		}
	}
		class Division extends Multiplication{
			void override(int a,int b) {
				int f=a/b;
				System.out.println(f);
			}
		}
		public class Addition
		{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 add= new Addition1();
		add.override(22, 4);
		Subtraction sub=new Subtraction();
		sub.override(60, 50);
		Multiplication mul= new Multiplication();
		mul.override(2, 3);
		Division div=new Division();
		div.override(3, 5);

	}

	
		}		

