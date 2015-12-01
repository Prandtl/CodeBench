import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vasil_000 on 24-Nov-15.
 */
public class TestingTests
{

	public void Test()
	{
		assertTrue(4<5);
		assertEquals(99.999999999999, 100, 0.0001);
	}

	@Test
	public void Toast()
	{
		assertEquals(99, 100, 0.0001);
	}
}
