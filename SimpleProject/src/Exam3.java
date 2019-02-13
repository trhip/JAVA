
public class Exam3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUM[] = { 70, 60, 50, 80, 90 };
		int MIN = 9999, N;
		for (N = 0; N < NUM.length; N++) {
			if (MIN > NUM[N]) {
				MIN = NUM[N];
			}
		}
		System.out.println("배열 NUM의 원소들 중에서 최솟값은");
		System.out.println(MIN + " 입니다");
	}
}
