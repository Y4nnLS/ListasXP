package exercicio08.objeto

class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo:Int) {

    fun verificaEstoque(){
        if (quantidade < nivelMinimo){
            println("$nome está abaixo do nível mínimo. Repondo o estoque...")
            reporEstoque()
        } else {
            println("$nome com estoque suficiente")
        }
    }

    private fun reporEstoque() {
        quantidade = nivelMaximo
        println("Estoque de $nome foi reposto.")
        println("nome: '$nome' | quantidade: $quantidade | nível mínimo: $nivelMinimo | nível máximo: $nivelMaximo)\n")
    }

    override fun toString(): String {
        return "nome: '$nome' | quantidade: $quantidade | nível mínimo: $nivelMinimo | nível máximo: $nivelMaximo)\n"
    }
}