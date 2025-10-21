package informationExperteCreator;

//Venda.java
import java.util.ArrayList;
import java.util.List;

public class Venda {
	// A Venda (o "todo") contém a lista de ItemVenda (as "partes")
	private List<ItemVenda> itens;

	public Venda() {
		this.itens = new ArrayList<>();
	}

	// Aplicação do Creator:
	// A Venda é responsável por criar (new) e adicionar o ItemVenda
	// porque ela o contém.
	public ItemVenda criarItemVenda(Produto produto, int quantidade) {
		ItemVenda novoItem = new ItemVenda(produto, quantidade); // Creator
		itens.add(novoItem);
		return novoItem;
	}

	// Aplicação do Information Expert:
	// A Venda calcula o total geral porque ela tem a lista de ItemVenda,
	// que é a informação essencial para a soma.
	public double calcularTotal() {
		double total = 0.0;
		for (ItemVenda item : itens) {
			// Delega a responsabilidade parcial ao ItemVenda (que é um Expert parcial)
			total += item.calcularSubtotal();
		}
		return total;
	}
}
