class Practice01MathRecursive implements Practice01Math{
	public int fib(int n){
		//condition to check f the input is negative 
		if (n<0)
			//error is thrown for negative inputs
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		if (n==0 || n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public int fact(int n){
		//condition to check f the input is negative 
		if (n<0)
			//error is thrown for negative inputs
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		if (n==0)
			return 1;
		return fact(n-1)*n;
	}
}