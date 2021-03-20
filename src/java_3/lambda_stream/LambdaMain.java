package java_3.lambda_stream;

import java.math.BigInteger;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaMain {

	public static void main(String[] args) {

		//Animals*******************
		//complete the static methods on the Animals class
		//use streams wherever possible in your method implementations.

		Animals animal = new Animals();
		System.out.println("capsFirst(true): " + animal.capsFirst(true));
		System.out.println("capsFirst(false): " + animal.capsFirst(false));
		System.out.println("lowerFirst(true): " + animal.lowerFirst(true));
		System.out.println("lowerFirst(false): " + animal.lowerFirst(false));
		System.out.println("flipAnimals(true): " + animal.flipAnimals(true));
		System.out.println("sortAnimals(true): " + animal.sortAnimals(true));
		System.out.println();


		//Numbers********************
		//1. complete the static methods in the Numbers class.
		//2. solve the same challenges but allow the methods to accept lambda expressions as parameters. You could potentially create one method that can do most of the computations in the Numbers class by simply passing in a lambda expression.

			/* e.g.
			Numbers.lambdaCompute((x,y) -> x + y)) => 5661
			Numbers.lambdaCompute( (x,y) -> x - y)) => -5641
			Numbers.lambdaCompute((x,y) -> x * y)) => -1767899136
			Numbers.lambdaCompute(() -> ... ) => 2500
			etc...
			*/
		Numbers numbers = new Numbers();
		System.out.println("isOdd(6): " + numbers.isOdd(6));
		System.out.println("isOdd(6): " + numbers.isEven(6));
		System.out.println("isPrime(6): " + numbers.isPrime(6));
		System.out.println("added(): " + numbers.added());
		System.out.println("subtracted(): " + numbers.subtracted());
		System.out.println("multiplied(): " + numbers.multiplied());
		System.out.println("divided(): " + numbers.divided());
		System.out.println("findMax(): " + numbers.findMax());
		System.out.println("findMin(): " + numbers.findMin());
		System.out.println("compare(3, 2): " + numbers.compare(3, 2));
		System.out.println("append(6): " + numbers.append(6));
		System.out.println();

		/* Lambda Expressions */
		System.out.println("isOdd(3) lambda: " + Numbers.lambdaComputePredicate(num -> num % 2 != 0, 3));

		System.out.println("isEven(3) lambda: " + Numbers.lambdaComputePredicate(num -> num % 2 == 0, 3));

		System.out.println("isPrime(3) lambda: " + Numbers.lambdaComputePredicate(num -> {
			return num > 1 && IntStream.range(2, num - 1).noneMatch(index -> num % index == 0);
		}, 3));

		System.out.println("added() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return Numbers.getNums().stream()
					.collect(Collectors.summingInt(Integer::intValue));
		}));

		System.out.println("subtracted() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return - Numbers.getNums().stream()
					.collect(Collectors.summingInt(Integer::intValue));
		}));

		System.out.println("multipled() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return Numbers.getNums().stream()
					.map(BigInteger::valueOf)
					.reduce(BigInteger.ONE, BigInteger::multiply).intValue();
		}));

		System.out.println("divided() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return Numbers.getNums().stream()
					.map(BigInteger::valueOf)
					.reduce(BigInteger.ONE, BigInteger::divide).intValue();
		}));

		System.out.println("findMax() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return Collections.max(Numbers.getNums());
		}));

		System.out.println("findMin() lambda: " + Numbers.lambdaComputeSupplier(() -> {
			return Collections.min(Numbers.getNums());
		}));

		System.out.println("compare(1, 2) lambda: " + Numbers.lambdaComputeBiFunction((i, j) -> {
			if (i > j) {
				return 1;
			} else if (j > i) {
				return -1;
			} else {
				return 0;
			}
		},
				1, 2));

		System.out.println("append(5) lambda: " +
				Numbers.lambdaComputeFunction(i -> {
					Numbers.getNums().add(i);
					return i;
				}, 5));

	}
	}

