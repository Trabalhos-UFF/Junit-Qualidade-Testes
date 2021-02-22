package pagamentos;

import java.util.Date;

public class Fatura {
    Date data;
    float valorTotal;
    float valorPago;
    String cliente;
    boolean paga;
    public Fatura(float valorTotal, String cliente){
        this.valorTotal=valorTotal;
        this.cliente=cliente;
        this.valorPago = 0;
        this.paga = false;
    }
    public boolean getPago(){
        return this.paga;
    }
    public void adicionaValorPago(float valor){
        this.valorPago += valor;
        if(this.valorPago>=valorTotal){
            this.paga = true;
        }
    }
}
