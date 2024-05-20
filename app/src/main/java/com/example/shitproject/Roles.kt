package com.example.shitproject

enum class Roles(
    val role: Byte
) {
    APPLICANT(0b1),
    EMPLOYEE(0b10)
}