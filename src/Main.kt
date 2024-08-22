import objetos.Aluno
import objetos.Produto
import objetos.Voo

fun main() {
    while (true) {
        print("\nSelecione um exercício de 1 a 8 (digite 0 para finalizar o programa): ")
        val exe: Int = readln().toInt()
        when (exe) {
            1 -> exe1()
            2 -> exe2()
            3 -> exe3()
            4 -> exe4()
            5 -> exe5()
            6 -> exe6()
            7 -> exe7()
            8 -> exe8()
            0 -> {
                println("Finalizando o programa...")
                break
            }

            else -> println("Opção inválida...")
        }
    }
}

fun exe1() {
//    Exercício 1: Verificação de Números Primos (5 XP)
//    Contexto: Carlos está criando uma ferramenta matemática para verificar se um número é
//    primo. Ele gostaria de automatizar essa tarefa para números fornecidos por usuários.
//    Instruções: Escreva um programa que leia um número inteiro e determine se ele é primo
//    ou não. O programa deve exibir uma mensagem indicando se o número é primo.
    print("Digite um número inteiro: ")
    val num: Int = readln().toInt()
    var primo = true
    if (num == 0 || num == 1) {
        println("exceção")
        return
    }
    for (i in 2..num - 1) {
        if (num % i == 0) {
            primo = false
            break
        }
    }
    println(if (primo) "$num é um número primo" else "$num não é um número primo")
    return
}

fun exe2() {
//    Exercício 2: Contagem de Palavras em um Texto (5 XP)
//    Contexto: Ana é uma escritora que deseja contar quantas palavras há em um parágrafo
//    do seu livro. Ela precisa de uma ferramenta simples que faça essa contagem
//    automaticamente.
//    Instruções: Escreva um programa que leia um parágrafo de texto e conte o número de
//    palavras nele. Exiba a contagem total de palavras.
    println("Digite um parágrao de texto: ")
    val paragrafo: String = readlnOrNull() ?: ""
    println(paragrafo.split(Regex("\\s+")).count())
    return
}

fun exe3() {
//    Exercício 3: Gerenciamento de Notas dos Alunos (10 XP)
//    Contexto: João é professor e precisa criar um sistema para calcular as médias das notas
//    dos alunos. Ele deseja automatizar o processo de cálculo das médias e determinar se os
//            alunos foram aprovados.
//    Instruções: Crie uma classe Aluno com propriedades nome e notas (um array de notas).
//    Em seguida, escreva um programa que permita ao usuário cadastrar 5 alunos e calcular a
//    média das notas de cada um. O programa deve exibir o nome do aluno, a média das
//    notas, e se ele foi aprovado (média >= 7.0).
    val alunos = mutableListOf<Aluno>()
    for (i in 1..5) {
        print("Digite o nome do aluno $i: ")
        val nome = readln()

        println("Digite as notas do aluno $i (separadas por espaço):")
        val notas = readln().split(" ").map { it.toDouble() }.toDoubleArray()

        alunos.add(Aluno(nome, notas))
    }
    for (aluno in alunos) {
        val media = aluno.media()
        val passou = if (aluno.aprovado()) "aprovado" else "reprovado"
        println("O aluno ${aluno.nome} foi $passou.\nMédia: ${"%.2f".format(media)}")
    }
    return
}

fun exe4() {
//    Exercício 4: Ordenação de Nomes de Alunos (10 XP)
//    Contexto: Maria é coordenadora de uma turma e deseja criar uma lista de alunos em
//    ordem alfabética. Ela quer que o programa exiba a lista organizada de maneira intuitiva.
//    Instruções: Escreva um programa que leia os nomes de 10 alunos e os armazene em um
//    array. Em seguida, ordene os nomes em ordem alfabética e exiba a lista organizada.
    val nomes = ArrayList<String>()
    for (i in 1..10) {
        print("Digite o nome $i: ")
        val nome = readln()
        nomes.add(nome)
    }
    nomes.sort()
    nomes.forEach { println(it) }
    return
}

fun exe5() {
//    Exercício 5: Simulação de Jogo de Dados (10 XP)
//    Contexto: Pedro está desenvolvendo um jogo simples de dados para uma feira de
//    ciências. Ele quer simular o lançamento de dois dados e calcular a soma dos valores.
//    Instruções: Crie um programa que simule o lançamento de dois dados (números
//    aleatórios de 1 a 6) e exiba a soma dos valores obtidos. O programa deve permitir que o
//    usuário escolha quantas vezes deseja lançar os dados e exibir as somas de cada
//    lançamento.
    print("Quantas vezes você deseja lançar os dados? ")
    val vezes = readln().toIntOrNull() ?: 1
    for (i in 1..vezes) {
        val dado1: Int = (1..6).random()
        val dado2: Int = (1..6).random()
        val soma: Int = dado1 + dado2
        println("Lançamento $i:\nDado1: $dado1\nDado2: $dado2\nSoma = $soma\n")
    }
    return
}

fun exe6() {
//    Exercício 6: Análise de Dados Meteorológicos (10 XP)
//    Contexto: Julia está trabalhando em um projeto de análise de dados meteorológicos e
//    precisa calcular a temperatura média, máxima e mínima de um mês. Ela quer que o
//    programa também exiba os dias em que essas temperaturas ocorreram.
//    Instruções: Escreva um programa que leia as temperaturas diárias de um mês (30 dias) e
//    as armazene em um array. Em seguida, calcule a temperatura média, a máxima e a
//    mínima, e exiba essas informações junto com os dias em que ocorreram as temperaturas
//    máxima e mínima.
    val dadosMetereologicos = DoubleArray(30)
    for (i in dadosMetereologicos.indices) {
        print("Temperatura do dia ${i + 1}:")
        dadosMetereologicos[i] = readln().toDoubleOrNull() ?: 0.0
    }
    val auxlista = dadosMetereologicos.toList()
    val tempMax = dadosMetereologicos.maxOrNull()
    val diaMax = auxlista.indexOf(tempMax) + 1
    val tempMin = dadosMetereologicos.minOrNull()
    val diaMin = auxlista.indexOf(tempMin) + 1
    val media = dadosMetereologicos.average()
    println("Média de temperatura: %.2f".format(media))
    println("Temperatura máxima: ${"%.2f".format(tempMax)} | Dia $diaMax")
    println("Temperatura mínima: ${"%.2f".format(tempMin)} | Dia $diaMin")

    return
}

fun exe7() {
//    Exercício 7: Sistema de Reserva de Passagens Aéreas (15 XP)
//    Contexto: Lucas está desenvolvendo um sistema de reservas para uma companhia
//    aérea. Ele deseja criar um programa que permita aos usuários verificar a disponibilidade
//            de assentos e reservar uma passagem.
//    Instruções: Implemente uma classe Voo com propriedades numeroDoVoo,
//    assentosDisponiveis (um array de inteiros), e reservarAssento(assento: Int): Boolean.
//    Escreva um programa que permita ao usuário verificar a disponibilidade de um assento
//    específico em um voo e reservar o assento se ele estiver disponível.

        val voo = Voo("0000", IntArray(10) { it + 1 })
    while (true) {
        if (voo.disponiveis().isEmpty()) {
            println("Não há mais assentos disponíveis.")
            break
        }
        println("Assentos disponíveis: ${voo.disponiveis()}")

        print("Digite o número do assento para reserva(-1 para sair): ")
        val assento = readln().toInt()
        if (assento == -1) break

        if (voo.verifDisponibilidade(assento)) {
            if (voo.reservarAssento(assento)) {
                println("Assento $assento reservado!")
            } else {
                println("Assento $assento não foi reservado!")
            }
        } else {
            println("assento $assento não disponível.")
        }
    }
}

fun exe8() {
//    Exercício 8: Sistema de Gestão de Estoque com Reposição Automática (15 XP)
//    Contexto: Mariana é gerente de um armazém e deseja implementar um sistema para
//    gerenciar o estoque de produtos. Ela quer que o sistema verifique se a quantidade de um
//    produto está abaixo do nível mínimo e, se estiver, acione uma reposição automática.
//    Instruções: Crie uma classe Produto com propriedades nome, quantidade, nivelMinimo,
//    e reporEstoque(). Em seguida, escreva um programa que permita cadastrar 5 produtos e
//    verificar a quantidade disponível. Se a quantidade de um produto estiver abaixo do nível
//    mínimo, a função reporEstoque() deve ser chamada para repor o estoque (aumentando a
//    quantidade para o nível máximo).
    val produtos = mutableListOf<Produto>()
    for (i in 1..5) {
        print("Digite o nome do produto $i: ")
        val nome = readln()
        println("Digite a quantidade de $nome em estoque: ")
        val quantidade = readln().toInt()
        println("Digite o nível mínimo de $nome em estoque: ")
        val nivelMinimo = readln().toInt()
        println("Digite o nível máximo de $nome em estoque: ")
        val nivelMaximo = readln().toInt()

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }
    for (produto in produtos){
        println(produto)
        produto.verificaEstoque()

    }
}