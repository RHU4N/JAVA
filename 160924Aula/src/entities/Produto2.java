package entities;

public class Produto2 {
	private String nome;
	private double preco;
	private int quantidade;
	public Produto2() {
		// TODO Auto-generated constructor stub
	}
	public Produto2(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto2(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotalEstoque() {
		return preco*quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade+=quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade-=quantidade;
	}
	
	public String toString() {
		return nome
				+", R$"
				+ String.format("%,2f", preco)
				+ ", " + quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f", valorTotalEstoque());
	}
}
