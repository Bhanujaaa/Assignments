package test1;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArchitectMar23Test {
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before class");
	}

	@Before
	public void beforeTest() {
		System.out.println("Before");
	}

	@Test
	public void verficationConversion() {
		ArchitectMar23 cm_Check = new ArchitectMar23();
		assertTrue(cm_Check.convert("1 cm", "1 cm"));
		assertTrue(cm_Check.convert("1 m", "100 cm"));
		assertTrue(cm_Check.convert("100 cm", "0.001 km"));
		assertTrue(cm_Check.convert("1 g", "1 g"));
		assertTrue(cm_Check.convert("0.1 kg", "100 g"));
	}

	@Test
	public void verficationCalculateLength() {
		ArchitectMar23 cm_Check = new ArchitectMar23();
		assertTrue(cm_Check.calculateLength("1 m + 100 cm", "2 m"));
		assertTrue(cm_Check.calculateLength("200 cm + 1 km", "100200 cm"));
		assertTrue(cm_Check.calculateLength("1 m - 50 cm", "0.5 m"));
		assertTrue(cm_Check.calculateLength("2000 cm - 1 m", "1900 cm"));
	}

	@Test
	public void verficationCalculateWeight() {
		ArchitectMar23 cm_Check = new ArchitectMar23();
		assertTrue(cm_Check.calculateWeight("10 g + 1 kg", "1010 g"));
		assertTrue(cm_Check.calculateWeight("1.5 kg - 500 g", "1 kg"));
	}

	@Test
	public void verficationConvertTemp() {
		ArchitectMar23 cm_Check = new ArchitectMar23();
		assertTrue(cm_Check.tempConvert("0 c", "32 f"));
		assertTrue(cm_Check.tempConvert("0 k", "-273 c"));
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("After class");
	}

	@After
	public void After() {
		System.out.println("After");
	}
}
