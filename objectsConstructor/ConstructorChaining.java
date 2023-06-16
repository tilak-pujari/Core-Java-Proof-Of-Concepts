package objectsConstructor;

public class ConstructorChaining {
	String name;
	int num;

	ConstructorChaining(){
	}
	ConstructorChaining(String name){
		this.name=name;
	}
	ConstructorChaining(int num){
		this.num=num;		
	}
	ConstructorChaining(String name,int num){
		this(name);
		this.num=num;
	}
	public void print() {
		System.out.println(name);
		System.out.println(num);
	}

	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining();
		c1.print();
		
		ConstructorChaining c2=new ConstructorChaining("Tilak");
		c2.print();
		
		ConstructorChaining c3=new ConstructorChaining(111);
		c3.print();
		
		ConstructorChaining c4=new ConstructorChaining("Tilak",222);
		c4.print();
	}

}
