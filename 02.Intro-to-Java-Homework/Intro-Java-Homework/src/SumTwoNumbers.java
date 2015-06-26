import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = a + b;
		System.out.println(sum);

	}

}
