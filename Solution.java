import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), m = fs.nextInt();
			if ((n - 1) % 2 != (m - 1) % 2) {
				System.out.println("Burenka");
			} else {
				System.out.println("Tonya");
			}
		}
		fs.close();
	}
}
