import java.util.Scanner;

class Escseq {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a Celcius value: ");
		double celcius = scanner.nextInt();
		double faren = (celcius*9/5)+32;
        System.out.println("" + String.format("%.2f Celcius is ", celcius) + String.format("%.2f Fahrenheit", faren));   
        }
}
