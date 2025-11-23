package com.chatbot;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua API KEY da HuggingFace: ");
        String apiKey = sc.nextLine();

        HFClient ai = new HFClient(apiKey);

        System.out.println("\n🤖 Chatbot IA Iniciado! Digite 'sair' para encerrar.\n");

        while (true) {
            System.out.print("Você: ");
            String msg = sc.nextLine();

            if (msg.equalsIgnoreCase("sair"))
                break;

            String resposta = ai.sendMessage(msg);
            System.out.println("\nIA: " + resposta + "\n");
        }

        sc.close();
        System.out.println("Chat encerrado!");
    }
}
