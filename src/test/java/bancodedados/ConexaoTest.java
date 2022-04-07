package bancodedados;

import coordenadas.Coord;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConexaoTest {
    
    public ConexaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testFecharConexao() {
        System.out.println("Fechar Conexão");
        Conexao conexao = new Conexao();
        if (conexao != null) {
            conexao.FecharConexao();
            System.out.println("Conexão fechada!");
        }
    }

    @Test
    public void testInserirDados() throws Exception {
        System.out.println("Inserir Dados");
        String nome = "";
        if (nome == null) {
            System.out.println("Nome não existe!");
            return;
        }
        Conexao conexao = new Conexao();
        Map<String, ArrayList<Coord>> dadosCoord = null;
        if (dadosCoord != null) {
            conexao.inserirDados(nome, dadosCoord);
        } else {
            System.out.println("Os dados da coordenada não existem!");
        }
    }

    @Test
    public void testBuscarID() throws Exception {
        System.out.println("Buscar ID");
        String tabela = "";
        String coluna = "";
        String valor = "";
        Conexao instance = new Conexao();
        int expResult = 0;
        int result = instance.buscarID(tabela, coluna, valor);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAtualizarID() throws Exception {
        System.out.println("Atualizar ID");
        String id = "";
        String tabela = "";
        String coluna = "";
        String valor = "";
        Conexao instance = new Conexao();
        int expResult = 0;
        int result = instance.atualizarID(id, tabela, coluna, valor);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeletarID() throws Exception {
        System.out.println("Deletar ID");
        String tabela = "";
        String coluna = "";
        String valor = "";
        Conexao instance = new Conexao();
        int expResult = 0;
        int result = instance.deletarID(tabela, coluna, valor);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
