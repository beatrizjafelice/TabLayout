package com.jafan.tabbedtest

data class Turma (
    val id: Int,
    val nome_turma: String,
    val membros: List<Aluno>,
    val valor: Double
        )

data class Aluno (
    val id: Int,
    val nome: String,
    val preco_mes: Double,
        )

val lista_alunos = listOf(
    Aluno(0, "Leandro", 10.0),
    Aluno(1, "Maria", 30.0),
    Aluno(2, "Lucas", 50.0),
    Aluno(3, "Andrea", 25.0),
    Aluno(4, "José", 32.0)
)

val lista_turmas = listOf(
    Turma(0, "Turma 1", listOf(lista_alunos[0], lista_alunos[1]), 60.0),
    Turma(1, "Turma 2", listOf(lista_alunos[2]), 80.0),
    Turma(2, "Turma 3", listOf(lista_alunos[3]), 40.0),
    Turma(3, "Turma 4", listOf(lista_alunos[4]),60.0)
)