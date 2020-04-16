package app;

public class App {
    public static void main(String[] args) throws Exception {
        Olimpiada olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.edad = 35;
        maratonista1.peso = 70;
        maratonista1.energia = 97;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);
        corrio = maratonista1.correr();

        while (maratonista1.energia > 0) {
            corrio = maratonista1.correr();

            // if (corrio) {
            // System.out.println("El maratonista " + maratonista1.nombre + " ha corrido");
            // } else {
            // System.out.println("No ha corrido esta lesionado");

            // }
            // if (maratonista1.energia<=0) {
            // System.out.println("Se quedo sin energia" + maratonista1.energia);

        }

        int cantidadParticipantes;
        cantidadParticipantes = olimpiadaCoronaEdition.participantes.size(); // tamaño de la lista

        System.out.print("La cantidad de participantes es: " + cantidadParticipantes);

    }
}
