
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); //int/int->int
//		System.out.println(10.0/3); 
		
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
//		System.out.printf("%s", Integer.toBinaryString(15));
		
//		double f = 123.456789;
//		//float f = 123.456789f;
//		System.out.printf("%f%n", f);
//		System.out.printf("%e%n", f);
//		System.out.printf("%g%n", f);
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%5d]%n", 1234567); //[1234567]
		
		double d = 1.23456789;
		System.out.printf("%14.6f%n", d);
		System.out.printf("%.6f%n", d);
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
		
	}

}
