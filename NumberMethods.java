package loops;

public class NumberMethods {

	public static boolean isPrime(int n) {
		
		if (n <= 1 ) {
       return false;
		}
		else if (n == 2) {
        return true;
		}
		else if(n % 2 == 0){
			return false;
		}
    for (int i = 3; i <= Math.sqrt(n); i += 2) 
    {
        if (n % i == 0)
            return false;
    }
    return true;
}
	public static int divisorSum(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		boolean prime = isPrime(n);
		int sum = divisorSum(n);
		
		if(sum < n && !prime) {
			strong = true;
		}
		else
			strong = false;
		return strong;
	}
	
	public static void printDivisors(int n) {
		  
		for (int i = 1;i < n; i++) {
			if (n % i==0) {
				System.out.printf("%d ",i); // %d indicates that the variable is a decimal integer( includes any number 0-9)
			}
		} 
		System.out.println();
	}
	
	public static void printPrimes(int n) {
		int num = 1;
		while(num < n) {
			boolean prime = isPrime(num);
			if(prime) {
				System.out.print(num + " ");
			}
			num ++;
		}
		System.out.println();
	}
	
	public static void printComposites(int n) {
		int num = 4;
		while (num < n) {
			boolean prime = isPrime(num);
			if(!prime) {
				System.out.print(num + " ");
			}
			num ++;
		}
		System.out.println();
	}

	
	public static void printStrong(int n) {
		int num = 4;
		while(num < n) {
			boolean strong = isStrong(num);
			if(strong) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println();
	}
	
	public static void printWeak(int n) {
		int num = 6;
		while (num < n) {
			boolean strong = isStrong(num);
			boolean prime = isPrime(num);
			if(!strong && !prime) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(29));
		System.out.println(divisorSum(8));
		System.out.println(isStrong (8));
		printDivisors(30);
		printPrimes(30);
		printComposites(30);
		printStrong(30);
		printWeak(30);	
	}
}