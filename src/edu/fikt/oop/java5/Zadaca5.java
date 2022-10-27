package edu.fikt.oop.java5;

public class Zadaca5 {
	public static void main(String[] args) {
		String unit = "степен";
		String value = "2.5";
		double temperature = Double.parseDouble(value);
		System.out.println("Температурата изнесува " +  (int)(temperature*10) + " " + unit + "и. ");
	}

}
