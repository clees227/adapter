package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompoundTest {

	private ChemicalCompound water;
	private ChemicalCompound benzene;
	private ChemicalCompound alcohol;

	@Before
	public void setUp() throws Exception {
		water = new Compound("Water");
	    benzene = new Compound("Benzene");
	    alcohol = new Compound("Alcohol");
	}

	@After
	public void tearDown() throws Exception {
		water = null; 
		benzene = null;
		alcohol = null;
	}

	@Test
	public void testDisplay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoilingPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMeltingPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMolecularFormula() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMolecularWeight() {
		fail("Not yet implemented");
	}

}
