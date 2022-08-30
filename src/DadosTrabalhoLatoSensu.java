public class DadosTrabalhoLatoSensu extends DadosTrabalho{
    DadosTrabalhoLatoSensu(String titulo, String orientador) {
        super(titulo, orientador);
    }
    @Override
    public String getDados(){
        String resp = "Título da monografia: " + titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";
        resp += "\n";
        return resp;
    }
}
