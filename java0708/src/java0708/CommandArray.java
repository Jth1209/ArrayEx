package java0708;

public class CommandArray {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		if(args.length > 2) {
			for(int i = 0; i <args.length; i++) {
				System.out.println("i번째 문자는" + args[i] + "입니다.");
			}
		}
	}

}
