package id.ac.undiksha.siak.entities;

public class Staff extends Person {
	private String nip;
	private String unit;
	
	public Staff() {
		super();
		this.nip			= "<Invalid nip>";
		this.unit			= "<Invalid unit>";
	}

	public Staff(String nip, String unit) {
		super();
		this.nip = nip;
		this.unit = unit;
	}
	
	public Staff(String name, String address, boolean gender, String nip, String unit) {
		super(name, address, gender);
		this.nip = nip;
		this.unit = unit;
		// TODO Auto-generated constructor stub
	}

	public void printAllInfo() {
		System.out.println("\n Biodata Staff \n");
		System.out.println("NIM : " + this.getNip());
		System.out.println("Name : " + this.getName());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Unit : " + this.unit);
		System.out.println("Gender : " + (getGender() ? "Male" : "Female" ));
		
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
