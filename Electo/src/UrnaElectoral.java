import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class UrnaElectoral {
    private LinkedList<Candidato> listaCandidatos;
    private Stack<Voto> historialVotos;
    private Queue<Voto> votosReportados;
    private int idCounter;

    public UrnaElectoral() {
        this.listaCandidatos = new LinkedList<>();
        this.historialVotos = new Stack<>();
        this.votosReportados = new LinkedList<>();
        this.idCounter = 1;
    }

    public void agregarCandidato(Candidato candidato) {
        this.listaCandidatos.add(candidato);
    }

    public Boolean verificarVotante(Votante votante) {
        return votante.getyaVoto();
    }

    public void registrarVoto(Votante votante, int candidatoId) {
        if (verificarVotante(votante)) {
            System.out.println("El votante ya ha votado");
            return;
        }

        // Buscar el candidato correspondiente
        Candidato candidato = null;
        for (Candidato c : listaCandidatos) {
            if (c.getId() == candidatoId) {
                candidato = c;
                break;
            }
        }

        if (candidato == null) {
            System.out.println("Candidato no encontrado.");
            return;
        }

        Voto voto = new Voto(idCounter, votante.getId(), candidatoId);
        candidato.agregarVoto(voto);
        historialVotos.push(voto);
        votante.marcarComovotado();
        System.out.println("Voto registrado exitosamente.");
        idCounter++;
    }
    public void reportarVoto(Candidato candidato, int idVoto) {
      Queue<Voto> votos = candidato.getVotosRecibidos();
      Voto votoAReportar = null;

      for(Voto v : votos) {
        if(v.getId() == idVoto) {
            votoAReportar = v;
            break;
        }
      }
      if(votoAReportar == null) {
        System.out.println("El voto no esta en la cola");
        return;
      }
      if(votosReportados.contains(votoAReportar)) {
        System.out.println("Es fraude");
        return;
      }
      votosReportados.add(votoAReportar);
      System.out.println("Voto con ID " + idVoto + " reportado para candidato " + candidato.getNombre());
    }

    public Map<String, Integer> obtenerResultados() {
    Map<String, Integer> conteo = new HashMap<>();

    for(Candidato candidato : listaCandidatos) {
        int contador=0;
        for(Voto voto : candidato.getVotosRecibidos()) {
            if(!votosReportados.contains(voto)) {
                contador++;
            }
        }
        conteo.put(candidato.getNombre(),contador);
        }
        return conteo;
    }
}
