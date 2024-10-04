import java.util.Scanner;

class MultiplicationTable {
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the multiplication table: " );
		int arr_size = scanner.nextInt();
		int [][] num_arr = new int[arr_size][arr_size];
		
		System.out.println("Multiplication Table:");
		for(int i = 1; i <= num_arr.length; i++){
		    for (int j = 1; j <= num_arr.length; j++){
		        int number = i * j;
		        num_arr[i-1][j-1] = number;
                System.out.printf("%4d", number);
		    }
		    System.out.println();
		}
		scanner.close();
    }
}
