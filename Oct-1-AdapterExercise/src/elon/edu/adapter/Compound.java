package elon.edu.adapter;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Compound implements ChemicalCompound {
	ChemicalDataBank db;
	String molecule;
	NumberFormat format;
	public Compound(String type){
		db = new ChemicalDataBank();
		molecule = type;
		format = new DecimalFormat("#0.0");
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
		return Double.parseDouble(format.format(db.getCriticalPoint(molecule, "B")));
	}

	@Override
	public double getMeltingPoint() {
		return Double.parseDouble(format.format(db.getCriticalPoint(molecule, "M")));
	}

	@Override
	public String getMolecularFormula() {
		return db.getMolecularStructure(molecule);
	}

	@Override
	public double getMolecularWeight() {
		return Double.parseDouble(format.format(db.getMolecularWeight(molecule)));
	}

}
