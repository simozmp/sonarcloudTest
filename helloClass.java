package it.simozmp;

public class helloClass {
	private int number;
	private String string;
	
	public helloClass() {
		number = 1;
		string = "frase nella stringa";
	}
	
	public void helloWorld() {
		System.out.println("Hello world! This is mainClass, with " + number + " and " + string);
	}
}
