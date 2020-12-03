
package Day1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Report_Repair {
	
	public static int getSize() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("puzzle.text"));
		int count = 0;
		while (scan.hasNext()) {
			scan.nextLine();
			count++;
		}
		return count;
	}
	
	public static void read(int[] arr) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("puzzle.text"));
		
		for (int i = 0; scan.hasNext(); i++) {
			arr[i] = scan.nextInt();
		}
			
	}
	
	public static int findSumOfTwo(int[] arr, int size) {
		int firstNum = 0;
		int secondNum = 0;
		for (int i = 0; i < size; i++) {
			firstNum = arr[i];
			for (int j = 0; j < size - i; j++) {
				secondNum = arr[j + i];
				if (firstNum + secondNum == 2020) {
					System.out.println(firstNum + " " + secondNum);
					int product = firstNum * secondNum;
					return product;
				}
			}
		}
		return 0;
		
	}
	
	public static int findSumOfThree(int[] arr, int size) {
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		
		for (int i = 0; i < size; i++) {
			firstNum = arr[i];
			for (int j = 0; j < size - i; j++) {
				secondNum = arr[j + i];
				if (firstNum + secondNum == 2020) {
					System.out.println(firstNum + " " + secondNum);
					int product = firstNum * secondNum;
					return product;
				}
			}
		}
		return 0;
		
	}
		
	public static void main(String[] args) throws FileNotFoundException {
		int size = getSize();
		int[] arr =	new int[size];
		int productOfTwo;
		double productOfThree;
		read(arr);
		
		productOfTwo = findSumOfTwo(arr,size);
		System.out.println(productOfTwo);
		
		productOfThree = findSumOfThree(arr,size);
		
		
	}
	
}

