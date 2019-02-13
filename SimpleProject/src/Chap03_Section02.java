
public class Chap03_Section02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 0;
		int i = 0;
		int ENG[] = { 70, 60, 55, 90, 85, 75, 80, 100, 95, 45 };
		// 10명 학생들의 영어 점수
		int MATH[] = { 90, 45, 60, 77, 85, 65, 80, 100, 80, 100 };
		// 10명 학생들의 수학 점수
		while (true) {

			if (ENG[i] == 100) {
				if (MATH[i] > M)
					M = MATH[i];
			}
			i++;
			if(i>=10)break;
		}
		System.out.println(M);

	}

}
