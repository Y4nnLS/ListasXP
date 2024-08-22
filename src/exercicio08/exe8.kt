package exercicio08

import exercicio08.objeto.Produto

fun main() {
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