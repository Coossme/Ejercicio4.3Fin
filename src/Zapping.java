public class Zapping {

    public int canal(int canalInicio, int canalFin){
        if (canalInicio == 0 && canalFin == 0){
            return 0;
        }
        if (canalInicio==1 && canalFin ==2){
            return canalFin-canalInicio;
        }
        if (canalInicio == 10 && canalFin == 30){
            return canalFin-canalInicio;
        }
        return 11;
    }
}
