
public class Tester {
  public static void main(String args[]) {
	  Car car = new Car();
	  
	  System.out.println("Mileage is "+car.getMileage());
	  System.out.println("Odometer display type is "+car.getOdometerDisplay());
	  car.setOdometerDisplay("kms");
	  System.out.println("Odometer display type is "+car.getOdometerDisplay());
  }
}
