package week3.day1;

public class Calculator {
 public int add(int a, int b) {
	 return a+b;
 }
 public int add(int a, int b, int c) {
	 return a+b+c;
 }
 
 public int sub(int a, int b) {
	 return a-b;
 }
 public double sub(double a, double b) {
	 return a-b;
 }
 public int mul(int a, int b) {
	 return a*b;
 }
 public double mul(int a, double b) {
	 return a*b;
 }
 
 public static void main(String[] args) {
	Calculator mycal = new Calculator();
	System.out.println("Add two integers: "+mycal.add(11, 22));
	System.out.println("Add three integers: "+mycal.add(11, 22,33));
	System.out.println("Sub two integers: "+mycal.sub(22, 12));
	System.out.println("Sub two double : "+mycal.sub(11.5, 2.2));
	System.out.println("Mulitple two integers: "+mycal.mul(10, 22));
	System.out.println("Multiple 1 integer and double : "+mycal.mul(11, 22.5));
}

}
