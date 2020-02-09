package _02_fibonacci;

public class FiBoNaCcheee {
public static void main(String[] args) {
	int fibo=0;
	int nacci=1;
	System.out.println(fibo);
	System.out.println(nacci);
	int fibonacci=0;
	for(int i=0;i<10;i++) {
fibonacci=fibo+nacci;
	 System.out.println(fibonacci);
	fibo=nacci;
	nacci=fibonacci;
	fibonacci=fibo+nacci;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
