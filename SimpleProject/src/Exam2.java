import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SUM = 0, N1, N2, N;
		Scanner StdInupt = new Scanner(System.in);
		N1 = StdInupt.nextInt();
		N2 = StdInupt.nextInt();
		for (N = N1; N <= N2; N++) {
			SUM = SUM + N;
		}
		System.out.println(N1 + "부터 " + N2 + "까지의");
		System.out.println("정수의 합은" + SUM + "이다");
	}

}
