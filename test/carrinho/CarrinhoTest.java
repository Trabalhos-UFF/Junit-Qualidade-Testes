package carrinho;

import org.junit.jupiter.api.*;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTest {
    Carrinho carrinho = new Carrinho();
    Produto[] produtos = {new Produto("", 10), new Produto("Blusa", 30), new Produto("Calca", 80), new Produto("Casaco", 120)};
    @BeforeEach
    public void preencheCarrinho(){
        for(int i = 0; i< produtos.length; i++){
            carrinho.addItem(produtos[i]);
        }
    }
    @AfterEach
    public void esvaziaCarrinho(){
        carrinho.esvazia();
    }
    @Test
    public void testeSeCarrinhoInsereTodosItens(){
        Assertions.assertEquals(carrinho.getQtdeItems(),produtos.length);
    }
    @Test
    public void TestSeOCarrinhoEsvazia(){
        carrinho.esvazia();
        Assertions.assertEquals(carrinho.getQtdeItems(),0);
    }
    @Test
    public void TestSeOValorTotalTaCerto(){
        Assertions.assertEquals(carrinho.getValorTotal(),240);
    }
    @Test
    public void TestSeOItemRemove(){
            Assertions.assertDoesNotThrow(()->carrinho.removeItem(produtos[1]));
            Assertions.assertEquals(carrinho.getQtdeItems(), produtos.length-1);
    }
    @Test
    public void TestRemoverItemForaDaLista(){
        Assertions.assertThrows(ProdutoNaoEncontradoException.class, ()->carrinho.removeItem(new Produto("Blusa Manga Longa",45)));
    }


}
