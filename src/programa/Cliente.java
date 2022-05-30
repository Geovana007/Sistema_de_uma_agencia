package programa;

public class Cliente {
	private static int counter = 1;
	
	private String nome;
	private String cpf;
	private String email;
	private String saldo;
	
	public Cliente(String nome, String cpf, String email, String saldo) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		setCounter(getCounter() + 1);
	}

	public Cliente(String nome2, String cpf2, String email2) {
	}

	public static int getCounter() {
	return counter;
}
	public static void setCounter(int counter) {
	Cliente.counter = counter;
}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCPF: " + this.getCpf() +
				"\nEmail: " + this.getEmail()+
				"\nSaldo: " + this.getSaldo();
		
	}

	
	}
	
	
