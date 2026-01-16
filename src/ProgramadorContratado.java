public class ProgramadorContratado {
    // Desafio 1
//    Crie um programa que leia se o aluno estudou bancos de dados, Spring, APIs REST e
//    se fez projetos usando arquitetura de Microsserviços.
//    Se estudou tudo (true para todas as perguntas), mostrar mensagem dizendo que
//    consegue vaga.
//    Caso contrário, mostrar mensagem dizendo que ainda não consegue.


    public static void main(String[] args) {
        boolean bancoDeDados = true;
        boolean estudouSpring = true;
        boolean estudouApisRest = true;
        boolean fezProjetosArquiteturaMicro = false;

        if(bancoDeDados && estudouSpring && estudouApisRest && fezProjetosArquiteturaMicro) {
            System.out.println("Você consegue uma vaga!");
        } else {
            System.out.println("Você ainda não consegue uma vaga!");
        }

    }
}
