package pagamentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@DisplayName("Classe para teste do carrinho")
public class FaturaTest {
    ArrayList<Pagamento> pagamentos;
    @BeforeEach
    public void criaFatura(){
        Fatura fatura1 = new Fatura(1400,"Cliente 1");
        Fatura fatura2 = new Fatura(3000,"Cliente 2");
        Fatura fatura3 = new Fatura(1000,"Cliente 3");
        pagamentos = new ArrayList<Pagamento>();
        pagamentos.add(new Pagamento(fatura1));
        pagamentos.add(new Pagamento(fatura2));
        pagamentos.add(new Pagamento(fatura3));
    }

    @Test
    public void processaBoleto(){
        Boleto boleto = new Boleto( 400);
        pagamentos.forEach((pagamento -> {
            pagamento.boleto.add(boleto);
            pagamento.processaPagamento();
            Boolean pago = pagamento.getFatura().getPago();
            Assertions.assertFalse(pago);
        }));

    }
}
