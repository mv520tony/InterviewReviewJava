package _class;

public class OuterClass {
	public static void main(String[] args) {
		//main class的main method 可以 call 外部class
		Example1 example = new Example1();
		example.echo();
	}
}


class Example1 {
	public void echo() {
		System.out.println("***call outer class***");
	}
}