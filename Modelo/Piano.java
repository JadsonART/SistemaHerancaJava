package modelo;

public class Piano extends Instrumento {

    private int numeroTeclas;

    public Piano(String nome, String tipo, int numeroTeclas) {
        super(nome, tipo);
        this.numeroTeclas = numeroTeclas;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    @Override
    public String tocar() {
        return "O piano está tocando: notas clássicas";
    }

    @Override
    public String toString() {
        return "Piano [nome=" + getNome() + ", tipo=" + getTipo() + ", teclas=" + numeroTeclas + "]";
    }
}
