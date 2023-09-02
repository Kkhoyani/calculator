package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class claculate_test {

	calculate c = new calculate();
	@Test
	public void add()
	{
		assertEquals(20,c.add(10, 10));
	}
	@Test
	public void add1()
	{
		assertEquals(6,c.add(-4, 10));
	}
	@Test
	public void sub()
	{
		assertEquals(-14,c.sub(-4, 10));
	}
	@Test
	public void sub1()
	{
		assertEquals(10,c.sub(20, 10));
	}
	@Test
	public void mut()
	{
		assertEquals(-40,c.multiply(-4, 10));
	}
	@Test
	public void mut1()
	{
		assertEquals(10,c.multiply(40, 3));
	}
	@Test
	public void div()
	{
		assertEquals(0.2,c.division(2, 10));
	}
	@Test
	public void div1()
	{
		assertEquals(10,c.division(40, 4));
	}
	@Test
	public void div2()
	{
		assertEquals(00,c.division(40, 0));
	}
	@Test
	public void mod()
	{
		assertEquals(1,c.modulo(40, 3));
	}
	@Test
	public void mod1()
	{
		assertEquals(5,c.modulo(5, 3));
	}
}
