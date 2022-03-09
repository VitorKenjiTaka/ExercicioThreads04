package Controller;

public class Sapocorrendo extends Thread {
	private int i;
	
	public Sapocorrendo(int i) {
		this.i = i;
		
	}
	
	public void run() {
		int posicao = 0;
		int salto;
		int tamPista = 100;
		
		if(i == 1) {
			
			do {
				salto = (int) (Math.random() * 11) +1;
				posicao = posicao + salto;
				System.out.println("O sapo1 pulou " + salto + " cm. \t Percorreu: " + posicao + " cm");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}while(posicao < tamPista);
			System.out.println("O sapo1 venceu a pista!!");
		}
		
		if(i == 2) {
			
			do {
				salto = (int) (Math.random() * 6)+1;
				posicao = posicao + salto;
				System.out.println("O sapo2 pulou " + salto + " cm. \t Percorreu: " + posicao + " cm");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}while(posicao < tamPista);
			System.out.println("O sapo2 venceu a pista!!");
			
		}
		
		if(i == 3) {
			
			do {
				salto = (int) (Math.random() * 5)+1;
				posicao = posicao + salto;
				System.out.println("O sapo3 pulou " + salto + " cm. \t Percorreu: " + posicao + " cm");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}while(posicao < tamPista);
			System.out.println("O sapo3 venceu a pista!!");
			
		}
		
		if(i == 4) {
			
			do {
				salto = (int) (Math.random() * 9)+1;
				posicao = posicao + salto;
				System.out.println("O sapo4 pulou " + salto + " cm. \t Percorreu: " + posicao + " cm");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}while(posicao < tamPista);
			System.out.println("O sapo4 venceu a pista!!");
			
		}
		
		if(i == 5) {
			
			do {
				salto = (int) (Math.random() * 8)+1;
				posicao = posicao + salto;
				System.out.println("O sapo5 pulou " + salto + " cm. \t Percorreu: " + posicao + " cm");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}while(posicao < tamPista);
			System.out.println("O sapo5 venceu a pista!!");
			
		}
	}
}
