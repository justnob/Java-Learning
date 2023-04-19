package SquareUptoLimit;

public class WhileNumberPlayer {
	

	private int player;

	public WhileNumberPlayer(int player) {
	
		this.player = player;
	}
	
	public void printSquareUptoLimit(){
		
		int i = 1;
		while(i <= player) {
			
			int j = i*i;
			i++;
			
			System.out.print(j);
		}
		System.out.println();
		
		
	}

	public void printCubeUptoLimite() {
		
		int k = 1;
		while(k <= player) {
			
			int x = k*k*k;
			k++;
			
			System.out.print(x);
		}
		System.out.println();
		
	}

}
