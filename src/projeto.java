import java.util.Date;

public class projeto {


    public class main {

        private float valor;
        private Date date;

        public main(float valor, Date date) {
            this.valor = valor;
            this.date = date;
        }

        @Override
        public String toString() {
            return "main{" +
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

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

}
