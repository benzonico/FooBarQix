package test;

import static org.junit.Assert.*;

import main.EnumFooBarQix;
import main.FooBarQix;

import org.junit.Test;

public class FooBarQixTests {

	@Test
	public void testFooBarQixiseInteger22() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("22",fooBarQix.fooBarQixiseInteger(22));
	}
	
	@Test
	public void testFooBarQixiseInteger35() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("BarQixFooBar",fooBarQix.fooBarQixiseInteger(35));
	}
	@Test
	public void testFooBarQixiseInteger51() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("FooBar",fooBarQix.fooBarQixiseInteger(51));
	}
	@Test
	public void testFooBarQixiseInteger53() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("BarFoo",fooBarQix.fooBarQixiseInteger(53));
	}
	@Test
	public void testFooBarQixiseInteger33() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("FooFooFoo",fooBarQix.fooBarQixiseInteger(33));
	}
	@Test
	public void testFooBarQixiseInteger55() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("BarBarBar",fooBarQix.fooBarQixiseInteger(55));
	}
	@Test
	public void testFooBarQixiseInteger77() {
		FooBarQix fooBarQix = new FooBarQix();
		assertEquals("QixQixQix",fooBarQix.fooBarQixiseInteger(77));
	}

	@Test
	public void testDivisible() {
		FooBarQix fooBarQix = new FooBarQix();
		
		assertEquals(EnumFooBarQix.Foo.name(),fooBarQix.divisible(33, EnumFooBarQix.Foo));
	}

	@Test
	public void testReplaceChars() {
		FooBarQix fooBarQix = new FooBarQix();
		
		assertEquals("Foo",fooBarQix.replaceChars("3"));
	}

	@Test
	public void testEqualsAndReplace() {
		FooBarQix fooBarQix = new FooBarQix();
		
		assertEquals(EnumFooBarQix.Foo.name(), fooBarQix.equalsAndReplace(3, EnumFooBarQix.Foo));
		assertEquals("", fooBarQix.equalsAndReplace(7, EnumFooBarQix.Foo));
	}

}
