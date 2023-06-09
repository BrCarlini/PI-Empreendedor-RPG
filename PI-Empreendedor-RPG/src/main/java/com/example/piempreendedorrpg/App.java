package com.example.piempreendedorrpg;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //String retornoDaFuncaoClassificacao = classificacao(10).getClass().getSimpleName();
        //testa_classificacao(retornoDaFuncaoClassificacao);

        menu();

    }


    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        String opcao = "";

        if(!Objects.equals(opcao, "4")){

            while(true){

                System.out.println("------ MENU DO JOGO ------");
                System.out.println("1.: Instruções ");
                System.out.println("2.: Jogar ");
                System.out.println("3.: Créditos ");
                System.out.println("4.: Sair ");
                System.out.print("Escolha uma opção: ");
                opcao = entrada.next();

                switch (opcao) {
                    case "1":
                        instrucao();
                        break;

                    case "2":
                        jogar();
                        break;

                    case "3":
                        creditos();
                        break;

                    case "4":
                        System.out.println("Encerrando o Jogo");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção Inválida! ");
                        break;

                }

            }

        }


    }


    public static void decisaoDeEncerramentoDoPrograma(){
        Scanner entrada = new Scanner(System.in);
        String opcao = "";

        while (true){
            System.out.print("Deseja retornar ao Menu[1] ou Sair[2] ? ");
            opcao = entrada.next();

            if(Objects.equals(opcao, "1")){
                menu();
                break;
            }else if(Objects.equals(opcao, "2")) {
                System.out.println("Encerrando o Jogo");
                System.exit(0);
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }

    }


    public static void instrucao(){

        System.out.print("""
                ===========================================  Instruções  ===========================================\n
                1- Você é um jovem empreendedor e seu objetivo é levar sua empresa de garagem ao topo do mundo dos negócios.\n
                2- Escolha sabiamente as decisões da jornada, cada caminho tomado tornara desafios distintos e cheios de aventura.\n
                3- O jogo funciona com um sistema de pontuação, cada desafio superado acarretará numa soma que ao final,
                 ranqueará sua posição no rank de empresas bem-sucedidas no mundo\n
                - Divirta se
                ====================================================================================================\n\n""");

        decisaoDeEncerramentoDoPrograma();

    }


    public static void creditos(){

        System.out.println("=============================================================================");
        System.out.println("================================== Créditos =================================");
        System.out.println("=============================================================================\n");
        System.out.println("CENTRO UNIVERSITÁRIO SENAC\n" +
                "Materia: Projeto Integrador I - Desenvolvimento de Lógica\n" +
                "Professor: Eduardo Takeo Ueda\n" +
                "==========================================\n"+
                "Projeto: Empreendedor RPG\n" +
                "Devs: Bruno Carlini, Gabriel Oliveira dos Santos, João Victor Baldusco, Lucas Andrade de Sousa.\n");

        decisaoDeEncerramentoDoPrograma();

    }

    public static void executaPerguntas(String[]perguntas, String[]respostas, String[]opcoes, int pontos){

        Scanner entrada = new Scanner(System.in);
        String respostaUsuario;


        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            System.out.println(opcoes[i]);

            System.out.print("Sua resposta: ");
            respostaUsuario = entrada.next();
            System.out.println("================================ // ================================");

            if(respostaUsuario.equalsIgnoreCase(respostas[i])){
                pontos++;

            }
        }

        System.out.println(classificacao(pontos));


    }



    public static void jogar(){
        int pontos = 0;
        Scanner entrada = new Scanner(System.in);
        String admEscolhida;

        // Arrays para Opção Adm Classica
        String[] perguntasAdmClassica = {
                "1 - Dentre sua escolha, qual a melhor forma de organização pra sua empresa ?",
                "2 - Dentre a sua filosofia, qual o objetivo de sua empresa ?",
                "3 - Quais são as funções basicas da sua filosofia ?",
                "4 - Qual o conceito de divisão de trabalho proposto na sua companhia ?",
                "5 - Quanto a autoridade, quais são os principios ?",
                "6 - Qual é a abordagem de sua administração em relação à motivação dos funcionários ?",
                "7 - Segundo sua filosofia, qual é a melhor forma de liderar uma organização ?",
                "8 - Quais são as características da sua filosofia ?",
                "9 - Qual é o princípio da administração clássica que se refere à ordem e organização dos recursos ?",
                "10 - Qual é o princípio da administração clássica que se refere à equidade e justiça no tratamento dos funcionários ?"
        };

        String[] respostasAdmClassica = {
                "b",
                "c",
                "a",
                "b",
                "a",
                "d",
                "a",
                "a",
                "c",
                "d"
        };

        String[] opcoesAdmClassica = {
                        "a)Organização em equipes autônomas\n" +
                        "b)Estrutura hierárquica\n" +
                        "c)Organização em rede\n" +
                        "d)Estrutura Matrical ",

                        "a)Maxima de lucros\n" +
                        "b)Aumento de satisfação dos colaboradores\n" +
                        "c)eficiencia operacional\n" +
                        "d)Desenvolvimento de novos serviços",

                        "a) Planejamento, organização, direção, controle\n" +
                        "b) Marketing, finanças, recursos humanos, produção\n" +
                        "c) Criatividade, adaptabilidade, colaboração, inovação\n" +
                        "d) Avaliação, análise, implementação, monitoramento",

                        "a) Distribuição equitativa das tarefas entre os funcionários\n" +
                        "b) Especialização e fragmentação das tarefas para aumentar a eficiência\n" +
                        "c) Rotação de funções para estimular o desenvolvimento dos funcionários\n" +
                        "d) Participação ativa dos funcionários na definição das tarefas",

                        "a) Unidade de comando e centralização\n" +
                        "b) Especialização do trabalho e disciplina\n" +
                        "c) Hierarquia e ordem\n" +
                        "d) Equidade e estabilidade",

                        "a) Teoria das necessidades\n" +
                        "b) Teoria do reforço\n" +
                        "c) Teoria do equilíbrio\n" +
                        "d) Teoria do incentivo financeiro",

                        "a) Liderança autocrática\n" +
                        "b) Liderança democrática\n" +
                        "c) Liderança situacional\n" +
                        "d) Liderança transformacional",

                        "a) Ênfase na hierarquia, divisão do trabalho e centralização\n" +
                        "b) Ênfase na inovação, flexibilidade e colaboração\n" +
                        "c) Ênfase na participação, autonomia e descentralização\n" +
                        "d) Ênfase na diversidade, sustentabilidade e responsabilidade social",

                        "a) Unidade de comando\n" +
                        "b) Centralização\n" +
                        "c) Disciplina\n" +
                        "d) Hierarquia ",

                        "a) Unidade de comando\n" +
                        "b) Centralização\n" +
                        "c) Disciplina\n" +
                        "d) Equidade"

        };

        // Arrays para Opção Adm Cientifica
        String[] perguntasAdmCientifica = {
                "1 - Qual é o principal objetivo da administração científica ?",
                "2 - Qual é o foco central da sua filosofia ?",
                "3 - Qual é o conceito central da administração científica ?",
                "4 - Qual é o conceito de \"soldiering\" na administração científica ?",
                "5 - Quais são os benefícios da administração científica ?",
                "6 - Quais são as críticas à administração científica ?",
                "7 - Qual é a abordagem da administração científica em relação à motivação dos funcionários ?",
                "8 - O que é o \"soldo diferencial\" proposto por Frederick Taylor na administração científica ?",
                "9 - O que é a \"tarefa de um minuto\" na administração científica ?",
                "10 - Qual é o princípio da administração clássica que se refere à ordem e organização dos recursos ?"
        };

        String[] respostasAdmCientifica = {
                "c",
                "a",
                "c",
                "c",
                "c",
                "a",
                "d",
                "a",
                "c",
                "d"
        };

        String[] opcoesAdmCientifica = {
                        "a) Maximizar os lucros\n" +
                        "b) Aumentar a satisfação dos funcionários\n" +
                        "c) Alcançar a eficiência operacional\n" +
                        "d) Desenvolver novos produtos",

                        "a) Processos de produção\n" +
                        "b) Relações humanas\n" +
                        "c) Marketing e vendas\n" +
                        "d) Gestão financeira ",

                        "a) Valorização da intuição e experiência dos funcionários \n" +
                        "b) Uso de incentivos financeiros para motivar os funcionários\n" +
                        "c) Desenvolvimento de habilidades interpessoais dos funcionários\n" +
                        "d) Aplicação de métodos científicos para melhorar a eficiência",

                        "a) Prática de incentivar a competição entre os funcionários\n" +
                        "b) Estratégia de delegar tarefas para os trabalhadores mais experientes\n" +
                        "c) Comportamento de ociosidade ou trabalho abaixo do potencial\n" +
                        "d) Método de recompensar os funcionários com promoções rápidas",

                        "a) Maior motivação e satisfação dos funcionários\n" +
                        "b) Melhoria da comunicação interna na empresa\n" +
                        "c) Redução dos custos de produção\n" +
                        "d) Maior flexibilidade e adaptabilidade da empresa",

                        "a) Desconsideração das habilidades e conhecimentos dos trabalhadores\n" +
                        "b) Ênfase excessiva no trabalho em equipe e colaboração\n" +
                        "c) Ausência de controle e supervisão dos funcionários\n" +
                        "d) Dificuldade em implementar métodos científicos na prática",

                        "a) Teoria das necessidades\n" +
                        "b) Teoria do reforço\n" +
                        "c) Teoria do equilíbrio\n" +
                        "d) Teoria do incentivo financeiro",

                        "a) Um sistema de remuneração baseado no mérito e desempenho\n" +
                        "b) Um bônus dado aos funcionários que atingem as metas de produção\n" +
                        "c) Uma forma de incentivar a colaboração entre os departamentos da empresa\n" +
                        "d) Um sistema de benefícios adicionais para os funcionários mais antigos ",

                        "a) Uma tarefa simples que pode ser realizada em apenas um minuto\n" +
                        "b) Uma forma de medir a produtividade dos funcionários\n" +
                        "c) Uma técnica para identificar desperdícios e melhorar a eficiencia",

                        "a) Unidade de comando\n" +
                        "b) Centralização\n" +
                        "c) Disciplina\n" +
                        "d) Hierarquia"

        };

        while(true){
            System.out.print("Qual Administração você escolhe: \na) Administração Clássica\nb) Administração Ciêntifica\n>>> ");
            admEscolhida = entrada.next().toLowerCase();

            if(admEscolhida.equals("a")){
                executaPerguntas(perguntasAdmClassica,respostasAdmClassica, opcoesAdmClassica, pontos);
                break;
            }else if(admEscolhida.equals("b")){
                executaPerguntas(perguntasAdmCientifica,respostasAdmCientifica, opcoesAdmCientifica, pontos);
                break;
            }else{
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("");
        System.out.println("=============================================================================");
        System.out.println("================================ FIM DE JOGO ================================");
        System.out.println("=============================================================================\n\n\n");
        creditos();
    }


    public static String classificacao(int pontos){
        System.out.println("Total de pontos: " + pontos);
        if (pontos >= 9) {

            return """
                    
                    Parabéns Empreendedor, você foi eleito o melhor empresário do ano pela Forbes.
                    ⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠋⠉⠈⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⡏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿
                     ⣿⣿⣿⢏⣴⣿⣷⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿
                     ⣿⣿⣟⣾⣿⡟⠁⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⢢⠀⠀⠀⠀⠀⠀⠀⢸⣿
                     ⣿⣿⣿⣿⣟⠀⡴⠄⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣿
                     ⣿⣿⣿⠟⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢴⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿
                     ⣿⣁⡀⠀⠀⢰⢠⣦⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⡄⠀⣴⣶⣿⡄⣿
                     ⣿⡋⠀⠀⠀⠎⢸⣿⡆⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠗⢘⣿⣟⠛⠿⣼
                    ⣿⣿⠋⢀⡌⢰⣿⡿⢿⡀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣧⢀⣼
                     ⣿⣿⣷⢻⠄⠘⠛⠋⠛⠃⠀⠀⠀⠀⠀⢿⣧⠈⠉⠙⠛⠋⠀⠀⠀⣿⣿⣿⣿⣿
                     ⣿⣿⣧⠀⠈⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⠀⠀⠀⢀⢃⠀⠀⢸⣿⣿⣿⣿
                     ⣿⣿⡿⠀⠴⢗⣠⣤⣴⡶⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡸⠀⣿⣿⣿⣿
                     ⣿⣿⣿⡀⢠⣾⣿⠏⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠀⣿⣿⣿⣿
                     ⣿⣿⣿⣧⠈⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿
                     ⣿⣿⣿⣿⡄⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⣦⣄⣀⣀⣀⣀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠙⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠁⠀⠀⠹⣿⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣿⣿⣿
                     ⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⢻⣿⡇⠀⠀⠀⠀⠀⠀⢀⠈⣿⣿⡿⠉⠛⠛⠛⠉⠉
                     ⣿⡿⠋⠁⠀⠀⢀⣀⣠⡴⣸⣿⣇⡄⠀⠀⠀⠀⢀⡿⠄⠙⠛⠀⣀⣠⣤⣤⠄
                    """;
        } else if (pontos >= 4) {
            return """
                    Muito bem, você recebeu o pato da felicidade, sua empresa não quebrou.
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣉⡥⠶⢶⣿⣿⣿⣿⣷⣆⠉⠛⠿⣿⣿⣿⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⡿⢡⡞⠁⠀⠀⠤⠈⠿⠿⠿⠿⣿⠀⢻⣦⡈⠻⣿⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⡇⠘⡁⠀⢀⣀⣀⣀⣈⣁⣐⡒⠢⢤⡈⠛⢿⡄⠻⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠉⠐⠄⡈⢀⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⠇⢠⣿⣿⣿⣿⡿⢿⣿⣿⣿⠁⢈⣿⡄⠀⢀⣀⠸⣿⣿⣿⣿
                    ⣿⣿⣿⣿⡿⠟⣡⣶⣶⣬⣭⣥⣴⠀⣾⣿⣿⣿⣶⣾⣿⣧⠀⣼⣿⣷⣌⡻⢿⣿
                    ⣿⣿⠟⣋⣴⣾⣿⣿⣿⣿⣿⣿⣿⡇⢿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣿⣿⣿⣷⠄⢻
                    ⡏⠰⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢂⣭⣿⣿⣿⣿⣿⠇⠘⠛⠛⢉⣉⣠⣴⣾
                    ⣿⣷⣦⣬⣍⣉⣉⣛⣛⣉⠉⣤⣶⣾⣿⣿⣿⣿⣿⣿⡿⢰⣿⣿⣿⣿⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡘⣿⣿⣿⣿⣿⣿⣿⣿⡇⣼⣿⣿⣿⣿⣿⣿⣿⣿
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣿⣿⠁⣿⣿⣿⣿⣿⣿⣿⣿⣿""";
        } else {

            return """
                    Poww irmão... Vacilou !
                    ⣿⣿⣿⣿⣿⣿⣿⡿⠛⠥⠖⠈⠩⠭⠭⠉⠉⠠⢤⣬⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⣿⣿⢁⣶⠶⢦⡄⢸⣾⣿⡆⠀⣤⣶⢶⣬⡀⢿⣿⣿⣿⣿⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⣿⡏⠈⠷⠤⠼⢃⣨⣤⣤⣤⡈⠿⢅⣀⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⣿⠇⣶⡶⢠⢾⣿⣿⣿⣿⣿⢻⡄⢰⣶⣶⣶⠘⣿⣿⣿⣿⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⡏⢰⣿⠁⣿⣾⣿⣿⣿⣿⣿⣾⣿⡆⢹⣿⣿⡄⢿⣿⣿⣿⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⡇⢸⡿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠈⣿⣿⡿⠦⢬⣙⠻⣿⣿⣿\r
                    ⣿⣿⣿⣿⣿⣷⡈⣧⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⡿⠁⠀⠀⠈⢷⡌⢿⣿\r
                    ⣿⣿⣿⣿⣿⣿⣷⢸⣧⡙⠿⣿⣿⣿⣿⣿⣿⡿⠟⢠⣿⠇⠀⠀⠀⠀⢸⣿⠘⣿\r
                    ⣿⣿⣿⣿⡿⠟⣋⣄⠻⣄⠀⢨⢙⡛⣩⢭⡤⡀⠀⣸⠏⣰⣆⡀⠀⠀⢸⣿⡆⣿\r
                    ⣿⣿⠟⣉⣤⣾⣿⣿⣷⣌⠑⠶⣦⣤⣥⣴⣶⡾⠟⢁⣼⣿⣿⣿⣶⣄⡀⣿⣧⠹\r
                    ⡿⢡⣾⣿⣿⡟⢛⠻⣿⣿⣷⣤⣄⠉⠉⠉⢁⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣌⠻⡆\r
                    ⣱⣿⣿⣿⡿⢰⣿⣷⣌⡛⠿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄\r
                    ⣿⣿⣿⡟⣰⣿⣿⣿⣿⣿⣷⣦⣤⣭⣉⣭⣭⣭⣤⣤⣶⣆⠻⠿⠿⣿⣿⣿⣿⣿\r
                    ⣿⣿⠟⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⢸⣿⣿⣿⣿""";
        }
    }

    public static void testa_classificacao(String retornoDaFuncao){
        String retornoDaFuncaoClassificacao = classificacao(10).getClass().getSimpleName() ;

        if(retornoDaFuncao.getClass().getSimpleName().equals(retornoDaFuncaoClassificacao)){
            System.out.println("Ok, passou neste teste");
        }else {
            System.out.println("Erro !! O retorno dessa função deve ser do tipo String");
        }
    }


}
