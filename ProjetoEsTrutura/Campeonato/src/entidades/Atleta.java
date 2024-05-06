
package entidades;

public class Atleta extends Pessoa {
    private String pais;
    private Double tempo;

    public Atleta() {
    }
    
    
    public Atleta(String name, String pais, Character sex, Double tempo) {
        super(name, sex);
        this.pais = pais;
        this.tempo = tempo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Nome=" + this.name + ", Sexo=" + this.sex + ", País=" + pais + ", Tempo=" + tempo ;
    }


    
    
    
    
}
