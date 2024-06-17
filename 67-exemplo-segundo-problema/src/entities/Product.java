package entities;


public class Product {

    public String nomeDoProduto;
    public double valorDoProduto;
    public int quantidadeDoProduto;


    public double valorTotalNoEstoque() {
        return valorDoProduto * quantidadeDoProduto;
    }

    public void adicionarProduto(int quantidadeAdicionada) {
        quantidadeDoProduto += quantidadeAdicionada;
    }

    public void removerProduto(int quantidadeRemovida) {
        quantidadeDoProduto -= quantidadeRemovida;
    }

    public String toString() {
        return nomeDoProduto
                + ", $ "
                + String.format("%.2f", valorDoProduto)
                + ", "
                + quantidadeDoProduto
                + " units, Total: $ "
                + String.format("%.2f", valorTotalNoEstoque())
        ;
    }
}

