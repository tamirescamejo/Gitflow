package listacompras

import util.MSG_FORMATO_INVÁLIDO
import util.MSG_NUM_NEGATIVO
import util.MSG_VALOR_VAZIO

class ListaCompras {
    companion object {
        fun informarQuantidadeVerduraGrao(alimento: String):Double{
            println("Informe a quantidade de $alimento em gramas: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                throw UnsupportedOperationException(MSG_VALOR_VAZIO)
            }
            var gramas = 0.0
            try {
                gramas = input.toDouble()
                if (gramas < 0.0) {
                    println(MSG_NUM_NEGATIVO)
                    informarQuantidadeVerduraGrao(alimento)
                }
            } catch (exception: NumberFormatException) {
                println(MSG_FORMATO_INVÁLIDO )
            }
            return gramas
        }

        fun informarNomeAlimento(alimento: String): String {
            println("Informe o tipo $alimento a ser adicionado na lista: ")
            val nome = readln()

            if (nome.isEmpty() || nome.isBlank()) {
                throw UnsupportedOperationException(MSG_VALOR_VAZIO)
            }
            return nome
        }
        fun informarQuantidadeLegumeOutros(alimento: String):Int{
            println("Informe a quantidade de $alimento em unidades: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }
            var unidades = 0
            try {
                unidades = input.toInt()
                if (unidades < 0) {
                    println(MSG_NUM_NEGATIVO)
                    informarQuantidadeVerduraGrao(alimento)
                }
            } catch (exception: NumberFormatException) {
                println(MSG_FORMATO_INVÁLIDO )
            }
            return unidades
        }
    }
}