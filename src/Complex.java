public class Complex {
   private double real;
   private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary; 
      }
	public double absolute() {
		double ratio = (real * real) + (imaginary * imaginary);
	    double absolute = Math.sqrt(ratio);
	    return absolute; //dummy return    
	      }
	 public Complex add(Complex c2) {
		 Complex add = new Complex ((c2.real + real), (c2.imaginary + imaginary));
	        return add; //dummy return 
	    }
	 public Complex multiply(Complex c2) {
		 Complex multiply = new Complex((c2.real * real - imaginary * c2.imaginary), (c2.imaginary * real + imaginary * c2.real));
	       return multiply; //dummy return 
	    }
	 public Complex reciprocal() {
		 double recip1 = real / ((real * real) + (imaginary * imaginary));
		 double recip2 = -1 * imaginary / ((real * real) + (imaginary * imaginary));
		 Complex reciprocal = new Complex(recip1, recip2);
	        return reciprocal; //dummy return 


	    }

}
    
    