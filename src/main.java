import modelo.ContaAreceber;
import modelo.Pagamento;

import java.time.LocalDate;

public class main {
    public static void main (String[] args){
        ContaAreceber cr = new ContaAreceber(1000, Anaclara);
        System.out.println(cr);
        Pagamento p1 = new Pagamento(500, LocalDate.now());
        System.out.println(p1);
    }
}
