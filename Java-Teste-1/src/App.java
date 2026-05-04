public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Pessoa pessoa1 = new Pessoa(14877, "Luis", "Santos", 2003, 04, 31);
        Pessoa pessoa2 = new Pessoa(14833, "Dinis", "Moreira", 1959, 10, 28);
        Familia familia01 = new Familia(pessoa1, "Mae", pessoa2);
        
        System.out.println("\nNome completo pessoa 1: " + pessoa1.getNomeCompleto());
        System.out.println("Idade pessoa 1: " + pessoa1.getIdade());
        System.out.println("\nNome completo pessoa 2: " + pessoa2.getNomeCompleto());
        System.out.println("Idade pessoa 2: " + pessoa2.getIdade());
        System.out.println("\nInfo do Encarregado de Educacao: " + familia01.getInfoEncEducacao());
        System.out.println("\nInfo do Encarregado de Educacao: " + familia01.getInfoFamilia());

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(familia01.toString());
    }

}
       /* String aux = prof1.getNomeCompleto();
        System.out.println("Informação do Professor: \n" + aux);

        aux = turma1.getInfoTurma();
        System.out.println("\n\n" + aux);

        System.out.println("\n\n Informação do Aluno1");
        System.out.println("\n Nome: " + aluno1.getNomeCompleto());
        System.out.println("\n Idade: " + aluno1.getIdade());

        System.out.println("\n\n Informação do Aluno2");
        System.out.println("\n Nome: " + aluno2.getNomeCompleto());
        System.out.println("\n Idade: " + aluno2.getIdade());

        System.out.println("\n\n Informação do Aluno3");
        System.out.println("\n Nome: " + aluno3.getNomeCompleto());*/
    

