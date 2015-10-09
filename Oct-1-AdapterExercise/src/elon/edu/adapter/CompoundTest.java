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
		String output = "";
		output += "Compound: Water ------\n";
		output += "Formula: "+water.getMolecularFormula()+"\n";
		output += "Weight: "+water.getMolecularWeight()+"\n";
		output += "Melting Point: "+water.getMeltingPoint()+"\n";
		output += "Boiling Point: "+water.getBoilingPoint();
		assertEquals(output, water.display());
	}

	@Test
	public void testGetBoilingPoint() {
		assertEquals(100.0, water.getBoilingPoint(), 0.01);
	}

	@Test
	public void testGetMeltingPoint() {
		assertEquals(water.getMeltingPoint(), 0.0, 0.01);
	}

	@Test
	public void testGetMolecularFormula() {
		assertEquals(water.getMolecularFormula(), "H2O");
	}

	@Test
	public void testGetMolecularWeight() {
		assertEquals(water.getMolecularWeight(), 18.0, 0.01);
	}

}
