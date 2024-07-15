package kcc.mission;

public class Mission {
	public static void main(String[] args) {
		// 1-1)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + (5 * (i - 1)) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-2)
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + (5 * (i - 1)) + " ");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-3)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(((2 * j)) + ((10 * (i - 1)) - 1) + " ");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-4)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-5)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * (i - 1) / 2 + j + " ");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-6)
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-7)
		int num = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();

		// 1-8)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((i - 1) + j + " ");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-9)
		int num9 = 0;
		for (int i = 5; i >= 1; i--) {
			num++;
			for (int j = 1; j <= i; j++) {
				System.out.print(j + (num - 1) + " ");
			}
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 1-10)
		int num10 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-1)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-2)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-3)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-4)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=(5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-5)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-6
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= (5 - i); l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= (5 - i); m++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= (2 * i) - 1; n++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= (5 - i); l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= (5 - i); m++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= (2 * i) - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		-----------------------------------------------------------------------------
		System.out.println();
		
		// 2-7)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= 2 * (5 - i); l++) {
				System.out.print(" ");
			}
			for (int m = 1; m < (2 * i) - 1; m++) {
				System.out.print("*");
			}
			for (int o = 1; o <= 2 * (5 - i) + 1; o++) {
				System.out.print("*");
			}
			for (int n = 1; n < (2 * i) - 1; n++) {
				System.out.print("*");
			}
			for (int l = 1; l <= 2 * (5 - i); l++) {
				System.out.print(" ");
			}
			for (int q = 1; q <= (2 * i) - 1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
