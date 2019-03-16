package model;

public class ItemPedido {
	private long valor;
	private int qtd;
	private String   nome;
	
	public ItemPedido(long valor, int qtd, String nome) {
		this.valor = valor;
		this.qtd = qtd;
	    this.nome = nome;
	 }

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
