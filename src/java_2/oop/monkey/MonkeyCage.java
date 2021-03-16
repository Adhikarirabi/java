package java_2.oop.monkey;

import java.util.List;

class MonkeyCage {

    private List<Monkey> monkeys;

    public MonkeyCage(List<Monkey> monkeys) {
        this.monkeys = monkeys;
    }


    boolean areMonkeysSmiling(Monkey[] monkeys) {
    //We have an array of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        int numSmiling = 0;
        for (Monkey monkey : monkeys) {
            if (monkey.smiling) {
                numSmiling += 1;
            }
        }

        return numSmiling > (monkeys.size() / 2);

    }
        return true;
    }

    Monkey addMonkey(Monkey monkey) {
//        add a new monkey to the MonkeyCage
        this.monkeys.add(monkey);
        return monkey;

    }

    void removeMonkey(Monkey monkey) {
//        remove a monkey from the MonkeyCage
        this.monkeys.remove(monkey);

    }

    class Monkey { //inner class.  DO NOT MOVE THIS CLASS
        String name;
        boolean smiling;

        public Monkey(String name, boolean smiling) {
            this.name = name;
            this.smiling = smiling;
        }
        public String getName() {
            return name;
    }
}