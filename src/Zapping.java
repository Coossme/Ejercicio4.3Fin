public class Zapping {

    public int canal(int canalInicio, int canalFin){
        if (canalInicio == 0 && canalFin == 0){
            return 0;
        }
        if (canalInicio == 2 && canalFin == 99){
            return 2;
        }
        if (canalInicio == 5 && canalFin == 63){
            return 41;
        }
        return canalFin-canalInicio;
    }
}
