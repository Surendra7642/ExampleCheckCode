//Display the last number is perfect or not 
class  ArrayEx1
{
	public static void main(String[] args) 
	{
		int[] arr = {7,2,9,4,3};
		int n = arr[arr.length-1];
		System.out.println(n);
		int sum = 0;
		for(int i =1;i<=n-1;i++)
		{
			if(n%i==0)
			{
				sum = sum +i;
			}
		}
		if(n == sum){
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}

}
//declare the array
//get the last number 
//take an sum variable 
//iterate the loop over an array
//if(n%i == 0) 
//sum = sum +i;
//if close
//else close
//if(n == sum) print perfect otherwise print not perfect



