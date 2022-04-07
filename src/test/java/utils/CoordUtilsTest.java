package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoordUtilsTest {
    
    public CoordUtilsTest() {
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
    public void testConvertLatDMStoDD() {
        System.out.println("convertLatDMStoDD");
        String lat = "";
        Double expResult = null;
        Double result = CoordUtils.convertLatDMStoDD(lat);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }


    @Test
    public void testConvertLonDMStoDD() {
        System.out.println("convertLonDMStoDD");
        String lon = "";
        Double expResult = null;
        Double result = CoordUtils.convertLonDMStoDD(lon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
