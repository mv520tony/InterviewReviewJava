package _class;

public class InnerClass {

	public String publicStr = "outer public string";
	private String privateStr = "outer private string";
	
	//*************** inner class ***************
	public class Example {
		public void echo() {
			System.out.println("***public inner class***");
		}
		public void callOuterVal() {
			System.out.println(publicStr);
			System.out.println(privateStr);
		}
	}
	
	private class Example1 {
		public void echo() {
			System.out.println("***private inner class***");
		}
		public void callOuterVal() {
			System.out.println(publicStr);
			System.out.println(privateStr);
		}
	}
	
	static class Example2 {
		public static void echo() {
			System.out.println("***static inner class***");
		}
		
		public static void callOuterVal() {
		System.out.println("If want to call outer object, outer variable need to set static");
		//如果把mark拿掉會出現紅字
//			System.out.println(publicStr);
//			System.out.println(privateStr);
		}
	}
	//*************** inner class ***************
	
	public void callPubInnerClz() {
		Example example = new Example();
		example.echo();
		example.callOuterVal();
	}
	
	public void callPriInnerClz() {
		Example1 example = new Example1();
		example.echo();
		example.callOuterVal();
	}
	
	public void callStsInnerClz() {
		Example2.echo();
		Example2.callOuterVal();
	}
	
	public static void main(String[] args) {
		InnerClass innerClass = new InnerClass();
		//Public innerClass call variable
		innerClass.callPubInnerClz();
		//Private innerClass call variable
		innerClass.callPriInnerClz();
		//Sttic innerClass call variable
		innerClass.callStsInnerClz();
	}

}
