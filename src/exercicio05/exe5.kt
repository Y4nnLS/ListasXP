package exercicio05

fun main() {
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