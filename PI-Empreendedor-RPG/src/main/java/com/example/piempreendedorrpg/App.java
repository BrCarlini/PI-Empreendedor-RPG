package com.example.piempreendedorrpg;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        menu();



    }




    public static void menu(){
        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("------ MENU DO JOGO ------");
        System.out.println("1.: Instruções ");
        System.out.println("2.: Jogar ");
        System.out.println("3.: Créditos ");
        System.out.println("4.: Sair ");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                //System.out.println(" Instruções do JOGO ");
                instrucao();
                break;


            case 2:
                jogar();
                break;

            case 3:
                creditos();
                break;

            case 4:
                System.out.println(" Saindo ");
                break;

            default:
                System.out.println("Opção Inválida! ");
                break;

        }
    }


    public static void instrucao(){
        Scanner entrada = new Scanner(System.in);

        int opcao;



        System.out.print("""
                ===========================================  Instruções  ===========================================\n
                1- Você é um jovem empreendedor e seu objetivo é levar sua empresa de garagem ao topo do mundo dos negócios.\n
                2- Escolha sabiamente as decisões da jornada, cada caminho tomado tornara desafios distintos e cheios de aventura.\n
                3- O jogo funciona com um sistema de pontuação, cada desafio superado acarretará numa soma que ao final,
                 ranqueará sua posição no rank de empresas bem-sucedidas no mundo\n
                4- A cada 2 perguntas, seu personagem passará para uma escolha de progresso randômico, podendo encarar
                 “Bosses” visuais com desafios mais difíceis que a media do jogo (caso o Boss não seja derrotado, 
                 você sofrera uma penalização de pontos por uma rodada, caso seja derrotado, um acréscimo de pontuação\n.\s
                - Divirta se
                ====================================================================================================\n\n""");

        System.out.print("Deseja retornar ao Menu[1] ou Sair[2] ? ");
        opcao = entrada.nextInt();

        if(opcao == 1){
            menu();
        }else {
            System.out.print("Saindo do programa");
        }

    }


    public static void creditos(){

        Scanner entrada = new Scanner(System.in);

        int opcao;



        System.out.println("------------ Créditos ------------");
        System.out.println("CENTRO UNIVERSITÁRIO SENAC\n" +
                "Materia: Projeto Integrador I - Desenvolvimento de Lógica\n" +
                "Professor: Eduardo Takeo Ueda\n" +
                "==========================================\n"+
                "Projeto: Empreendedor RPG\n" +
                "Devs: Bruno Carlini, Gabriel Oliveira dos Santos, João Victor Baldusco, Lucas Andrade de Sousa.\n");


        System.out.print("Deseja retornar ao Menu[1] ou Sair[2] ? ");
        opcao = entrada.nextInt();

        if(opcao == 1){
            menu();
        }else {
            System.out.print("Saindo do programa");
        }

    }



    public static void jogar(){
        Scanner entrada = new Scanner(System.in);
        String respostaUsuario;
        int pontos = 1;

        String perguntas [] = {
                "Capital do Brasil ?",
                "Palmeiras tem mundial ?"
        };

        String respostas [] = {
                "b",
                "a"
        };

        String opcoes[] = {
                        "a) São Paulo\n" +
                        "b) Brasilia\n" +
                        "c) Rio de Janeiro\n",

                        "a) Não\n" +
                        "b) Sim\n",

        };


        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            System.out.println(opcoes[i]);

            System.out.print("Sua resposta: ");
            respostaUsuario = entrada.next();

            if(respostaUsuario.equalsIgnoreCase(respostas[i])){
                System.out.println("Resposta correta!!!");
                pontos++;
                System.out.println("Pontuação atual: " + pontos);
                System.out.println("=============== // ===============");
            }else{
                System.out.println("Resposta errada!!!");
                //System.out.println("Resposta correta era: " + respostas[i]);
                pontos--;
            }

            if(pontos <= 0 ){
                System.out.println("GAME OVER");
                break;
            }
        }




    }

}

