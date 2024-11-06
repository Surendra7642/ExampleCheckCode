import java.io.*;
class FileExceptionEx 
{
	public static void main(String[] args) 
	{
		File f = null;
		try{
			f= new File("abc.txt");
		}
		catch(Exception e)
		{
			System.out.println("File not present");
		}
		finally
		{
			if(f!=null)
			{
				f.close();
				System.out.println("file closed");
			}
		}
	}
}
