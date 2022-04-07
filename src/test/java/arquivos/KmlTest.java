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

public class KmlTest {
    
    public KmlTest() {
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
    public void testExportKml() {
        System.out.println("exportKml");
        String nome = "";
        Map<String, ArrayList<Coord>> dadosCoord = null;
        Kml.exportKml(nome, dadosCoord);
        fail("The test case is a prototype.");
    }
    
}
