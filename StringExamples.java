//toCharArray() internal working
import java.lang.*;
class StringExamples 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("World");
		System.out.println(s1+"@"+s1.hashCode());
		System.out.println(s2+"@"+s2.hashCode());
		s1=s1.append(s2);
		System.out.println(s1+"@"+s1.hashCode());
		System.out.println(s2+"@"+s2.hashCode());

	}
}
