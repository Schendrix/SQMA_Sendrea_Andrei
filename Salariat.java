import java.util.ArrayList;
import java.util.List;

public class Salariat {
    public double calculSalariu (int salariuBrut){
        return (double) salariuBrut - 20%salariuBrut;
    }

    public double majorareSalariu(int vechimeLuni, int salariuNet){
        if(vechimeLuni<12){
            throw new IllegalArgumentException();
        }
        return  (double) salariuNet * vechimeLuni/12;
    }

    public boolean esteMajor(int varsta){
        if (varsta >= 18){
            return true;
        }
        else { 
            return false;
        }
    }

}
