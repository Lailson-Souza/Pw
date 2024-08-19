package modelo;

import java.time.LocalDate;
import java.util.*;

public class Pagamento {
    private float valor;
    private LocalDate date;

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", date=" + date +
                '}';
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Pagamento(float valor, LocalDate date) {
        this.valor = valor;
        this.date = date;
    }
}


