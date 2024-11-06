//sum of first and last element of array
class ArrayEx
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,40,50};
		int n = numbers.length;
		int sum = numbers[0]+numbers[n-1];
		System.out.println("sum of first and last :"+sum);

		
	}
}
