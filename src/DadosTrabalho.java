import java.util.ArrayList;

public class DadosTrabalho {
    protected String titulo, orientador;

    DadosTrabalho(String titulo, String orientador){
        this.titulo = titulo;
        this.orientador = orientador;
    }

    public String getDados(){
        String resp = "Titulo: " + titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";
        resp += "\n";
        return resp;
    }
}

