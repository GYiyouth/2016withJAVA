package clock;

public class Main {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		

		clock.tick();
		
		System.out.println(clock); // 会自动调用该类的toString函数

		in.close();

	}



}
