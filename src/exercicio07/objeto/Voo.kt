package exercicio07.objeto

class Voo(val numeroDoVoo:String, val assentosDisponiveis:IntArray){
    fun verifDisponibilidade(assento: Int):Boolean{
        return assento in assentosDisponiveis
    }
    fun reservarAssento(assento: Int):Boolean{
        val index = assentosDisponiveis.indexOf(assento)
        return if(index != -1 && assentosDisponiveis[index] != -1){
            assentosDisponiveis[index] = -1
            true
        } else{
            false
        }
    }
    fun disponiveis(): String {
        val assentos = assentosDisponiveis.filter { it != -1 }
        return assentos.joinToString(", ")
    }
}