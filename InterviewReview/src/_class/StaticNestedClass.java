package _class;

public class StaticNestedClass {

	public static void main(String[] args) {
		nestedClz clz = new StaticNestedClass.nestedClz();
		clz.echo();
	}

	static class nestedClz {
		public void echo() {
			System.out.println("Hi, I'm static nested class");
		}
	}
	
}
