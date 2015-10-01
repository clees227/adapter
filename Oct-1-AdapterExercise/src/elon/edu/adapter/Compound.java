package elon.edu.adapter;

public class Compound implements ChemicalCompound {
	ChemicalDataBank db;
	String molecule;
	public Compound(String type){
		db = new ChemicalDataBank();
		molecule = type;
	}
	
	@Override
	public String display() {
		String output = "";
		output += "Compound: "+molecule+" ------\n";
		output += "Formula: "+this.getMolecularFormula()+"\n";
		output += "Weight: "+this.getMolecularWeight()+"\n";
		output += "Melting Point: "+this.getMeltingPoint()+"\n";
		output += "Boiling Point: "+this.getBoilingPoint();
		System.out.println(output);
		return output;
	}

	@Override
	public double getBoilingPoint() {
		return db.getCriticalPoint(molecule, "B");
	}

	@Override
	public double getMeltingPoint() {
		return db.getCriticalPoint(molecule, "M");
	}

	@Override
	public String getMolecularFormula() {
		return db.getMolecularStructure(molecule);
	}

	@Override
	public double getMolecularWeight() {
		return db.getMolecularWeight(molecule);
	}

}
