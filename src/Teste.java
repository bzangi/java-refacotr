import java.util.ArrayList;

public class Teste {
    public static void main (String args[])
    {
        Aluno aluno1 = new AlunoBolsista("Martin Fowler",
                11223344,
                920.50,
                20.5,
                new Curso("ADS",
                "Graduação",
                false)
                );

        ArrayList<String> avaliadores = new ArrayList<>();
        avaliadores.add("Grady Booch");
        avaliadores.add("Erich Gamma");
        DadosTrabalho dados2 = new DadosTrabalhoMestrado("Impacto da Refatoração","Peter Coad", avaliadores);
        Aluno aluno2 = new Aluno("Kent Beck",
                22334455,
                2150.45,
                0,
                new CursoFinalizado(
                "Computação Aplicada",
                "Mestrado",
                true,
                2019,
                dados2
                )
                );
        DadosTrabalho dados3 = new DadosTrabalhoGraduacao("Refatoraćão com Java", "Giuseppe Matteoni", 10f);
        Aluno aluno3 = new Aluno("Bruno Zangi",
                22334455,
                2150.45,
                0,
                new CursoFinalizado(
                        "Ciência da Computaćão",
                        "Graduaćão",
                        true,
                        2020,
                        dados3
                ));
        avaliadores.add("Jotabe");
        avaliadores.add("Eriquinho");
        DadosTrabalho dados4 = new DadosTrabalhoDoutorado("Trabalho simples", "Sem orientador", avaliadores);
        Aluno aluno4 = new AlunoBolsista("José Santos", 34565399, 2150.45, 15.8,
                new CursoFinalizado("Computaćão", "Doutorado", true, 2021, dados4));
        System.out.println(aluno1.getDados());
        System.out.println(aluno2.getDados());
        System.out.println(aluno3.getDados());
        System.out.println(aluno4.getDados());
    }
}
