
public class Test {

	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 4, 6, 7, 6, 7, 5, 2 };
		int i = a.length - 1;
		int cnt = 0;
		while (i >= 0) {
			if (a[i] == 2)
				cnt++;
			i--;
		}
		System.out.print(cnt);
	}

}
