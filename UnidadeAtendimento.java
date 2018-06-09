public class UnidadeAtendimento {

    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;

    public UnidadeAtendimento() {}

    public UnidadeAtendimento(double codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	 public UnidadeAtendimento(double codigo, String nome, String endereco, String telefone) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}

    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat ("(##) ####-####");
		String strArea = df.format(telefone);
		return "Código: " + codigo + "\n" +
               "Nome: " + nome + "\n" +
               "Endereço: " + endereco + "\n"
               "Telefone: " + telefone;
	}

}
