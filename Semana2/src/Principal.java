import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		Pizza mussarela = new Pizza();
		mussarela.addIngrediente("tomate");
		mussarela.addIngrediente("presunto");
		mussarela.addIngrediente("mussarela");

		Pizza calabresa = new Pizza();
		calabresa.addIngrediente("beringela");
		calabresa.addIngrediente("mussarela");

		Pizza catupiry = new Pizza();
		catupiry.addIngrediente("tomate");
		catupiry.addIngrediente("catupiry");
		catupiry.addIngrediente("calabresa");
		catupiry.addIngrediente("mussarela");
		catupiry.addIngrediente("mussarela");
		catupiry.addIngrediente("mussarela");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionarPizza(mussarela);
		carrinho.adicionarPizza(calabresa);
		carrinho.adicionarPizza(catupiry);

		System.out.println("Preço da pizza de mussarela: " + mussarela.getPreco());
		System.out.println("Preço da pizza de calabresa: " + calabresa.getPreco());
		System.out.println("Preço da pizza de catupiry: " + catupiry.getPreco());

		System.out.println("\nTotal do carrinho: " + carrinho.totalDoCarrinho());

		System.out.println("\ningredientes utilizados e quantidades:");

		for (Map.Entry<String, Integer> ingrediente : Pizza.ingredientesTotais.entrySet()) {
			System.out.println("ingrediente: " + ingrediente.getKey() + " quantidade: " + ingrediente.getValue());
		}
	}
}
