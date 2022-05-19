package listacompras

class ListaCompras {
    companion object {
        fun informarQuantidadeVerduraGrao(alimento: String):Double{
            var gramas = 0.0
            try {
                print("\nInforme a quantidade de $alimento em gramas: ")
                val input = readln()
                if (input.isEmpty() || input.isBlank()) {
                    throw UnsupportedOperationException("\nNão é permitido inserir valor vazio")
                }
                gramas = input.toDouble()
                if (gramas < 0.0) {
                    println("\nNão é permitido números negativos, tente novamente")
                    informarQuantidadeVerduraGrao(alimento)
                }
            } catch (exception: NumberFormatException) {
                println("\nNão é permitido texto, somente número")
                informarQuantidadeVerduraGrao(alimento)
            } catch (e:UnsupportedOperationException){
                println(e.message)
                informarQuantidadeVerduraGrao(alimento)
            }
            return gramas
        }

        fun informarNomeAlimento(alimento: String): String {
            var nome = ""
            try {
                print("Informe o tipo $alimento a ser adicionado na lista: ")
                val nome = readln()

                if (nome.isEmpty() || nome.isBlank()) {
                    throw UnsupportedOperationException("\nNão é permitido inserir valor vazio")
                }
            }catch(e:Exception){println(e.message);informarNomeAlimento(alimento)}
            return nome
        }

        fun informarQuantidadeLegumeOutros(alimento: String):Int{
            var unidades = 0
            try {
                print("Informe a quantidade de $alimento em unidades: ")
                val input = readln()
                if (input.isEmpty() || input.isBlank()) {
                    throw UnsupportedOperationException("\nNão é permitido inserir valor vazio")
                }
                unidades = input.toInt()
                if (unidades < 0) {
                    println("\nNão é permitido números negativos, tente novamente")
                    informarQuantidadeLegumeOutros(alimento)
                }
            } catch (exception: NumberFormatException) {
                println("Não é permitido texto, somente número")
                informarQuantidadeLegumeOutros(alimento)
            } catch (e:UnsupportedOperationException){
                println(e.message)
                informarQuantidadeLegumeOutros(alimento)
            }
            return unidades
        }
    }
}