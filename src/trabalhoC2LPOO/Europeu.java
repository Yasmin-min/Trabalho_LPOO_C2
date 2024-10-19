package trabalhoC2LPOO;

public class Europeu extends Castelo {
	
	private int numPaladinos;

	public Europeu(String nome) {
		super(nome);
		this.defesa = 3;
		this.pontosVida = 2;
		this.numPaladinos = 10;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getPontosVida() {
		return pontosVida;
	}

	public int getNumPaladinos() {
		return numPaladinos;
	}

	public boolean ataque(int dado) {
		this.numPaladinos -= dado;
		if(numPaladinos < 0) {
			if(super.ataque(dado) == true) {
				numPaladinos += 10;
				return true;
			}
			return false;
		}
		return true;
	}
	
	public String situacao() {
		return toString();
	}
	
	public String toString() {
		return "Castelo [defesa=" + defesa + ", pontosVida=" + pontosVida + ", nome= " + nome + " Paladinos: " + numPaladinos + "]";
	}

}
