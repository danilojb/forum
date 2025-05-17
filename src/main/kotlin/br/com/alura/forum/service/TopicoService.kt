package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoService(private var topicos: List<Topico>) {
    init {
        val topico1 = Topico(
            id = 1,
            titulo = "Duvida Kotlin 1",
            mensagem = "Variaveis no Kotlin 1",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@gmail.com"
            )
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin 2",
            mensagem = "Variaveis no Kotlin 2",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@gmail.com"
            )
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Kotlin 3",
            mensagem = "Variaveis no Kotlin 3",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@gmail.com"
            )
        )
        topicos = Arrays.asList(topico1,topico2,topico3)
    }
        fun listar(): List<Topico> {
            return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            topico -> topico.id == id
        }).findFirst().get()
    }
}