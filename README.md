# Driving-Cost-Calculator
A small program that calculates the cost of a car trip.

Created a new class called DrivingCostCalculator
In the main method, we will repeatedly call JOptionPane.showInputDialog with useful text prompts to the user to get the following information, in the order listed below. Convert and store each input to a double-type variable with a useful variable name.

-The driving distance, in miles
-The vehicle's miles per gallon efficiency
-The cost of gas in dollars per gallon


Given the above information, we have written a static method that computes and returns the cost of the trip.

We will also add a body to the method that computes the trip cost:

- The trip cost is the distance * dollars per gallon/miles per gallon. 

It is broken into two parts:
-The number of gallons used is the miles/miles per gallon
-The cost of the trip is the number of gallons * dollars per gallon

Using these two formulas, we calculate the cost of the trip in two stages. 

-First, calculate the gallons used and store the result in a variable. 
-Second, compute a final cost using that variable and the dollars per gallon. Store this final cost in a usefully named variable.

Return this final cost from the function. Do not produce text output in the function.

Back in the main method, call the calculateTripCost method with the information collected from the user. Store the computed trip cost in an appropriately-named variable.

To improve the marketability of this program, we made a method that displays a text banner.
As an example, the banner display looks something like:


*****************************************
*          Driving Cost Calculator               *
*****************************************     
The cost of the trip is $20.00.


We formatted the trip cost to have only two digits (for pennies) using the String.format method.
String formattedNumber = String.format("%.2f", number);
will store into formattedNumber the result of formatting number into a string containing two decimal places. You can output that formatted number instead of the double variable that holds the cost.

The top of the program file must have a Javadoc comment with the assignment an @author tag and comment with your name, the assignment (like "Assignment 1: Driving Cost Calculator") and the course. The three methods in the class should have Javadoc comments describing what they do. The trip cost method should have @param and @return tags with descriptions of what is expected in each parameter and what is returned. You do not need a @param tag for the main method, as we haven't said what the args parameter is yet.


