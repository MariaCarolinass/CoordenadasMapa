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
        System.out.println("FecharConexao");
        Conexao instance = new Conexao();
        instance.FecharConexao();
        fail("The test case is a prototype.");
    }

    @Test
    public void testInserirDados() throws Exception {
        System.out.println("inserirDados");
        String nome = "";
        Map<String, ArrayList<Coord>> dadosCoord = null;
        Conexao instance = new Conexao();
        instance.inserirDados(nome, dadosCoord);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarID() throws Exception {
        System.out.println("buscarID");
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
        System.out.println("atualizarID");
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
        System.out.println("deletarID");
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
