package it.simozmp;

import it.simozmp.helloClass;

public class mainClass {
	
	static private helloClass helloInstance;
	
	public static void main(String[] args) {
		helloInstance = new helloClass();
		helloInstance.helloWorld();
	}
}
