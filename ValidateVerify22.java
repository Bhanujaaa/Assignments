package test1;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidateVerify22 {
	@BeforeClass
	public static void BeforeClass1() {
		System.out.println("Before class");
	}
	@Before
	public void beforeTest1() {
		System.out.println("Before");
	}
	@Test
	public void verficationTrue() {
		ValidateMar22  t1=new ValidateMar22();
		assertTrue(t1.ValidateIpv4Address("1.1.1.1"));
		assertTrue(t1.ValidateIpv4Address("192.168.1.1"));
		assertTrue(t1.ValidateIpv4Address("10.0.0.1"));
		assertTrue(t1.ValidateIpv4Address("127.0.0.1"));
		System.out.println("For True testing");
	}
	@Test
	public void verificationFalse() {
		ValidateMar22 t2=new ValidateMar22();
		assertFalse(t2.ValidateIpv4Address("0.0.0.0"));
		assertFalse(t2.ValidateIpv4Address("255.255.255.255"));
		assertFalse(t2.ValidateIpv4Address("1.1.1.0"));
		assertFalse(t2.ValidateIpv4Address("10.0.1"));
		System.out.println("For False testing");
	}
	@AfterClass
	public static void AfterClass1() {
		System.out.println("After class");
	}
	@After
	public void Afte1r() {
		System.out.println("After");
	}
	
}
