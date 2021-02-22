package pagamentos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste do carrinho")
public class FaturaTest {
    @BeforeEach
    public void criaFatura(){
        Fatura fatura = new Fatura(1400,"Cliente Nome");
    }

    @Test
    public void testeInicial(){

    }
}
