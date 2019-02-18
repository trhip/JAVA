import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		int i;
		System.out.print("숫자를 입력하시오 : ");
		Scanner stdIn = new Scanner(System.in);
		i = stdIn.nextInt();
		recursive(i);
	}

	public static int recursive(int n) {
		int i;
		if (n < 1)
			return 2;
		else {
			i = (2 * recursive(n - 1)) + 1;
			System.out.printf("%d\n", i);
			return i;
		}
	}
}
