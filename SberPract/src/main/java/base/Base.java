package base;

public class Base {
	private static void sequence7n() {
		for (int multuplier = 1; multuplier <= 14; multuplier++) {
			System.out.print(multuplier*7 + " ");
		}
		System.out.println();
		System.out.println();
	}


	private static void randomMatrixMaxAvg() {
		int arrayLength = 10;
		int randomArray[];
		randomArray = new int[arrayLength];
		int max = 0;
		float average = 0;
		
		for (int elem : randomArray) {
			elem = (int) Math.round(Math.random() * 100);
			max = Math.max(max, elem);
			average = average + elem;
		}
		average = average/arrayLength;
		System.out.println("max = " + max);
		System.out.println("average = " + average);
		System.out.println();
	}


	private static void firstPrimes() {
		int primes[];
		final int limit = 100;
		primes = new int[limit];
		primes[0] = 2;
		int primesNum = 1;
		int primeN;
		
		for (int natural = 3; natural < limit; natural++) {
			primeN = 0;
			while ((primeN < primesNum) && (natural % primes[primeN] != 0)) {
				primeN++;
			}
			if (primeN == primesNum) {
				primes[primesNum] = natural;
				primesNum++;
			}
		}
		for (primeN = 0; primeN < primesNum; primeN++) {
			System.out.println(primes[primeN]);
		}
		System.out.println();
	}


	private static void starMatrix() {
		int width = 5;
		int height = 3;
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		sequence7n();
		randomMatrixMaxAvg();
		firstPrimes();
		starMatrix(); 
	}
}