package classObject;

public class EQMethod {
	String subject;
	EQMethod(String subject){
	this.subject=subject;
	}
	@Override
	public boolean equals(Object obj) {
		EQMethod e=(EQMethod)obj;
		return this.subject==e.subject;		
	}
	public static void main(String[] args) {
		EQMethod e1=new EQMethod("Java");
		EQMethod e2=new EQMethod("Java");
		System.out.println(e1.equals(e2));

	}

}
