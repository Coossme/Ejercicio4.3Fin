public class Zapping {

    public int canal(int canalInicio, int canalFin) {
        int total = 99;
        if (canalInicio == canalFin) {
            return 0;
        } else if (canalInicio > canalFin) {
            return (total - canalInicio) + canalFin;
        } else if ((canalFin-canalInicio)>((total-canalFin)+canalInicio)) {
            return (total-canalFin)+canalInicio;
        }
        return canalFin-canalInicio;
    }

    }

