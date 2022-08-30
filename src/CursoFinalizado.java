public class CursoFinalizado extends Curso {

    protected int ano_finalizacao;
    protected DadosTrabalho dados;
    public CursoFinalizado(String nome_curso, String nivel_curso,
                           boolean tem_trabalho, int ano_finalizacao, DadosTrabalho dados)
    {
        super(nome_curso,nivel_curso, tem_trabalho);
        this.curso_finalizado = true;
        this.ano_finalizacao = ano_finalizacao;
        this.dados = dados;
    }

    @Override
    public String getDados()
    {
        String resp = "Curso finalizado em " + ano_finalizacao + "\n";
        if (this.tem_trabalho)
        {
            resp += dados.getDados() + "\n";
        }
        return resp;
    }
}