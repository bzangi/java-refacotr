public class Aluno {
    protected String nome;
    protected boolean e_bolsista;

    protected int cod_matricula;
    protected double mensalidade_curso;
    protected double desconto;
    protected Curso curso;

    public Aluno(String nome, int cod_matricula, double mensalidade_curso, double desconto, Curso curso) {
        this.nome = nome;
        this.cod_matricula = cod_matricula;
        this.e_bolsista = false;
        this.mensalidade_curso = mensalidade_curso;
        this.desconto = desconto;
        this.curso = curso;
    }

    public Aluno() {

    }


    public String getDados()
    {
        String resp = "Aluno: "+ this.nome +"\n";

        resp += this.curso.getNome_curso();
        resp += "Mensalidade: R$ " + this.mensalidade_curso + "\n";
        resp += this.curso.getDados();
        return resp;
    }

}
