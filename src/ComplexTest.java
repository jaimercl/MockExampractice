import static org.junit.Assert.*;
import org.junit.Test;
public class ComplexTest {
    final double epsilon = 10e-20;
    Complex zero = new Complex(0,0);
        Complex i = new Complex(0,1);
        Complex one = new Complex(1,0);
        @Test
        public void testConstructorAndGetters() {
        Complex c = new Complex(0.0, 0.0);
                assertEquals("Constructor: returns wrong imaginary part", c.getImaginary(), 0.0, epsilon);
                assertEquals("Constructor: returns wrong real part", c.getReal(), 0.0, epsilon);
                c = new Complex(1.0,2.0);
                assertEquals("Constructor: returns wrong imaginary part", c.getImaginary(), 2.0, epsilon);
                assertEquals("Constructor: returns wrong real part", c.getReal(), 1.0, epsilon);
    }
    @Test
    public void testAbsoluteValue() {
        Complex zero = new Complex(0,0);
                assertEquals("absolute: Wrong absolute value of 0", zero.absolute(), 0, epsilon);
                Complex i = new Complex(0,1);
                assertEquals("absolute: Wrong absolute value of i", i.absolute(), 1, epsilon);
                Complex j = new Complex(1,-2);
                assertEquals("absolute: Wrong absolute value of 1-2i", j.absolute(), Math.sqrt(5.0), epsilon);
    }
    @Test
    public void testAdd() {
        assertEquals("add: Wrong real part for addition", zero.add(zero).getReal(), 0, epsilon);
        assertEquals("add: Wrong imaginary part for addition", zero.add(zero).getImaginary(), 0, epsilon);
        assertEquals("add: Wrong real part for addition", zero.add(one).getReal(), 1, epsilon);
        assertEquals("add: Wrong imaginary part for addition", zero.add(one).getImaginary(), 0, epsilon);
        assertEquals("add: Wrong real part for addition", one.add(i).getReal(), 1, epsilon);
        assertEquals("add: Wrong imaginary part for addition", one.add(i).getImaginary(), 1, epsilon);
}
    @Test
    public void testMultiply() {
      Complex c = new Complex(2,-3);
         assertEquals("multiply: Wrong real part", zero.multiply(zero).getReal(), 0, epsilon);
         assertEquals("multiply: Wrong imaginary part", zero.multiply(zero).getImaginary(), 0, epsilon);
         assertEquals("multiply: Wrong real part ", zero.multiply(one).getReal(), 0, epsilon);
         assertEquals("multiply: Wrong imaginary part", zero.multiply(one).getImaginary(), 0, epsilon);
         assertEquals("multiply: Wrong real part", one.multiply(i).getReal(), 0, epsilon);
         assertEquals("multiply: Wrong imaginary part", one.multiply(i).getImaginary(), 1, epsilon);
         assertEquals("multiply: Wrong real part", c.multiply(c).getReal(), -5, epsilon);
         assertEquals("multiply: Wrong imaginary part", c.multiply(c).getImaginary(), -12, epsilon);
    }
    @Test
    public void testReciprocal() {
      Complex c = new Complex(0.5,0.5);
      assertEquals("reciprocal: Wrong real part", one.reciprocal().getReal(), 1, epsilon);
      assertEquals("reciprocal: Wrong imaginary", one.reciprocal().getImaginary(), 0, epsilon);
      assertEquals("reciprocal: Wrong real part", i.reciprocal().getReal(), 0, epsilon);
      assertEquals("reciprocal: Wrong imaginary part", i.reciprocal().getImaginary(), -1, epsilon);
      assertEquals("reciprocal: Wrong real part", c.reciprocal().getReal(), 1, epsilon);
      assertEquals("reciprocal: Wrong imaginary part", c.reciprocal().getImaginary(), -1, epsilon);
    }
}