public class DadosTrabalhoGraduacao extends DadosTrabalho{
    private float nota;
    DadosTrabalhoGraduacao(String titulo, String orientador, float nota) {
        super(titulo, orientador);
        this.nota = nota;
    }

    @Override
    public String getDados(){
        String resp = "Título do TCC: " + titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";

        resp += "Nota: " + nota;

        resp += "\n";
        return resp;
    }
}
