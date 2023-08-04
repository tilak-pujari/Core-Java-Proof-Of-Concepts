package objectsConstructor;

public class Constructors {
	String name;
	int number;
	//No Argument Constructor
	Constructors(){
		
	}
	//Parameterized Constructor
	Constructors(String name,int number){
		this.name=name;
		this.number=number;
	}
	//Non Static Method
	public void print() {
		System.out.println(name);
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		Constructors c=new Constructors();
		c.print();
		
		Constructors c2=new Constructors("Tilak",144);
		c2.print();

	}

}
