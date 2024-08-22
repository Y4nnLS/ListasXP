package exercicio03.objeto

class Aluno(val nome: String, val notas:DoubleArray){
    fun media(): Double{
        return notas.average()
    }
    fun aprovado() : Boolean{
        return media() >= 7
    }
}