
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; //1.save x in tmp
		x = y; //2.save y in x
		y =tmp; //3.save tmp in y
		
		System.out.println("x="+x); 
		System.out.println("y="+y);
	}

}
