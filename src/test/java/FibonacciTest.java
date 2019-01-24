import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    private Fibonacci fibonacci;

    //1 1 2 3 5 8 13 21 34 55
    //0 1 2 3 4 5 6  7  8  9 - zero based index
    @Before
    public void initFibonacci(){
        fibonacci = new Fibonacci();
    }

    @Test(expected = RuntimeException.class)
    public void testWhenFibonacciNumberIsNegativeIndexOneComputeRecursiveMethodReturnsRuntimeException(){
        fibonacci.computeRecursive(-1);
    }
    @Test
    public void testWhenFibonacciNumberIsFirstComputeRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeRecursive(0));
    }
    @Test
    public void testWhenFibonacciNumberIsSecondComputeRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeRecursive(1));
    }


    @Test
    public void testWhenFibonacciNumberIsThirdComputeRecursiveMethodReturnsTwo(){
        assertEquals(2, fibonacci.computeRecursive(2));
    }
    @Test
    public void testWhenFibonacciNumberIsFifthComputeRecursiveMethodReturnsFive(){
        assertEquals(5, fibonacci.computeRecursive(4));
    }
    @Test
    public void testWhenFibonacciNumberIsEighthComputeRecursiveMethodReturnsTwentyOne(){
        assertEquals(21, fibonacci.computeRecursive(7));
    }

    @Test(expected = RuntimeException.class)
    public void testWhenFibonacciNumberIsNegativeIndexOneComputeNonRecursiveMethodReturnsRuntimeException(){
        fibonacci.computeNonRecursive(-1);
    }

    @Test
    public void testWhenFibonacciNumberIsFirstComputeNonRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeNonRecursive(0));
    }


    @Test
    public void testWhenFibonacciNumberIsSecondComputeNonRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeNonRecursive(1));
    }

    @Test
    public void testWhenFibonacciNumberIsThirdComputeNonRecursiveMethodReturnsTwo(){
        assertEquals(2, fibonacci.computeNonRecursive(2));
    }

    @Test
    public void testWhenFibonacciNumberIsFifthComputeNonRecursiveMethodReturnsFive(){
        //assertEquals(5, fibonacci.computeNonRecursive(4));
        assertThat(fibonacci.computeNonRecursive(4), is(5));
    }

    @Test
    public void testWhenFibonacciNumberIsEighthComputeNonRecursiveMethodReturnsTwentyOne(){
        assertEquals(21, fibonacci.computeNonRecursive(7));
    }

}
