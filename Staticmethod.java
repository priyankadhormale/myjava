package Method;

public class Staticmethod {
	public static void main(String[] args) {
		//Direct calling
		M1();
		//calssname.method name
		Staticmethod.M1();
		
		Staticmethod SM = new Staticmethod();
		SM.M2();
		
	}
	
	public static void M1(){     //static method
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);				

			}
	
	public void M2() {         //non static method
		int a= 20;
		int b=40;
		int c=a-b;
		System.out.println(c);
		
	}
	
	public static void Demo1() {        // static method calling from diiferent class
		int x = 40;
		int y = 20;
		int z = x+y;
		System.out.println(z);
	}
	
	public void Demo2() {        // non static method calling from diiferent class
		int a = 90;
		int b = 50;
		int c = a+b;
		System.out.println(c);
	
      }
}


