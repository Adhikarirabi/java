package java_1.dataTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Arrays {
    int[] nums = new int[]{10,23,3,4,5,2,1};
    String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};

    public void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        for(int i : nums){
            System.out.println(i + "\n");
        }
    };

    void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */

            for(int i = 0; i < greetings.length; i++){
                int random = (int)(greetings.length * Math.random());
                System.out.println(greetings[random] + " " + name);
        }
    };

    boolean[] bitsToBinaries() {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        boolean [] b2b = new boolean [bits.length];
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 0){
                b2b [i] = false;
            }
            else {
                b2b [i] = true;
            }
        }
        return b2b;
    };

    String[] keepColors() {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        String[] colors = new String[]{"red", "blue", "yellow", "white", "purple"};
        List<String> listOfColors = new ArrayList<>();
       for (String complextion: listOfColors ){
           for (String verify : colors){
               if(complextion.toLowerCase().contains(verify)){
                   listOfColors.add(complextion);
               }
           }
        }
        String [] ColorsOnly = new String [listOfColors.size()];
       ColorsOnly = listOfColors.toArray((ColorsOnly));
       return ColorsOnly;
    }

}







