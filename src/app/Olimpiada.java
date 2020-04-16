package app;

import java.util.ArrayList;
import java.util.List;

public class Olimpiada {
    public List<Deportista> participantes = new ArrayList<>();
    public void inscribir(Deportista depor){
        this.participantes.add(depor);
    }
}
