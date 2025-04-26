    public class Main {
    public static void main(String[] args) {
        // Crear urna electoral
        UrnaElectoral urna = new UrnaElectoral();

        // Crear candidatos
        Candidato c1 = new Candidato(1, "Marcos", "Partido A");
        Candidato c2 = new Candidato(2, "Cristian", "Partido A");

        // Agregar candidatos a la urna
        urna.agregarCandidato(c1);
        urna.agregarCandidato(c2);

        // Crear votantes
        Votante v1 = new Votante(1, "Tomás");
        Votante v2 = new Votante(2, "Mariana");
        Votante v3 = new Votante(3, "Jose");

        // Registrar votos
        urna.registrarVoto(v1, 1); // Tomas vota por marcos
        urna.registrarVoto(v2, 2); // Mariana vota por Cristian
        urna.registrarVoto(v3, 1); // Jose vota por Marcos

        // Intentar votar de nuevo (debería dar error)
        urna.registrarVoto(v1, 2);

        // Mostrar la hora de los votos registrados
        System.out.println("\nHoras de los votos registrados:");
        for (Voto voto : c1.getVotosRecibidos()) {
            System.out.println("Voto para " + c1.getNombre() + " del " + c1.getPartido() + " a las " + voto.getTimestamp());
        }
        for (Voto voto : c2.getVotosRecibidos()) {
            System.out.println("Voto para " + c2.getNombre() + " del " + c2.getPartido() + " a las " + voto.getTimestamp());
        }

        // Reportar votos
        System.out.println("Voto con ID 1 reportado para candidato " + c1.getNombre());
        System.out.println("Voto con ID 2 reportado para candidato " + c2.getNombre());

        // Mostrar resultados
        System.out.println("Resultados:");
        var resultados = urna.obtenerResultados();
        for (String nombre : resultados.keySet()) {
            System.out.println(nombre + ": " + resultados.get(nombre) + " voto(s) válidos");
        }
    }
}
