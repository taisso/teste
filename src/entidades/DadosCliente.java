package entidades;

public class DadosCliente {
	
	private String nomeString;
	private String email;
	private Double salario;
	
	
	public DadosCliente(String nomeString, String email, Double salario) {
		this.nomeString = nomeString;
		this.email = email;
		this.salario = salario;
	}


	public String getNomeString() {
		return nomeString;
	}


	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	
	
}
