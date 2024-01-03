
public class MultiplyDivide {

	int multiply(int ...args) {
		int product = 1;
		for(int i = 0; i<args.length; i++) {
			product *= args[i];
		}
		return product;
	}
	
	double divide(double a, double b) {
		return a/b;
	}

}
