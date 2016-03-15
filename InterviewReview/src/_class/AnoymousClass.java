package _class;

public class AnoymousClass {

	public static void main(String[] args) {
		//[override method] override object的toString method
		Object obj = new Object() {
			public String toString() {
				return "[override method]Hi I'm amoyous class";
			}
		};
		System.out.println(obj);
		//[override abstract class] override abstract class
		AnonymousInner inner = new AnonymousInner() {
			public void echo() {
				System.out.println("[override abstract class]Hi I'm amoyous class");
			}
		};
		inner.echo();
		//[override interface]
		AnoymousClass clz = new AnoymousClass();
		clz.interfaceEcho(new AnonymousInterface() {
			@Override
			public void echo() {
				System.out.println("[override interface]Hi I'm amoyous class");
			}
			
		});
		
	}
	
	public void interfaceEcho(AnonymousInterface obj) {
		obj.echo();
	}
}

abstract class AnonymousInner {
	public abstract void echo();
}

interface AnonymousInterface {
	public void echo();
}

