import java.util.Scanner;
class GettingGreater {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Getting the Greeater Value");
    	System.out.print("Enter first character: ");
    	char firstChar = scanner.next().charAt(0);
    	int firstCharValue = firstChar;
     	System.out.print("Enter second character: ");
    	char secondChar = scanner.next().charAt(0);
    	int secondCharValue = secondChar;
    	System.out.println("----------------------------------------");
    	System.out.println("The characte with greater value is: " + Math.max(firstCharValue, secondCharValue));
    	System.out.println("----------------------------------------");
    	System.out.println("Showing the ASCII Codes");
    	System.out.println(firstChar + " : " + firstCharValue);
    	System.out.println(secondChar + " : " + secondCharValue);
    }
}