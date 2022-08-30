public class AlunoBolsista extends Aluno{
    public AlunoBolsista(String nome, int cod_matricula, double mensalidade_curso, double desconto, Curso curso) {
        super();
        this.nome = nome;
        this.cod_matricula = cod_matricula;
        this.mensalidade_curso = mensalidade_curso * (1 - desconto / 100);
        this.desconto = desconto;
        this.e_bolsista = true;
        this.curso = curso;
    }
    @Override
    public String getDados()
    {
        String resp = "Aluno: "+ this.nome +"\n";

        resp += this.curso.getNome_curso();
        resp += "Bolsista com desconto de: " + this.desconto + "%\n";
        resp += "Mensalidade: R$ " + this.mensalidade_curso + "\n";
        resp += this.curso.getDados();
        return resp;
    }
}
