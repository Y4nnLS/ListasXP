package exercicio07

import exercicio07.objeto.Voo

fun main() {
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