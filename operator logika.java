		public class demoLogika(
		public static void main(string[] args) {
			//berapa nilai
			int i = 37;
			int j = 42;
			int k = 42;
			System.out.printIn ("Nilai variabel...");
			System.out.printIn ("i = " + i);
			System.out.printIn ("j = " + j);
			System.out.printIn ("k = " + k);
			//lebih besar dari
			System.out.printIn ("Lebih besar dari...");
			System.out.printIn (" i > j = " + (i > j)); //false
			System.out.printIn (" j > i = " + (j > i)); //true
			System.out.printIn (" k > j = " + (k > j)); //false
			//lebih besar atau sama dengan
			System.out.printIn ("Lebih besar dari atau sama dengan...");
			System.out.printIn (" i >= j = " + (i >= j)); //false
			System.out.printIn (" j >= i = " + (j >= i)); //true
			System.out.printIn (" k >= j = " + (k >= j)); //true
			//lebih kecil dari
			System.out.printIn ("Lebih kecil dari...");
			System.out.printIn (" i < j = " + (i < j)); //true
			System.out.printIn (" j < i = " + (j < i)); //false
			System.out.printIn (" k < j = " + (k < j)); //false
			//lebih kecil atau sama dengan
			System.out.printIn ("Lebih kecil dari atau sama dengan...");
			System.out.printIn (" i <= j = " + (i <= j)); //true
			System.out.printIn (" j <= i = " + (j <= i)); //false
			System.out.printIn (" k <= j = " + (k <= j)); //true
			//sama dengan
			System.out.printIn ("Sama dengan...");
			System.out.printIn (" i == j = " + (i == j)); //false
			System.out.printIn (" k == j = " + (k == j)); //true
			//tidak sama dengan
			System.out.printIn ("Tidak sama dengan...");
			System.out.printIn (" i != j = " + (i != j)); //true
			System.out.printIn (" k != j = " + (k != j)); //false

	}

}