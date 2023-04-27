import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @org.junit.jupiter.api.Test
    void testCanalOrigenCeroDestinoCero() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(0, 0);
        System.out.println(resultado);
        assertEquals(0, resultado);
    }
}