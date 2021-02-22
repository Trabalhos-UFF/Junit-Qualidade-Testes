package pagamentos;

import java.util.Date;

public class Boleto {
    long codigo;
    Date data;
    float valorPago;
    public Boleto(float valorPago){
        this.codigo = Math.round((Math.random()*1000));
        this.data = new Date();
        this.valorPago = valorPago;
    }
}
