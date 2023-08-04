package classObject;

public class ToStringEx {
	String name;
	ToStringEx(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
	public static void main(String[] args) {
		ToStringEx t=new ToStringEx("Grover");
		System.out.println(t);
		
	}

}
