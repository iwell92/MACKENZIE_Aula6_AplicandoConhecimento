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
		return  "N�mero do pedido: " + numero + 
				"\nC�digo do Produto: " + item.cod + "\nDescri��o: " + item.descricao + 
				"\nPre�o Produtdo: " + item.preco + "\nQuantidade: " + quantidade + 
				"\nValor total do pedido: " + valor;
	}

}
