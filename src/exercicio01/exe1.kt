package exercicio01

fun main() {
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