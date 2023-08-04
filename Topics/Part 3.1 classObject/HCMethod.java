package classObject;

import java.util.Objects;

public class HCMethod {
	String name;
	HCMethod(String name){
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public static void main(String[] args) {
		HCMethod h1=new HCMethod("Raju");
		HCMethod h2=new HCMethod("Raja");
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
	}

}
