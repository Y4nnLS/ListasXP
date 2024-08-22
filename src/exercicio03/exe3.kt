package exercicio03

import exercicio03.objeto.Aluno

fun main() {
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