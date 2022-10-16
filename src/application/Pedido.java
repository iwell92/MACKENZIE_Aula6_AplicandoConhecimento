package application;

public class Pedido {
	
	int numero, quantidade;
	Produto item;
	double valor; 
	
	public Pedido(int numero, Produto item, int quantidade) {
		super();
		this.numero = numero;
		this.item = item;
		this.quantidade = quantidade;
	}

	public double calculaPedido () {
		return valor = quantidade * item.preco;
	}
	
	@Override
	public String toString() {
		return  "Número do pedido: " + numero + 
				"\nCódigo do Produto: " + item.cod + "\nDescrição: " + item.descricao + 
				"\nPreço Produtdo: " + item.preco + "\nQuantidade: " + quantidade + 
				"\nValor total do pedido: " + valor;
	}

}
