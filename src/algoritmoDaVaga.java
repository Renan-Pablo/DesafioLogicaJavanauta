public class algoritmoDaVaga {
    // Desafio 2
//    Crie um programa com três variáveis booleanas:
//    estudaBem
//    linkedinAtualizado
//    curriculoPronto
//
//    Atribua true ou false para cada uma delas.
//    Calcule a pontuação:
//    Se estudaBem == true → +50
//    Se linkedinAtualizado == true → +25
//    Se curriculoPronto == true → +25
//    Mostre a pontuação final:
//    Se for 70 ou mais, mostrar que o aluno está bem encaminhado para conseguir vaga.
//    Senão, mostrar que precisa se organizar melhor.

    public static void main(String[] args) {
        boolean estudaBem = true;
        boolean linkedinAtualizado = true;
        boolean curriculoPronto = false;

        int pontuacao = 0;
        pontuacao = (estudaBem) ? pontuacao += 50 : pontuacao;
        pontuacao = (linkedinAtualizado) ? pontuacao += 25 : pontuacao;
        pontuacao = (curriculoPronto) ? pontuacao += 25 : pontuacao;

        System.out.println(pontuacao);

        if (pontuacao >= 70) {
            System.out.println("Está bem emcaminado para conseguir uma vaga");
        } else {
            System.out.println("Precisa se organizar melhor");
        }
    }
}
