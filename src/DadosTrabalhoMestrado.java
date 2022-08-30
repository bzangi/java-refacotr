import java.util.ArrayList;

public class DadosTrabalhoMestrado extends DadosTrabalho{
    private ArrayList<String> nomeAvaliadoresBanca = new ArrayList<>(2);
    DadosTrabalhoMestrado(String titulo, String orientador, ArrayList<String> nomeAvaliadoresBanca) {
        super(titulo, orientador);
        this.nomeAvaliadoresBanca = nomeAvaliadoresBanca;
    }

    @Override
    public String getDados(){
        String resp = "Título da dissertação: " + titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";
        resp += "Banca: " + nomeAvaliadoresBanca.get(0) + " - " + nomeAvaliadoresBanca.get(1);
        resp += "\n";
        return resp;
    }
}
