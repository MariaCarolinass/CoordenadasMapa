package arquivos;

import coordenadas.Coord;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArquivoTest {
    
    public ArquivoTest() {
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
    public void testLerCoord() throws Exception {
        System.out.println("lerCoord");
        String path = "";
        Map<String, ArrayList<Coord>> expResult = null;
        Map<String, ArrayList<Coord>> result = Arquivo.lerCoord(path);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
