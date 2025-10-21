package informationExperteCreator;

//Main.java
public class Main {
	public static void main(String[] args) {
		// 1. Configuração dos Produtos
		Produto cafe = new Produto("Café Expresso", 5.00);
		Produto bolo = new Produto("Fatia de Bolo", 12.50);
		// 2. Criação da Venda (Objeto principal)
		Venda venda1 = new Venda();
		System.out.println("--- Iniciando a Venda 1 ---");
		// 3. Adicionando Itens de Venda usando o padrão Creator
		// A Venda.criarItemVenda() usa o 'new ItemVenda(...)'
		venda1.criarItemVenda(cafe, 2); // 2 x R$ 5.00
		venda1.criarItemVenda(bolo, 1); // 1 x R$ 12.50

		System.out.println("Itens adicionados à venda (usando Creator).");
		// 4. Calculando o Total usando o padrão Information Expert
		// A Venda calcula o total porque tem todos os Itens (é o Expert do Total).
		double totalVenda1 = venda1.calcularTotal();

		System.out.println("\n--- Resumo da Venda (usando Expert) ---");
		System.out.println("Total calculado: R$ " + totalVenda1);

		// Verificação: 2 * 5.00 + 1 * 12.50 = 10.00 + 12.50 = 22.50
		if (totalVenda1 == 22.50) {
			System.out.println("Cálculo correto! Os padrões funcionaram.");
		}
		
        System.out.println("\n/////////////////////////////////////");
		
		// Criação da Venda 2 (venda2)
        Venda venda2 = new Venda();
        System.out.println("\n--- Iniciando Venda 2 ---");
        venda2.criarItemVenda(bolo, 2);  // 2 x R$ 12,50
        venda2.criarItemVenda(cafe, 3);  // 3 x R$ 5,00
        
		System.out.println("Itens adicionados à venda (usando Creator).");

        double totalVenda2 = venda2.calcularTotal();
        System.out.println("\n--- Resumo da Venda (usando Expert) ---");
        System.out.println("Total da Venda 2: R$ " + totalVenda2);
        
        // Verificação: 3 * 5.00 + 2 * 12.50 = 15.00 + 25.00 = 40.00
        		if (totalVenda2 == 40.00) {
        			System.out.println("Cálculo correto! Os padrões funcionaram.");
        		}	
	}
}
