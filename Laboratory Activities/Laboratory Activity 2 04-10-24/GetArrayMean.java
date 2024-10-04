import java.util.Scanner;

class GetArrayMean {
    public static float getArrayMean(int []arr){
        float total = 0f;
        for (int idx = 0; idx < arr.length; idx++){
            total += arr[idx];
        }
        total /= arr.length;
        return total;
    }
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int arr_size = scanner.nextInt();
        int[] num_arr = new int[arr_size];
		scanner.nextLine();

		for (int idx = 0; idx < arr_size; idx++){
		    System.out.print("Enter number: ");
		    num_arr[idx] = scanner.nextInt();
		    scanner.nextLine();
		}
		
		float mean = getArrayMean(num_arr);
		System.out.printf("Mean of array is: %.2f", mean);
		scanner.close();
    }
}
