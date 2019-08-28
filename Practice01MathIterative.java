class Practice01MathIterative implements Practice01Math{
	public int fact(int n){
		//condition to check f the input is negative 
		if (n<0)
			//error is thrown for negative inputs
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		//prod is the current value for the i-th factorial
		int prod = 1;
		for (int i=1; i<=n; i++)
			prod *= i;
		return prod;
	}
	public int fib(int n){
		//condition to check f the input is negative 
		if (n<0)
			//error is thrown for negative inputs
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		//sum is the value of the nth number in the fib. seq.
		double sum = 0;
		//phi is just a constant
		double phi = (1+Math.sqrt(5))/2;
		for (int i=0; i<=n; i++)
			//use series representation of fib. seq.
			sum = (Math.pow(phi,i)-(Math.pow((1-phi),i)))/Math.sqrt(5);
		return (int) sum;
	}
}