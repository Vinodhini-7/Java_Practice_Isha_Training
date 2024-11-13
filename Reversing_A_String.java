package basics_homework;

public class Reversing_A_String {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Reversing_A_String obj=new Reversing_A_String();
		obj.reversingastring();

	}

	void reversingastring()
	{
		String A="Nilkamal  ";
		int AA = A.length();
		char[] Achar=A.toCharArray();
		//System.out.println(Achar);
		 	System.out.println(AA);
		 	for(int i=AA-1;i>=0;i--)
		 	{
		 		
		 		System.out.print(Achar[i]);
		 		
		 	}
			
	}
	
}
