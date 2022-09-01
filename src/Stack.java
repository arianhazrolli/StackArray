





public class Stack {
	public int kapaciteti; // numri maksimal i elementeve
	public int s[]; //elementi i stack-ut 
	public int top; // numri i elementeve aktive
	
	public Stack(int k){ // konstruktori
		this.s = new int[k]; 
		this.kapaciteti = k;
		top = -1; 
		} 
	
	// nese steku eshte i mbushur ktheje true 
	public boolean isEmpty() 
	{ 
		if (top == -1) return true; 
		else return false; 
	} 
	
	// nese steku eshte i zbraze theje false
	public boolean isFull()
	{ 
		if (top == kapaciteti-1) 
			return true; 
		else return false; 
	} 
	
	// insertimi (shtimi) e nje elementi ne steck
	// ne rast susksesi ktheje 0 perndryshe -1
	boolean push(int x)
	{ 
		if (isFull())
		{ // nuk ka vende per elemeitn e ri
			System.out.println("stack is full");
			return false; 
		} 
		s[++top] = x; 
		//top++; 
		return true; 
	} 
	
	int peekTop(){ 
		if (isEmpty())
		{ // nese steku eshte pa elemente (zbrazet) ktheeje -1 
			System.out.println("Stack is empty"); 
			return -999; 
		} 
		int x = s[top];
		return x;  // afisho vleren e elementit por mos e largo nga steku,  jo-invazive
	}
	
	// ktheje vleren e lementit nga maja e stekut
	int peek(){ 
		return peekTop();
	}
	
	int top(){ 
		return peekTop();
	}
	
	// largimi i elementit nga steku 
	public int pop()
	{ 
		if (isEmpty())
		{ // nese steku eshte pa elemente (zbrazet) ktheeje -1 
			System.out.println("Stack is empty"); 
			return -999; 
		} 
		int id = top; // pozita e elementit nga maja e stekut 
		top--; // largo elementin, zbrite pointerin
		return s[id];
		//return s[top--];
	}
}
