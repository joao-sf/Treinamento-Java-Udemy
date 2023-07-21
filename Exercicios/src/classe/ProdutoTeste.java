package classe;

class ProdutoTeste {
	public static void main(String[] args) {
// Usando o contrutor criado
		Produto p1 = new Produto("Notebook",4356.89);
		//p1.nome = "Notebook;";
		//p1.preco = 4356.89;	
		p1.desconto = 0.25;
//Usando o contruto padrão 
		var p2 = new Produto("Caneta Preta",12.56 );
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Media do CArrinho  =  R$%.2f.", mediaCarrinho);
	}

}
