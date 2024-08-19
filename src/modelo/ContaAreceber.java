package modelo;

import java.util.List;

public class ContaAreceber implements ContaInterface {
    private List<Pagamento> pagamentoList;

    private float valor;
    private String fonte;

    @Override
    public String toString() {
        return "contareceber{" +
                "valor=" + valor +
                ", fonte='" + fonte + '\'' +
                '}';
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public ContaAreceber(float valor, String fonte) {
        this.valor = valor;
        this.fonte = fonte;
    }

    @Override
    public void addPagamento(Pagamento p) {

    }
}
