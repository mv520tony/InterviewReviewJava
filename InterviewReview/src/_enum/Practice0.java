package _enum;
/**
 * enum: 無參數
 * enum: 一個參數
 * enum: 二個參數
 * enum: case switch
 *
 */
public class Practice0 {

	public static void main(String[] args) {
		Practice0 pracitce = new Practice0();
		//Status1--return Fail
		System.out.println(Status1.Fail);
		//Status2--return fail
		System.out.println(Status2.Fail.getCode());
		//Status3--return fail and 1
		System.out.println(Status3.Fail.getCode() + "," + Status3.Fail.getCodeNum());
		//使用switch case
		pracitce.enumSwitchCase();
	}
	
	public void enumSwitchCase(){
		Status1 status = Status1.Suceess;
		switch(status) {
		case Suceess:
			System.out.println("echo success");
			break;
		case Fail:	
			System.out.println("echo fail");
			break;
		}
	}

}
//無參數，只有string
enum Status1 {
	Suceess, Fail;
}
//一個參數
enum Status2 {
	Suceess("sucess") , Fail("fail");
	
	private String code;
	
	private Status2 (String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
//兩個參數
enum Status3 {
	Suceess("sucess", 0) , Fail("fail", 1);

		private String code;
		private int codeNum;
		
		private Status3 (String code, int codeNum) {
			this.code = code;
			this.codeNum = codeNum;
		}
		
		public String getCode() {
			return code;
		}
		
		public int getCodeNum() {
			return codeNum;
		}
}
