package objectsConstructor;

public class ObjectNonStaticVariables {

		String carname="BMW";
		long number=12345;
		double price=3.5;
		int noOfSeats=4;
		
		public static void main(String[] args) {
			
			ObjectNonStaticVariables obj=new ObjectNonStaticVariables();
			
			System.out.println("The Car Brand is "+obj.carname);
			System.out.println("The Car Number is "+obj.number);
			System.out.println("The Car have Seat of "+obj.noOfSeats);
			System.out.println("The Car Price is "+obj.price);
		}
	}
