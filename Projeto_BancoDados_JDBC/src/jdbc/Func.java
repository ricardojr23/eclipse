package jdbc;

public class Func {
	
	private int codigo;
	private String nome;
	private String cargo;
	private String endereco;
	
	public Func(int codigo, String nome, String cargo, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
	
}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}


