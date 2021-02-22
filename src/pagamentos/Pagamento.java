package pagamentos;

import java.util.ArrayList;

public class Pagamento {
    ArrayList<Boleto> boleto;
    Fatura fatura;
    public Pagamento (Fatura fatura) {
        this.fatura = fatura;
        boleto = new ArrayList<Boleto>();
    }
    public Fatura getFatura(){
        return this.fatura;
    }
    public void processaPagamento(){
        boleto.forEach(boletoPago->{
            fatura.adicionaValorPago(boletoPago.getValorPago());
        });
    }
}
