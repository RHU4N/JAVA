# Estudos em Java

Repositório de exercícios e aulas práticas de Java, reunindo exemplos de lógica de programação, estruturas de controle, vetores, orientação a objetos, interfaces Swing e pequenos sistemas de console.

## Conteúdo por aula

### `120824Aula`

Exercícios introdutórios com entrada de dados e condicionais:

- `CNH.java`: verifica a aprovação em exames psicotécnico, médico e prático;
- `Media.java`: calcula a média de duas notas e informa aprovação, recuperação ou reprovação;
- `Semana.java`: exercício de lógica relacionado aos dias da semana.

### `190824Aula`

Exemplos de repetição, médias e interface gráfica:

- `Laco1.java`: prática com laços;
- `MediaFor.java`: cálculo de média usando `for`;
- `FormLogin.java`: tela Swing de login com credenciais demonstrativas;
- `FormPrincipal.java`: tela principal exibida após o login.

Credenciais do exemplo Swing:

```text
Usuário: admin
Senha: 1234
```

### `260824Aula`

Exercícios de repetição e simulação de eleição:

- `Tabuada.java`: tabuada de um número informado;
- `TabuadaWhile.java`: tabuada com `while`;
- `Horario.java`: exibe horários de `00:00` a `23:59`;
- `Eleicao.java` e `Candidatos.java`: registra votos, votos em branco, total e vencedor.

### `090924Aula`

Exercícios com classes, vetores e ordenação:

- `IMC.java` e `ProgramaImc.java`: cálculo e classificação do IMC;
- `MediaVetor.java`: leitura de oito valores e cálculo da média;
- `Ordenacao.java`: prática de ordenação;
- `ReceberVetores.java`: recebimento e manipulação de vetores.

### `160924Aula`

Exemplo de orientação a objetos com produtos:

- `Produto.java` e `Produto2.java`: nome, preço, quantidade e valor total do estoque;
- `ProgramaProduto.java`: adiciona e remove produtos e exibe o estoque;
- `ProgramaProduto2.java`: variação do exercício.

### `Aula1`

Exercícios básicos de condicionais e média:

- `Condicional.java`: classifica uma pessoa por faixa etária;
- `Media.java`: calcula média e situação do aluno.

### `Aula1NetBeans`

Aplicação Swing de calculadora com operações de soma, subtração, multiplicação e divisão, além de botão para limpar os campos.

## Estrutura do projeto

```text
JAVA/
├── README.md
├── 120824Aula/
├── 190824Aula/
├── 260824Aula/
├── 090924Aula/
├── 160924Aula/
├── Aula1/
└── Aula1NetBeans/
```

Cada diretório de aula contém seu próprio projeto ou conjunto de classes, com arquivos de configuração do Eclipse ou NetBeans quando aplicável.

## Tecnologias e conceitos

- Java;
- Java SE;
- orientação a objetos;
- `Scanner` e `JOptionPane` para entrada de dados;
- arrays e vetores;
- estruturas `if/else`, `for` e `while`;
- classes, atributos, métodos e encapsulamento;
- Java Swing (`JFrame`, `JButton`, `JTextField` e `JOptionPane`);
- NetBeans GUI Builder;
- Eclipse IDE.

## Requisitos

- JDK instalado;
- Eclipse, IntelliJ IDEA ou NetBeans;
- terminal para executar os exemplos de console.

Não há dependências externas obrigatórias.

## Como executar

### Pela IDE

1. Abra a pasta da aula desejada na IDE compatível.
2. Identifique a classe que possui `public static void main(String[] args)`.
3. Execute a classe como uma aplicação Java.
4. Para os exemplos Swing, aguarde a abertura da janela gráfica.

### Pelo terminal

Entre na pasta que contém os arquivos-fonte e compile o exemplo. Por exemplo:

```bash
javac -d out 120824Aula/src/br/edu/fatec/user/java/CNH.java
java -cp out br.edu.fatec.user.java.CNH
```

Para o exercício de produto:

```bash
javac -d out 160924Aula/src/entities/Produto.java 160924Aula/src/application/ProgramaProduto.java
java -cp out application.ProgramaProduto
```

Para executar a calculadora do NetBeans após a compilação:

```bash
java -cp out Calculadora
```

Os caminhos e os nomes completos das classes variam conforme o pacote de cada exercício.

## Observações

- Os exercícios são independentes e podem usar diferentes estruturas de projeto.
- Alguns diretórios foram criados para Eclipse, outros para NetBeans ou IntelliJ.
- Os programas que usam `Scanner` aguardam entrada no terminal.
- Os valores de login em `FormLogin.java` são apenas demonstrativos.
- A calculadora não deve receber divisão por zero.
- Os exemplos têm finalidade didática e podem conter diferentes estilos ou soluções para o mesmo problema.

## Objetivo

Praticar os fundamentos da linguagem Java, evoluindo de algoritmos simples para orientação a objetos e interfaces gráficas.
