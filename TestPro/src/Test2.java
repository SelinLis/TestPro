import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner gg = new Scanner(System.in);
		String name = gg.next();
		int age = gg.nextInt();
		int bornYear = 2024 - age;
		System.out.println("Your name:"+name);
		System.out.println("Your born year:"+bornYear);
		gg.close();
	}
}
