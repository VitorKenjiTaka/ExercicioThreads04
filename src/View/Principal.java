package View;

import Controller.Sapocorrendo;

public class Principal {

	public static void main(String[] args) {
		
		
		
		for (int i= 1 ;i< 6; i++) {
			Sapocorrendo threadv = new Sapocorrendo(i);
			threadv.start();
		}
		
	}

}
