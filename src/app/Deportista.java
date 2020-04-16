package app;

public class Deportista extends Persona {
    public double altura;
    public double peso;
    public String deporte;
    public int nroDeportiva;

    public void participar(Olimpiada olimpiada) {

        olimpiada.inscribir(this);
    }

}