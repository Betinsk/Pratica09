package application.exceptions;

public class Divisao {

	private int x;
	private int y;
	
	
	public Divisao(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	public int divisao () {
		if(x ==0 || y <10) {
			throw new ArithmeticException("O número x não pode ser igual 0 e o y menor que 10! ");
		}
		return x /y;
	}
	
}
