public class DemoBitwise {
	public static void main (string args []) {
		int x = 5, y= 6;
		System.out.printIn("x = " + x);
		System.out.printIn("y = " + y);
		System.out.printIn("x & y = " + (x & y));
		System.out.printIn("x | y = " + (x | y));
		System.out.printIn("x ^ y = " + (x ^ y));

		//komplemen
		int z = 8;
		System.out.printIn("z = " + z);
		
		int a = ~z;
		System.out.printIn("a = " + a);
	}
}