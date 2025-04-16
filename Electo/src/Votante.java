public class Votante {
    private int id;
    private String nombre;
    private Boolean yaVoto;

    public Votante(int id,String nombre,Boolean yaVoto) {
        this.id = id;
        this.nombre = nombre;
        this.yaVoto = yaVoto;
        } 
        //getters
        public int getId() {
            return id;
        }
        public String getNombre() {
            return nombre;
        }
        public Boolean getyaVoto() {
            return yaVoto;
        }

        // metodo para marcar los votos
        public void marcarComovotado() {
        this.yaVoto = true;
        }

        // setters
        public void setId(int id) {
            this.id = id;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setyaVoto(Boolean yaVoto) {
            this.yaVoto = yaVoto;
        }
    }
