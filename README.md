🤖 Chatbot AI em Java

Este projeto é um Chatbot em Java utilizando integração com modelos de linguagem, desenvolvido para fins de estudo, testes e demonstração de habilidades em Java, Maven e consumo de APIs de IA.

O objetivo é apresentar um sistema capaz de enviar prompts a um modelo de linguagem e retornar respostas de forma simples e extensível.


---

🚀 Tecnologias Utilizadas

Java 21

Maven (gerenciamento de dependências)

VSCode como IDE

Integração com APIs de IA (Hugging Face / modelos externos)



---

📁 Estrutura do Projeto

chatbot-ai-java
│
├── pom.xml              # Configuração do Maven
├── target/              # Arquivos gerados após o build
│
└── src/
    ├── main/
    │   └── java/com/chatbot/
    │       ├── App.java        # Classe principal
    │       └── HFClient.java   # Cliente que chama o modelo de IA
    │
    └── test/
        └── java/com/chatbot/   # Testes automatizados

---

⚡ Como Executar

1️⃣ Clone este repositório

git clone https://github.com/SeneDaviSilva/chatbot-ai-java

2️⃣ Entre na pasta do projeto

cd chatbot-ai-java

3️⃣ Compile e baixe as dependências

mvn clean install

4️⃣ Execute o projeto

mvn exec:java

> Certifique-se de que o Java 21 está instalado na sua máquina.




---

🧠 Como o Chatbot Funciona

O usuário envia um texto (prompt)

A classe HFClient faz a requisição para o modelo de IA

O modelo processa a entrada e devolve uma resposta

A classe App.java exibe o resultado no console



---

✨ Melhorias Futuras

Interface gráfica simples (JavaFX)

Logs estruturados

Cache de respostas

Suporte a múltiplos modelos

Endpoint REST usando Spring Boot



---

📬 Contato

Se quiser saber mais, fique à vontade para entrar em contato:

Davi Sene
🔗 GitHub: https://github.com/SeneDaviSilva