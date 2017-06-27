

import java.util.Scanner;

public class H_1248 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();   
		for(int i = 0; i < T; i++) {
			int min = Integer.MAX_VALUE;
			int N = scanner.nextInt();
			for(int j = 0; j <= N / 150; j++) {
				for(int k = 0; k <= N / 200; k++) {
					for(int l = 0; l <= N / 350; l++) {
						int temp = j * 150 + k * 200 + l * 350;
						if(temp <= N) min = Math.min(N-temp, min);
						else {
							break;
						}
					}
				}
			}
			System.out.println(min);
		}
	}
}
