/**
 * @author Sarthak Goyal 
 * Driving Cost Calculator 
 */
//package a1;


import javax.swing.JOptionPane;


public class DrivingCostCalculator
{
	
	/**
	 * This method prints a banner before the the main trip cost is displayed
	 * 	 
	 * */
	public static void displayBanner()
	{
		System.out.println("***********************************************************************");
		System.out.println("*                       Driving Cost Calculator                       *");
        System.out.println("***********************************************************************");
	}
	
	/**
	 * @param distanceToDrive Is the total miles and this data is taken from the user
	 * @param mpg is Miles Per Gallon and this data is taken from the user as well
	 * @param pricePerGallon This is the dollars per Gallon
	 * @return
	 */
	public static double calculateTripCost(double distanceToDrive, double mpg, double pricePerGallon)
	{
		Double NumberOfGallons = distanceToDrive / mpg;
		Double tripCost = NumberOfGallons * pricePerGallon;
		return tripCost;
	}

	  /**
	 * @param args This is the main parameter, it calls the banner first then takes in the values form the user and then the calculateTripCost returns the final cost of the trip.
	 */
	public static void main(String[] args) 
	  {
		  displayBanner();
		
		  String distanceToDrive = JOptionPane.showInputDialog("Enter the driving distance, in miles:");
		  double check = Double.parseDouble(distanceToDrive);
       
		  String mpg = JOptionPane.showInputDialog("Enter the vehicle's miles per gallon efficiency:");
          double miles = Double.parseDouble(mpg);
        
		  String pricePerGallon = JOptionPane.showInputDialog("Enter the cost of gas in dollars per gallon:");
          double price = Double.parseDouble(pricePerGallon);
        
          Double TotalCost = calculateTripCost(check, miles, price);
          String formattedNumber = String.format("%.2f", TotalCost);
          System.out.println("The cost of the trip is: $" + formattedNumber);
	  } 
}
