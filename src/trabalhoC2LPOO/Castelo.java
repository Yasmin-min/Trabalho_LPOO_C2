package trabalhoC2LPOO;

public abstract class Castelo {
	
	protected int defesa;
	protected int pontosVida;
	protected String nome;
	
	
	public Castelo(String nome) {
		super();
		this.defesa = 2;
		this.pontosVida = 2;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getPontosVida() {
		return pontosVida;
	}

	public String situacao() {
		return toString();
		
	}
	
	public boolean ataque(int p) {
		if(this.defesa > 0) {
			this.defesa--;
			return true;
		}else if(this.pontosVida >  0){
			this.pontosVida--;
			this.defesa = 2;
			return true;
		}else {
		return false;
		}
	}

	public String toString() {
		return "Castelo [defesa=" + defesa + ", pontosVida=" + pontosVida + ", nome=" + nome + "]";
	}

}
