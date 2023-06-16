package objectsConstructor;

public class ObjectNonStaticMethods {
	public void m1() {
		System.out.println("Method Without Return Without Arguments!");
	}
	
	public void m2(String name) {
		System.out.println("Method Without Return With Arguments! \t Name:"+name);
	}
	
	public String m3(String name) {
		System.out.println("Method With Return With Arguments! \t Name:"+name);
		return name;
	}
	public int m4(){
		int num=10;
		System.out.println("Method with Return Without Arguments");
		return num;
	}

	public static void main(String[] args) {
		ObjectNonStaticMethods o=new ObjectNonStaticMethods();
		o.m1();
		
		o.m2("Tilak");
		
		String name=o.m3("Kumar");
		System.out.println(name);
		
		int num=o.m4();
		System.out.println(num);
	}
}
