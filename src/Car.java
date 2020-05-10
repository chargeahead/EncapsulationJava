
public class Car {
  private String combustionEngine = "gasoline";
  private int mileage = 40;
  private String odometerDisplay = "miles";
  
  public int getMileage() {
	  return mileage;
  }
  public String getOdometerDisplay() {
	  return odometerDisplay;
  }
  public void setOdometerDisplay(String displayType) {
	  odometerDisplay = displayType;
  }
}
