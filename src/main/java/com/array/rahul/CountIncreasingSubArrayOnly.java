package com.array.rahul;

//https://www.techiedelight.com/count-strictly-increasing-sub-arrays/
public class CountIncreasingSubArrayOnly
{
	// Function to count the number of strictly increasing sub-arrays in an array
	public static int getCount(int[] arr)
	{
		// stores the count of strictly increasing sub-arrays
		int count = 0;

		// consider all sub-arrays arr[i, j] starting from index i
		// and ending at index j
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				// if previous element is not less than the current element,
				// then the sub-array arr[i, j] is not strictly increasing
				if (arr[j - 1] >= arr[j])
				{
					// don't consider index from j+1 onwards
					break;
				}

				// if the sub-array arr[i, j] is strictly increasing,
				// increment the total count
				++count;
			}
		}

		// return the count of strictly increasing sub-arrays
		return count;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 4, 4, 5,6,6 };

		System.out.print("The number of strictly increasing sub-arrays are "
								+ getCount(arr));
	}
}