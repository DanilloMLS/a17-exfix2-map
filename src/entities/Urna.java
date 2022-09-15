package entities;

public class Urna implements Comparable<Urna>{
    
    private String nomeCandidato;
    private int votos;
    
    public Urna(String nomeCandidato, int votos) {
        this.nomeCandidato = nomeCandidato;
        this.votos = votos;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeCandidato == null) ? 0 : nomeCandidato.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Urna other = (Urna) obj;
        if (nomeCandidato == null) {
            if (other.nomeCandidato != null)
                return false;
        } else if (!nomeCandidato.equals(other.nomeCandidato))
            return false;
        return true;
    }

    @Override
    public int compareTo(Urna o) {
        // TODO Auto-generated method stub
        return nomeCandidato.toUpperCase().compareTo(o.getNomeCandidato().toUpperCase());
    }
}
