package java_3.lambda_stream;

import java.util.*;
import java.util.stream.Collectors;

class Animals {
    private static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard","lEOpArD","Platypus","frOg","lEOpArD");

    public static List<String> getAnimals() {
        return animals;
    }

    static List<String> capsFirst(boolean mutate) {
        //clean up the animals list so that the first letter is capitalized, and all the other letters are lowercased. Use a stream to accomplish this task.  Also, the 2nd parameter of this function is a boolean.  use this boolean 'flag' to determine whether or not to 'mutate' the original animals array stored as a static class field.  if the flag is set to 'true', mutate the animals and return the animals out of the function.  if it is false, create a copy of the animals, perform your stream operations on the copy, and return the copy of animals out of the function, WITHOUT modifying the original animals array.
        //ex : Animals.capsFirst(false) => ["Peacock","Rabbit","Chiwawa","Orangutan","Viper","Cobra","Panda","Buffalo","Deer","Mallard"]
        if (mutate) {
            return getAnimals().stream()
                    .map(str -> str.toLowerCase())
                    .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                    .collect(Collectors.toList());
        } else {
            List<String> animalsCopy = new ArrayList<>();
            animalsCopy.addAll(getAnimals());
            return animalsCopy.stream()
                    .map(str -> str.toLowerCase())
                    .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                    .collect(Collectors.toList());
        }
    }

    static String addAnimal(String animal) {
        //add an animal to the animal list.
        getAnimals().add(animal);
        return animal;
    };

    static List<String> lowerFirst(boolean mutate) {
        //lowercase the first letter, and uppercase the rest of the letters, using streams.  Also, depending on the value of the boolean flag 'mutate', mutate the original animals list, or perform your stream operations on a 'copy' of the animals list.  return the list out of hte function in both cases.
        if (mutate) {
            return getAnimals().stream()
                    .map(str -> str.toUpperCase())
                    .map(str -> Character.toLowerCase(str.charAt(0)) + str.substring(1))
                    .collect(Collectors.toList());
        } else {
            List<String> animalsCopy = new ArrayList<>();
            animalsCopy.addAll(getAnimals());
            return animalsCopy.stream()
                    .map(str -> str.toUpperCase())
                    .map(str -> Character.toLowerCase(str.charAt(0)) + str.substring(1))
                    .collect(Collectors.toList());
        }
    }

    static List<String> flipAnimals(boolean mutate) {
        //reverse the order of the animals in the animal list.  If the booleaen parameter is true, reverse the static animals array list by mutating the array.  if the mutate boolean is false, flip a 'copy' of the animals list, then return that list of flipped animals, WITHOUT mutating the static animals array. return the flipped list in both cases.
        if (mutate) {
            Collections.reverse(getAnimals());
            return getAnimals();
        } else {
            List<String> animalsCopy = new ArrayList<>(getAnimals());
            Collections.reverse(animalsCopy);
            return animalsCopy;
        }
    }

    static List<String> sortAnimals(boolean mutate) {
        //sort the animals in alphabetical order.  If the booleaen parameter is true, mutate the static animals list.  if the mutate boolean is false, sort a 'copy' of the animals list, then return that list of sorted animals, WITHOUT mutating the static animals array. return the sorted list in both cases.
        if (mutate) {
            Collections.sort(getAnimals());
            return getAnimals();
        } else {
            List<String> animalsCopy = new ArrayList<>(getAnimals());
            Collections.sort(animalsCopy);
            return animalsCopy;
        }
    }

}