package java_2.oop.monkey;

public class MonkeyApp {

	public static void main(String[] args) {
        /*
        - Add 3 monkeys to the MonkeyCage, utilizing the inner Monkey class and the addMonkey() method
        - Determine whether the majority of them are smiling or not.  write your code in the areMonkeySmiling(arr) method

        example :
        [Rafiqi (smiling), Curious George (smiling), King Kong (not smiling)] => areMonkeysSmiling(arr) => true

        You are NOT allowed to move the Monkey class outside of the MonkeyCage class.  Keep it exactly where it is.
        */
		List<MonkeyCage.Monkey> list = new ArrayList<>(Arrays.asList());
		MonkeyCage cage = new MonkeyCage(list);
		MonkeyCage.Monkey monkey1 = cage.new Monkey("Ram", true);
		MonkeyCage.Monkey monkey2 = cage.new Monkey("Shyam", false);
		MonkeyCage.Monkey monkey3 = cage.new Monkey("Hari", true );
		cage.addMonkey(monkey1);
		cage.addMonkey(monkey2);
		cage.addMonkey(monkey3);

		if (monkeyCage.areMonkeysSmiling()) {
			System.out.println("monkeys are smiling.");
		} else {
			System.out.println("monkeys are not smiling.");
		}



	}
}
