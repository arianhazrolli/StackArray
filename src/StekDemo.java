
public class StekDemo {

	public static void main(String[] args) {
		
		
		Stack s = new Stack(5);
		s.push(4); 
		s.push(2); 
		System.out.println("elementi ne majen e stekut: "+ s.top()); 
		s.push(5); 
		 
		System.out.println("elementi nga maja e stekut: "+ s.pop()); 
		System.out.println("elementi nga maja e stekut: "+ s.pop()); 
		System.out.println("elementi ne maja e stekut: "+ s.top()); 
		System.out.println("elementi nga maja e stekut: "+ s.pop()); 
		if (s.isEmpty()) System.out.println("steku pa elemente");
	}

}
