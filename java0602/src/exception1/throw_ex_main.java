package exception1;

public class throw_ex_main {

	public static void main(String[] args) {
		
		throw_ex te=new throw_ex();
		te.cal();
		try
		{
			te.cal2();	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열에외");
		}
		
		System.out.println("다른 내용");

	}

}
