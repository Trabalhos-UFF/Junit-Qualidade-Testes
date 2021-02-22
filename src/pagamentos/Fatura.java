package pagamentos;

import java.util.Date;

public class Fatura {
    Date data;
    float valorTotal;
    String cliente;
    public Fatura(float valorTotal, String cliente){
        this.valorTotal=valorTotal;
        this.cliente=cliente;
    }
}
