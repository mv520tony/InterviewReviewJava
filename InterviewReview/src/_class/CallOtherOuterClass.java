package _class;

public class CallOtherOuterClass {

	public static void main(String[] args) {
		//Outer class是屬於獨立的class，故其他的class可以call他
		Example1 example = new Example1();
		example.echo();
	}

}
