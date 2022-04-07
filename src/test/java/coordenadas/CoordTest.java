package coordenadas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoordTest {
    
    public CoordTest() {
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
    public void testGetNome() {
        System.out.println("getNome");
        Coord instance = new Coord();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLat() {
        System.out.println("getLat");
        Coord instance = new Coord();
        String expResult = "";
        String result = instance.getLat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLon() {
        System.out.println("getLon");
        Coord instance = new Coord();
        String expResult = "";
        String result = instance.getLon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetX() {
        System.out.println("getX");
        Coord instance = new Coord();
        Double expResult = null;
        Double result = instance.getX();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Coord instance = new Coord();
        Double expResult = null;
        Double result = instance.getY();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetZ() {
        System.out.println("getZ");
        Coord instance = new Coord();
        Double expResult = null;
        Double result = instance.getZ();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStn() {
        System.out.println("getStn");
        Coord instance = new Coord();
        Integer expResult = null;
        Integer result = instance.getStn();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Coord instance = new Coord();
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLat() {
        System.out.println("setLat");
        String lat = "";
        Coord instance = new Coord();
        instance.setLat(lat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLon() {
        System.out.println("setLon");
        String lon = "";
        Coord instance = new Coord();
        instance.setLon(lon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetX() {
        System.out.println("setX");
        Double x = null;
        Coord instance = new Coord();
        instance.setX(x);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetY() {
        System.out.println("setY");
        Double y = null;
        Coord instance = new Coord();
        instance.setY(y);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetZ() {
        System.out.println("setZ");
        Double z = null;
        Coord instance = new Coord();
        instance.setZ(z);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStn() {
        System.out.println("setStn");
        Integer stn = null;
        Coord instance = new Coord();
        instance.setStn(stn);
        fail("The test case is a prototype.");
    }
    
}
