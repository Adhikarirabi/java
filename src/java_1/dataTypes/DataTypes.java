
package java_1.dataTypes;
import java.util.Arrays;

class DataTypes {

	int number = 2021;
	int yearOfBirth = 1977;
	int [] nums = {3,4,5,6,7,8,10,12};
	String movieName = "Meet The Parents";
	char male = 'm';
	long triplet = 3L;
	char female = 'f';
	double decimalVal = .0000000000001f;
	byte halfByte = 0101;


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables

		//For the methods below in this DataTypes class, determine the appropriate data types for the inputs and the outputs
		yearsToMonths(7);
		monthsToHours(12);
		daysToSeconds(344);
		centuriesToSeconds(3);
		dollarsToBitcoin(50000);
		canDrive(18);
		DataTypes data = new DataTypes();
		System.out.println(Arrays.toString(data.getDataTypes(4, true, 1000000)));

	}

public static void yearsToMonths(int years) {
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		int months = 12 * years;
		System.out.println(months);
	}

	public static void monthsToHours(int months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours
		long hours = months * 30 * 24;
		System.out.println(hours);
	}

	public static  void daysToSeconds(int days) {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 days => 172800 seconds
		int seconds = days * 86400;
		System.out.println(seconds);
	}

	public static void centuriesToSeconds(int centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 seconds
	long secToCen = centuries * 3153600000L;
		System.out.println(secToCen);
	}

	public static void dollarsToBitcoin(int dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, As of 1/2021, 1 bitcoin ~=> $50000.00
		float dolToBit = dollars * 0.000022f;
		System.out.println(dolToBit);
	}

	public static void canDrive(int age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		if(age >= 18) {
			System.out.println("Person is eligible to drive");
		} else {
			System.out.println("Person is not eligible to drive");
		}
	}

	  String[] getDataTypes(int num1, boolean bool1, long long1) {
//	Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.

	String Num1 = ((Object)num1).getClass().getName();
		String Bol1 = ((Object)bool1).getClass().getName();
		String Long1 = ((Object)long1).getClass().getName();

		return new String[]{Num1, Bol1, Long1};
	}

}