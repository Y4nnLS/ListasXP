package exercicio04

fun main() {
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