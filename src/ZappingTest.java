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

    @org.junit.jupiter.api.Test
    void canalOrigenDosDestinoNoventaYNueve() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(2, 99);
        System.out.println(resultado);
        assertEquals(2, resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenCincoDestinoSesentaYTres() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(5, 63);
        System.out.println(resultado);
        assertEquals(41, resultado);
    }
}