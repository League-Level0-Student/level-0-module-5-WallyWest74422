package _99_extra;

public class ReturnTypesPractice {
	public static void main(String[] args) {
		// GOAL: Figure out what each of these hidden methods returns
		// 1. Call each method
		
		// 2. Save the return of each method into a variable of the correct type(ex: String,int,etc)
		
		// 3. Print out each variable
		method1();
		int one= HiddenTypes.unknown1;
		System.out.println(one);
		
		method2();
		double two= HiddenTypes.unknown2;
		System.out.println(two);
		
		method3();
		String three= HiddenTypes.unknown3;
		System.out.println(three);
		
		method4();
		char four= HiddenTypes.unknown4;
		System.out.println(four);
		
		method5();
		boolean five= HiddenTypes.unknown5;
		System.out.println(five);
	}
	
	static int method1() {
		return HiddenTypes.unknown1;
	}
	static double method2() {
		return HiddenTypes.unknown2;
	}
	static String method3() {
		return HiddenTypes.unknown3;
	}
	static char method4() {
		return HiddenTypes.unknown4;
	}
	static boolean method5() {
		return HiddenTypes.unknown5;
	}

}
