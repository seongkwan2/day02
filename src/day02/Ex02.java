package day02;

public class Ex02 {
	public static void main(String[] args) {
		int num = 123;
		char ch = 'a'; //char에 사용하는 문자는 ' ' 작은 따옴표를 사용해야한다.
		System.out.println("변경전");
		System.out.println("num : "+num);
		System.out.println("ch : "+ch);
		
		System.out.println("변경후");
		num = 500;
		ch = 'B';
		System.out.println("num : "+num);
		System.out.println("ch : "+ch);
		
		num = num + 200;
		System.out.println("num : "+num);
	}
}
