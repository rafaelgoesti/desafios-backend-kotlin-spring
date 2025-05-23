package com.example.desafio01.controller

import com.example.desafio01.model.Users
import com.example.desafio01.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val service: UserService) {

    //Rota para criar um User
    @PostMapping
    fun criarUser(@RequestBody user: Users): Users {
        return service.criarUser(user)
    }

    // Rota para buscar todos os Users
    @GetMapping
    fun listarTodos(): List<Users> {
        return service.listarUsers()
    }

    // Rota para buscar user por ID
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): ResponseEntity<Users> {
        val user = service.buscarPorId(id)
        return if (user != null) ResponseEntity.ok(user) else ResponseEntity.notFound().build()
    }

    // Rota para atualizar User
    @PutMapping("/{id}")
    fun atualizarUser(@PathVariable id: Long, @RequestBody userAtualizado: Users): ResponseEntity<Users> {
        return try {
            val atualizado = service.atualizar(id, userAtualizado)
            ResponseEntity.ok(atualizado)
        } catch (e: RuntimeException) {
            ResponseEntity.notFound().build()
        }
    }

    // Rota para deletar User
    @DeleteMapping("/{id}")
    fun deletarUser(@PathVariable id: Long): ResponseEntity<Void> {
        return try {
            service.deletarUser(id)
            ResponseEntity.noContent().build()
        } catch (e: RuntimeException) {
            ResponseEntity.notFound().build()
        }
    }
}