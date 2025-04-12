import java.util.LinkedList;
import java.util.Queue;

public class Voto {
    private int id;
    private int votanteId;
    private int candidatoId;
    private String timestamp;

    public Voto(int id, int votanteId, int candidatoId) {
        this.id = id;
        this.votanteId = votanteId;
        this.candidatoId = candidatoId;
    }

    public int getId() {
        return id;
    }

    public int getVotanteId() {
        return votanteId;
    }

    public int getCandidatoId() {
        return candidatoId;
    }
}

