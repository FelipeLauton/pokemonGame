package classes;

public class Pokemon {

	//Atributos da classe
	private String nome;
	
	private int Ataque;
	
	private int Defesa;
	
	private int Agilidade;
	
	private int HP;
	
	private String tipo;
	
	//Construtor
	public Pokemon(String nome, int Ataque, int Defesa, int Agilidade, int HP, String tipo) {
		this.nome = nome;
		this.Ataque = Ataque;
		this.Defesa = Defesa;
		this.Agilidade = Agilidade;
		this.HP = HP;
		this.tipo = tipo;
	}
	
	//Encapsulamento 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return Ataque;
	}

	public void setAtaque(int ataque) {
		Ataque = ataque;
	}

	public int getDesefa() {
		return Defesa;
	}

	public void setDesefa(int desefa) {
		Defesa = desefa;
	}

	public int getAgilidade() {
		return Agilidade;
	}

	public void setAgilidade(int agilidade) {
		Agilidade = agilidade;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos
	public void Atacar(int ataque) {
		this.HP = this.HP - ataque;
	}
	
}
