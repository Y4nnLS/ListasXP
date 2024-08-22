package exercicio06

fun main() {
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