package java_3.lambda_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

class Numbers {

    private static final List<Integer> nums = new ArrayList<>(Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500));

    static List<Integer> getNums() {
        return nums;
    }

    static int getNum(int i) {
        return nums.get(i);
    }


    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        return getNum(i) % 2 != 0;
    }


    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        return getNum(i) % 2 == 0;
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        int n = getNum(i);
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    static int added() {
        //add all the elements in the list.  return the sum.
        int total = 0;
        for (int num : getNums()) {
            total+= num;
        }
        return total;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        int total = 0;
        for (int num : getNums()) {
            total-= num;
        }
        return total;
    }

    static int multiplied() {
        //multiply all the elements in the list. and return the product.
        int total = 1;
        for (int num : getNums()) {
            total*= num;
        }
        return total;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        int total = 1;
        for (int num : getNums()) {
            total/= num;
        }
        return total;
    }

    static int findMax() {
        //return the maximum value in the list.
        return Collections.max(nums);
    }

    static int findMin() {
        //return the minimum value in the list.
        return Collections.min(nums);
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        if (i > j) {
            return 1;
        } else if (j > i) {
            return -1;
        } else {
            return 0;
        }
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        getNums().add(n);
        return n;
    }

    static boolean lambdaComputePredicate(Predicate<Integer> p, int i) {
        return p.test(getNum(i));
    }

    static int lambdaComputeSupplier(Supplier<Integer> s) {
        return s.get();
    }

    static int lambdaComputeBiFunction(BiFunction<Integer, Integer, Integer> bf, int i, int j) {
        return bf.apply(i, j);
    }

    static int lambdaComputeFunction(Function<Integer, Integer> f, int i) {
        return f.apply(i);
    }
}