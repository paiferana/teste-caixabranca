# Projeto de Testes e Análise de Código em Java

Este repositório contém o código fonte e os documentos relacionados ao **teste estático de código**, **análise de complexidade ciclomática**, e **documentação JavaDoc** de um projeto de autenticação de usuários em Java. Durante o desenvolvimento deste projeto, foram aplicados testes de caixa branca, análise de erros no código e a geração de documentação detalhada.

## Estrutura do Repositório

- **src/**: Contém o código fonte da aplicação.
  - **login/User.java**: Implementação da classe `User`, responsável pela conexão com o banco de dados e realização da autenticação do usuário.
- **docs/**: Contém a documentação gerada (JavaDoc).
  - **index.html**: Documentação manual da classe `User` gerada com o padrão JavaDoc.
- **PLANO DE TESTE.xls**: Formulário utilizado para o preenchimento de testes estáticos, documentando os erros encontrados e as ações para corrigi-los.
- **README.md**: Este arquivo, que documenta o projeto e suas etapas de desenvolvimento.

## O que foi realizado

### **1. Teste de Caixa Branca**
Foi realizada uma análise estática do código para identificar possíveis erros, como problemas de segurança e ineficiência. Foi preenchido um **formulário de Teste Estático** para registrar os erros encontrados e ações corretivas.

### **2. Análise de Complexidade Ciclomática**
A complexidade ciclomática do código foi calculada para determinar a complexidade dos fluxos lógicos. A quantidade de caminhos possíveis foi identificada e documentada, e cada uma das sequências foi detalhada.

### **3. Geração de JavaDoc**
A documentação do código foi gerada utilizando o padrão **JavaDoc**, fornecendo informações detalhadas sobre a classe `User`, seus métodos e variáveis. A documentação gerada foi adicionada manualmente e pode ser visualizada no arquivo `docs/index.html`.

### **4. Testes Estáticos**
Um formulário de **Testes Estáticos** foi preenchido para identificar áreas do código que poderiam ser otimizadas. A análise de erros e os resultados dos testes estão documentados no arquivo **PLANO DE TESTE.xls**.

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/paiferana/teste-caixabranca.git
