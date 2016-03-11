package _enum;
/**
 * Case
 * ============================
 * enum: 無參數
 * enum: 一個參數
 * enum: 二個參數
 * enum: case switch
 * enum: enum to array
 * ============================
 * 關於enum說明
 * ============================
 * enum不可繼承其他類別，enum也不可能被繼承.
 * 可新增method在enum內.
 * enum只能宣告為獨立類別或類別成員,不可以在函式內.
 * enum是特殊類別,不可以實體化-不可以直接呼叫 enum的建構子(即不可用 new 產生 enum 物件).
 * enum的建構子只能用 private 或預設存取修飾子.
 * ============================
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
		//將enum轉為 array
		pracitce.enum2Array();
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
	
	public void enum2Array() {
		Status1[] array = Status1.values();
		System.out.println(array[0]);
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

