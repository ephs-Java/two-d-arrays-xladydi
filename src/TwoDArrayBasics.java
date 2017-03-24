import java.util.Random;
public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 10);
		// test each method you create below.
		print(nums);
		System.out.println();
		System.out.println(rowSum(nums, 1));
		int[] sumArray = rowSumArray(nums);
		for (int i = 0; i < sumArray.length; i++) {
			System.out.println(i + ": " + sumArray[i]);
		}
		System.out.println(isUnique(sumArray));
		findIndex(nums, 1);
		System.out.println(min(nums));
		System.out.println(max(nums));

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for(int row = 0; row < nums.length; row++) {
			for (int cols = 0; cols < nums[0].length; cols++) {
				nums[row][cols] = random.nextInt(high) + low;
			}
		}
	}
	
	/*
	 * create a method that prints a 2D array
	 */
	
	public static void print(int[][] nums) {
		for (int row = 0; row < nums.length; row++) {
			System.out.print("{\t");
			for (int cols = 0; cols < nums[0].length; cols++) {
				System.out.print(nums[row][cols] + "\t");
			}
			System.out.println("}");
		}
	}
	
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int rowSum(int[][] nums, int row) {
		int total = 0;
		for (int cols = 0; cols < nums[row].length; cols++) {
			total += nums[row][cols];
		}
	    return total;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSumArray(int[][] nums) {
		int[] sumArray = new int[nums.length];
		for(int row = 0; row < nums.length; row++) {
			int total = 0;
			for (int cols = 0; cols < nums[0].length; cols++) {
				total += nums[row][cols];
			}
			sumArray[row] += total;
		}
		return sumArray;
	}
	

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean isUnique(int[] array) {
		int[][] nums = new int[2][array.length];
		for(int row = 0; row < nums.length; row++) {
			for (int cols = 0; cols < nums[0].length; cols++) {
				nums[row][cols] = array[cols];
			}
		}
		int index = 0;
		for (int cols = 1; cols < nums[0].length; cols++) {
			if (nums[0][cols] == nums[1][index]) {
				return false;
			}
			index++;
		}
		return true;
	}
	

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static void findIndex(int[][] nums, int value) {
		boolean found = false;
		for(int row = 0; row < nums.length; row++) {
			for (int cols = 0; cols < nums[0].length; cols++) {
				if (nums[row][cols] == value) {
					System.out.println("Row " + row + ", " + "column " + cols);
					found = true;
				}
			}
		}
		if (found == false) {
			System.out.println(-1);
		}
		
	}

	
	
	/*
	 * return the min value in a 2D array
	 */
	
	public static int min(int[][] nums) {
		int min = 11;
		for(int row = 0; row < nums.length; row++) {
			for (int cols = 0; cols < nums[0].length; cols++) {
				min = Math.min(nums[row][cols], min);
			}
		}
		return min;
		
	}
	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	
	public static int max(int[][] nums) {
		int max = -1;
		for(int row = 0; row < nums.length; row++) {
			for (int cols = 0; cols < nums[0].length; cols++) {
				max = Math.max(nums[row][cols], max);
			}
		}
		return max;
		
	}
	

	
	
	
}
