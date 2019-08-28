class Practice01MathIterative implements Practice01Math{
	public int fact(int n){
		if (n<0)
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		int prod = 1;
		for (int i=1; i<=n; i++)
			prod *= i;
		return prod;
	}
	public int fib(int n){
		if (n<0)
			throw new IllegalArgumentException("Only Positive Numbers Accepted");
		double sum = 0;
		double phi = (1+Math.sqrt(5))/2;
		for (int i=0; i<=n; i++)
			sum = (Math.pow(phi,i)-(Math.pow((1-phi),i)))/Math.sqrt(5);
		return (int) sum;
	}
}