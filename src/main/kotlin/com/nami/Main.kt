package com.nami

import com.nami.assignments.*;

val assignments = listOf(
//    Y23D01(),
//    Y24D01(),
//    Y24D02(),
    Y24D03()
)

val solutions = Assignment.getSolutions(assignments)

fun main() {
    println(solutions)
}