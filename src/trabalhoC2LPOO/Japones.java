package trabalhoC2LPOO;

public class Japones extends Castelo {
	
	private int numSamurais;
	
	
	public Japones(String nome) {
		super(nome);
		this.pontosVida = 2;
		this.defesa = 2;
		this.numSamurais = 15;
		// TODO Auto-generated constructor stub
	}

	public int getDefesa() {
		return defesa;
	}

	public int getPontosVida() {
		return pontosVida;
	}

	public int getNumSamurais() {
		return numSamurais;
	}
	
	public boolean ataque(int dado) {
		this.numSamurais -= dado;
		if(numSamurais < 0) {
			if(super.ataque(dado) == true) {
				numSamurais += 15;
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
		return "Castelo [defesa=" + defesa + ", pontosVida=" + pontosVida + ", nome= " + nome + "  Samurais: " + numSamurais + "]";
	}

	

}
