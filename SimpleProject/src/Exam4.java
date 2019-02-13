
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		int n, Fact = 1;

		Scanner StdInput = new Scanner(System.in);
		n = StdInput.nextInt();
		System.out.print(n);
		while (n > 0) {
			Fact = n * Fact;
			n = n - 1;
		}
		System.out.println("의 누승은 " + Fact + "입니다");

	}
}
