package objectsConstructor;

public class ConstructorOverloading {
	String name;
	int num;

	ConstructorOverloading(){
	}
	ConstructorOverloading(String name){
		this.name=name;
	}
	ConstructorOverloading(int num){
		this.num=num;		
	}
	ConstructorOverloading(String name,int num){
		this.name=name;
		this.num=num;
	}
	public void print() {
		System.out.println(name);
		System.out.println(num);
	}
	public static void main(String[] args) {
		ConstructorOverloading c1=new ConstructorOverloading();
		c1.print();
		
		ConstructorOverloading c2=new ConstructorOverloading("Tilak");
		c2.print();
		
		ConstructorOverloading c3=new ConstructorOverloading(150);
		c3.print();
		
		ConstructorOverloading c4=new ConstructorOverloading("Kumar",10);		
		c4.print();
	}

}
