
public class Voto {
    private int id;
    private int votanteId;
    private int candidatoId;
    private String timestamp;

    public Voto(int id, int votanteId, int candidatoId) {
        this.id = id;
        this.votanteId = votanteId;
        this.candidatoId = candidatoId;
       
        // this.timestamp = LocalTime.now().toString();
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

    public void setId(int id) {
        this.id = id;
    }

    public void setVotanteId(int votanteId) {
        this.votanteId =votanteId;
    }
    public void setCandidatoId(int candidatoId){
        this.candidatoId = candidatoId;
    }
}
