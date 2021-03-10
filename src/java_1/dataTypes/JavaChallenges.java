package java_1.dataTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class
		String[] messageToShuffle = {"Welcome", "to", "TekCamp"};
		int[] scoresArray = {250, 150, 180, 90};
		Item firstItem = new Item("soccerBall",5.99);
		Item secondItem = new Item("PS5",500.99);
		Item[] transactions = {firstItem,secondItem };


		printMsg("Hello TekCamp", 6);
		System.out.println(nthFibonacci(13));
		System.out.println(calcPay(12,50.00, 4));
		System.out.println(solveQuadratic(5, 6, 3));
		System.out.println(countQuarters(10.50));
		System.out.println(reverseString("Namaste"));
		System.out.println(shuffleMessage(messageToShuffle));
		printEgg();
		System.out.println(totaledReceipt(transactions));
	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		for (int i = 0; i <repeats; i++) {
			System.out.print(msg +" ");
		}
	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */
		int fib[] = new int[n+2];
		int i;
		fib[0] = 0;
		fib[1] =1;

		for( i=2; i<=n; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}


	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		double total = (hrsPerPeriod * hourlyRate) * payPeriods;
		return total;
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */
		long a = (long) Math.pow(x,2);
		long result = a + y + z;
		return result;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		int quarters = (int) (amount / .25);
		return quarters;
	}

	static String reverseString(String str) {
		//reverse the input string and return it.
		StringBuilder maker = new StringBuilder();
		maker.append(str);
		maker.reverse();
		return String.valueOf(maker);
	}

	static String shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/

		List<String> shuffled = Arrays.asList(messages);
		Collections.shuffle(shuffled);
		String shuffle = shuffled.toString();
		return shuffle;
	}

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		return 4.0;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
		System.out.println("Egg");
		System.out.println(" ------- ");
		System.out.println(" / \\");
		System.out.println("/ \\");
		System.out.println("-\"-'-\"-'-\"-");
		System.out.println("\\ /");
		System.out.println(" \\_______/");
		System.out.println("Eggs");
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
			double grandTotal = 0.0;
			int i;
			for (i =0; i<transactions.length; i++){
				grandTotal += transactions[i].cost;
			}
			return grandTotal;

		}
	}