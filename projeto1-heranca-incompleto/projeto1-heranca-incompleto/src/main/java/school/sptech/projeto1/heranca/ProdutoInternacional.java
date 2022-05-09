package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto{
    private Double prdInternacional;
    /* 
        Essa classe deve ser herdeira de produto;
        O método "getPreco" (getter padrão) deverá ser sobreescrito e possuir um acréscimo de 
        60%;
    */   

    public ProdutoInternacional(Integer id,
                                String nome,
                                String categoria,
                                Double preco) {
        super(id, nome, categoria, preco);
    }

    public Double getPrecoImportado() {
        return prdInternacional;
    }

    public void setPrecoImportado(Double precoImportado) {
        this.prdInternacional = precoImportado;
    }
    
    public Double calcularPorcentagem() {
           double percentual = 60.0 / 100.0;
           return super.getPreco() + (getPreco() * percentual); 
    }

    @Override
    public String toString() {
        return String.format("Preço internacional: %.2f", prdInternacional);
    }

   
    
    
    
}
