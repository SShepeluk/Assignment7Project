import org.junit.Assert;
import org.junit.Test;

public class FibMavenTest {

	FibMavenMain fmt = new FibMavenMain();

	@Test
	public void testFibOne() {

		Assert.assertEquals(fmt.rFib(1), 1);
	}
	
	@Test
 	public void testFibSix() {

		Assert.assertEquals(fmt.rFib(6), 8);
	}

	@Test
	public void testFibEight() {

		Assert.assertEquals(fmt.rFib(8), 21);
	}



}
