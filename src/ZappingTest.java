import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @org.junit.jupiter.api.Test
    void testCanalOrigenCeroDestinoCero() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(0, 0);
        int resultado2 = 0;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void cnalOrigenUnoDestinoDos() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(1, 2);
        int resultado2 = 1;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenDiezDestinoTreinta() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(10, 30);
        int resultado2 = 20;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenDosDestinoNoventaYNueve() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(2, 99);
        int resultado2 = 2;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenCincoDestinoSesentaYTres() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(5, 63);
        int resultado2 = 41;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenSesentaYTresDestinoCinco() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(63, 5);
        int resultado2 = 41;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }

    @org.junit.jupiter.api.Test
    void canalOrigenUnoDestinoCincuentYUno() {
        Zapping zapping = new Zapping();
        int resultado = zapping.canal(1, 51);
        int resultado2 = 49;
        System.out.println(resultado);
        assertEquals(resultado2,resultado);
    }
}