package base;

public class Base {
	static void Task1() {
		for (int i = 1; i<=14; i++) {
			System.out.print(i*7 + " ");
		}
		System.out.println();
		System.out.println();
	}


	static void Task2() {
		int arrayLength = 10;
		int randomArray[];
		randomArray = new int[arrayLength];
		int max = 0;
		float average = 0;
		
		for (int elem : randomArray) {
			elem = (int) Math.round(Math.random()*100);
			max = Math.max(max, elem);
			average = average + elem;
		}
		average = average/arrayLength;
		System.out.println("max = " + max);
		System.out.println("average = " + average);
		System.out.println();
	}


	static void Task3() {
		int primes[];
		primes = new int[100];
		primes[0] = 2;
		int primesNum = 1;
		int primeN;
		
		for (int natural = 3; natural < 100; natural++) {
			primeN = 0;
			while ((primeN < primesNum) && (natural % primes[primeN] != 0)) {
				primeN++;
			}
			if (primeN == primesNum) {
				primes[primesNum] = natural;
				primesNum++;
			}
		}
		for (int i = 0; i < primesNum; i++) {
			System.out.println(primes[i]);
		}
		System.out.println();
	}


	static void Task4() {
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
		Task1();
		Task2();
		Task3();
		Task4(); 
	}
}