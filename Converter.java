
public class Converter {
    //Your names go here:
    /*
     * @Author: Nurullo Boboev
     * Bhavdeep Purba
     * Trevor Brown
     *
     */
    private double celsiusToFahrenheit(double C){
// TODO: The third student will implement this method
        double F = 32 + (9/5) * C;
        return F;
    }
    private double fahrenheitToCelsius(double F){
        // TODO: The second student will implement this method
		
		double C = (F − 32) × 5/9;
        return C;
    }
	private double kilometersToMiles(double k){
		double m = k * (5/8);
		return m;
	}
    public static void main(String[] args) {
//TODO: The first student will implement this method.
// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
	double CtoF = celsiusToFahrenheit(180);
	double FtoC = FahrenheitToCelsius(250);
    }
}

//This is the development branch
