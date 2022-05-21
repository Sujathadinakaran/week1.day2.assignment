package week1.day2.assignment;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j;
		
		//Initialize the Array
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		//For loop the array element
		for(i=0; j=0; i<arr1.length&&j<arr1.length;i++,j++)
		{
			//find the intersection of each array
			if(arr1[i]==arr2[j])
			{
				//print the matching element
				System.out.println("Intersection element:" +arr1[i]);
			}
		}
	}
}
