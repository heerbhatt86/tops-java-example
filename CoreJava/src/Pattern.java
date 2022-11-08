public class Pattern {
	public static void main(String[] args) {
		int i, j, k, num = 1;
		for (i = 0; i < 10; i++) {
			for (k = 1; k < 10 - i; k++) {
				System.out.print(" ");
			}
			int counter = 1;
			for (j = 0; j <= i; j++) {
				if (counter % 2 == 0) {
					System.out.print(" *");
					num = num + 1;
				} else {
					System.out.print(" " + num);
					num = num + 1;
				}
				counter++;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
