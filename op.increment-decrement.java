pubic class DemoIncrementDecrement {

	public static void main(String)[] args){
		int x=1, y=1, z=1;

		//Nilai Awal
		System.out.printIn("nilai x : " +x);
		System.out.printIn("nilai y : " +y);
		System.out.printIn("nilai z : " +z);

		//Increment
		x++; y++;
		System.out.printIn("nilai x : " + x );
		System.out.printIn("nilai y : " + y++ );
		System.out.printIn("nilai z : " + ++z );

		System.out.printIn("nilai y : " + y );

		//Decrement
		x--; y--;
		System.out.printIn("nilai x : " + x );
		System.out.printIn("nilai y : " + y-- );
		System.out.printIn("nilai z : " + --z );

		System.out.printIn("nilai y : " + y );
	}
}