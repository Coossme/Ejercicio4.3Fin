import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @org.junit.jupiter.api.Test
    void testCanalOrigenCeroDestinoCero() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(0, 0);
        System.out.println(resultado);
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    void cnalOrigenUnoDestinoDos() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(1, 2);
        System.out.println(resultado);
        assertEquals(1, resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenDiezDestinoTreinta() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(10, 30);
        System.out.println(resultado);
        assertEquals(20, resultado);
    }
}