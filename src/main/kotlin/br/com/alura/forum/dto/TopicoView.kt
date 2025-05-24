package br.com.alura.forum.dto

import br.com.alura.forum.model.StatusToopico
import java.time.LocalDateTime

class TopicoView (
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusToopico,
    val dataCriacao: LocalDateTime
)