    public static void main(String[] args) {
        // Crear urna electoral
        UrnaElectoral urna = new UrnaElectoral();

        // Crear candidatos
        Candidato c1 = new Candidato(1, "Alice");
        Candidato c2 = new Candidato(2, "Bob");

        // Agregar candidatos a la urna
        urna.listaCandidatos.add(c1);
        urna.listaCandidatos.add(c2);

        // Crear votantes
        Votante v1 = new Votante(1, "Tomás");
        Votante v2 = new Votante(2, "Javiera");
        Votante v3 = new Votante(3, "Vicente");

        // Registrar votos
        urna.registrarVoto(v1, 1); // Tomás vota por Alice
        urna.registrarVoto(v2, 2); // Javiera vota por Bob
        urna.registrarVoto(v3, 1); // Vicente vota por Alice

        // Intentar votar de nuevo (debería dar error)
        urna.registrarVoto(v1, 2);

        // Reportar votos
        urna.reportarVoto(c1, 1); // Reporta voto de Tomás
        urna.reportarVoto(c2, 2); // Reporta voto de Javiera

        // Mostrar resultados
        System.out.println("Resultados:");
        var resultados = urna.obtenerResultados();
        for (String nombre : resultados.keySet()) {
            System.out.println(nombre + ": " + resultados.get(nombre) + " voto(s) válidos");
        }
    }
