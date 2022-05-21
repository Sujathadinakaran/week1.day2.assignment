package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInArray 
{

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		//Initialize Array of Integers
		int[] arr = {1,2,5,3,7,6,8};
		
		//sort he Array in Ascending order
		Arrays.sort(arr);
		
		//Loop the Array element
		for(int i=0;i<arr.length;i++) 
		{
			//Logic to identify the missing number in array
			if (arr[i]!=(i+1))
			{
				//Print the missing number
				System.out.println("Missing Number:" +(i+1));
				break;
			}
			}
			
		}
	}


