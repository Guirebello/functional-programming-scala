## Aula: funções - recursos básicos

Este projeto contém exemplos de programação funcional em Scala, organizados por temas:

- **FunctionDefinition.scala**: Exemplos de definição de funções, parâmetros padrão, funções aninhadas, funções variádicas e testes simples.
- **Filter.scala**: Demonstra filtragem de listas usando predicados (pares, ímpares, maiores que cinco).
- **Map.scala**: Demonstra o uso de `map` para transformar listas (dobro, quadrado).
- **Reduce.scala**: Demonstra agregação de listas com `reduce` (soma, produto), incluindo casos de borda e rastreamento do processo.
- **Lambdas.scala**: Explora expressões lambda, inferência e anotação de tipos, e interfaces de runtime.
- **ForEach.scala**: Demonstra iteração sobre coleções e execução de ações para cada elemento.

Cada arquivo é independente e pode ser executado individualmente usando o comando `sbt "runMain <pacote>.<main>"`.

## Organização dos arquivos

Os arquivos-fonte estão em `src/main/scala/` e seguem a seguinte estrutura:

- Cada tema está em um arquivo separado, com comentários explicativos em formato Javadoc.
- Os exemplos usam funções `@main` para facilitar a execução direta pelo SBT.
- Os nomes dos pacotes (`package`) refletem o tema do arquivo (ex: `package filter`, `package map`).

## Como executar exemplos específicos

Para rodar um exemplo específico, use o comando:

```bash
sbt "runMain <pacote>.<main>"
```

Por exemplo, para rodar o exemplo de filtragem:

```bash
sbt "runMain filter.run"
```

Para rodar o exemplo de lambdas:

```bash
sbt "runMain lambdas.run"
```

---

# Ambiente de desenvolvimento Scala com DevContainer

Este repositório contém um ambiente de desenvolvimento pré-configurado utilizando **DevContainer** para a disciplina de Programação Funcional em Scala.

## O que é um DevContainer?
Um DevContainer é um ambiente de desenvolvimento isolado, baseado em containers, que garante que todos os alunos tenham as mesmas ferramentas e configurações, facilitando o desenvolvimento e evitando problemas de incompatibilidade.

## Ferramentas disponíveis
- **Scala**: Linguagem principal do curso.
- **Metals**: Extensão do VS Code que provê um language server para suporte avançado a Scala (autocompletar, lint, refatoração, etc).
- **SBT**: Ferramenta de build para projetos Scala.

## Como utilizar

### 1. Usando o GitHub Codespaces (recomendado)
O **GitHub Codespaces** permite que você abra este projeto em um ambiente de desenvolvimento completo, direto no navegador, sem precisar instalar nada na sua máquina. Basta clicar no botão **"Code"** no repositório do GitHub e selecionar **"Open with Codespaces"** (ou "Abrir com Codespaces").

- O Codespaces já configura automaticamente o DevContainer.
- Todas as ferramentas estarão prontas para uso.
- Basta abrir o terminal integrado e usar os comandos normalmente (`sbt compile`, `sbt run`, etc).
- **Esta é a forma preferencial de uso, pois elimina problemas de configuração local.**

### 2. Usando Docker e VS Code localmente
Caso prefira rodar localmente:

1. **Pré-requisitos**:
   - Tenha o [Docker](https://www.docker.com/) instalado em sua máquina.
   - Instale o [Visual Studio Code](https://code.visualstudio.com/) e a extensão [Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers).

2. **Abrindo o projeto no DevContainer**:
   - Abra o VS Code na pasta deste projeto.
   - Clique no canto inferior esquerdo (><) e selecione "Reabrir no Container" (ou use o comando `Dev Containers: Reopen in Container`).
   - Aguarde o container ser criado e inicializado.

3. **Utilizando as ferramentas**:
   - O terminal já estará configurado com Scala e SBT.
   - Use o comando `sbt` para compilar, rodar e testar seus programas.
   - A extensão Metals estará ativa, oferecendo recursos como autocompletar, navegação de código e sugestões.

4. **Executando seu código**:
   - No terminal, utilize:
     - `sbt compile` para compilar o projeto.
     - `sbt run` para executar o programa principal.
     - `sbt test` para rodar os testes (se houver).

## Usando o Scala REPL

O **Scala REPL** (Read-Eval-Print Loop) é um interpretador interativo que permite testar pequenos trechos de código Scala rapidamente, sem precisar criar arquivos ou compilar o projeto inteiro.

Para abrir o REPL dentro do DevContainer (no Codespaces ou localmente):

1. Abra o terminal integrado do VS Code.
2. Digite o comando:
   
   ```bash
   scala
   ```
   ou, se preferir usar o SBT console (com dependências do projeto):
   ```bash
   sbt console
   ```
3. Você poderá digitar comandos Scala e ver o resultado imediatamente.

O REPL é útil para experimentar funções, testar expressões e aprender Scala de forma interativa.

## Dicas
- Sempre que atualizar dependências ou arquivos de configuração, reinicie o container para garantir que tudo funcione corretamente.
- Consulte a documentação do [Metals](https://scalameta.org/metals/) e do [SBT](https://www.scala-sbt.org/) para tirar dúvidas sobre as ferramentas.
