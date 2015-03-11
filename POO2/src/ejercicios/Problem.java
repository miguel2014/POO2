package ejercicios;

public class Problem {
	String s;
	 class Inner {
		void testMethod() {
			s = "Set from Inner";
		}
	}
	 public static void main(String[] args) {
		Problem p=new Problem();
		Problem.Inner i=p.new Inner();
		i.testMethod();
		System.out.println(p.s);
	}
}
