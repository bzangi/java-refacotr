public class Curso {
    protected String nome_curso, nivel_curso;
    protected boolean tem_trabalho, curso_finalizado;
    public Curso(String nome_curso, String nivel_curso, boolean tem_trabalho) {
        this.curso_finalizado = false;
        this.nome_curso = nome_curso;
        this.nivel_curso = nivel_curso;
        this.tem_trabalho = tem_trabalho;
    }

    public String getNome_curso() {
        return "Curso: " + this.nivel_curso + " em " + this.nome_curso +"\n";
    }

    public String getDados(){return "\n" ;}
}
