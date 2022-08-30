import java.util.ArrayList;

public class DadosTrabalhoDoutorado extends DadosTrabalho{
    private ArrayList<String> nomeAvaliadoresBanca = new ArrayList<>(4);
    DadosTrabalhoDoutorado(String titulo, String orientador,  ArrayList<String> nomeAvaliadoresBanca) {
        super(titulo, orientador);
        this.nomeAvaliadoresBanca = nomeAvaliadoresBanca;
    }

    @Override
    public String getDados(){
        String resp = "Título da dissertação: " + titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";
        resp += "Banca: " + nomeAvaliadoresBanca.get(0) + " - " + nomeAvaliadoresBanca.get(1) + "\n";
        resp += "Banca: " + nomeAvaliadoresBanca.get(2) + " - " + nomeAvaliadoresBanca.get(3);
        resp += "\n";
        return resp;
    }
}
