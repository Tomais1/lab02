import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Voto {
    private int id;
    private int votanteId;
    private int candidatoId;
    private String timestamp;

    public Voto(int id, int votanteId, int candidatoId) {
        this.id = id;
        this.votanteId = votanteId;
        this.candidatoId = candidatoId;
       
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:s a"); // Formato de hora
        this.timestamp = LocalTime.now().format(formatter); // Asignar el timestamp actual en el formato deseado    
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

    public String getTimestamp() {
    return timestamp;
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

