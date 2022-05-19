package menu

import listacompras.ListaCompras.Companion.informarNomeAlimento
import listacompras.ListaCompras.Companion.informarQuantidadeLegumeOutros
import listacompras.ListaCompras.Companion.informarQuantidadeVerduraGrao
import util.MSG_TIPO_INVÁLIDO
import kotlin.system.exitProcess

class Menu {
    companion object {
        private var listaAlimentos: HashMap<String, Number> = HashMap()


        fun menu() {
            println("Digite o tipo de alimento que deseja incluir na lista\n" + "Verdura\n" + "Legume\n" + "Grão\n" + "Outros\n" + "ver Lista\n" + "Sair")
            val alimento = readln().lowercase()

            if ((alimento != "verdura") && (alimento != "legume") && (alimento != "grão") && (alimento != "grao") && (alimento != "outros") && (alimento != "ver lista") && (alimento != "sair")) {
                throw IllegalArgumentException(MSG_TIPO_INVÁLIDO)
            }

            when (alimento) {
                "verdura", "grão", "grao" -> {
                    /*Não é para mexer aqui*/
                    val quantidade = informarQuantidadeVerduraGrao(alimento)
                    val nome = informarNomeAlimento(alimento)

                    listaAlimentos[nome] = quantidade
                    menu()
                }
                "legume", "outros" -> {
                    val quantidade = informarQuantidadeLegumeOutros(alimento)
                    val nome = informarNomeAlimento(alimento)
                    menu()
                }
                "ver lista" -> {
                    if (listaAlimentos.isEmpty()) {
                        println("Sua lista está vazia")
                        menu()
                    } else {
                        println("---------- LISTA DE COMPRAS ----------")
                        listaAlimentos.forEach { alimento, quantidade ->
                            println("Nome do item: ${alimento} - Quantidade: ${quantidade}.")
                        }
                        println("A quantidade de alimentos do tipo outros alimentos a ser comprada é = ${listaAlimentos.size}")
                        menu()
                    }
                }
                "sair" -> {
                    println("Até breve!")
                    exitProcess(0)
                }
            }
        }

    }
}