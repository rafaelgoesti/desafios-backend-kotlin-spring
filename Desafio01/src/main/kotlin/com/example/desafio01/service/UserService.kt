package com.example.desafio01.service

import com.example.desafio01.model.Users
import com.example.desafio01.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.concurrent.TimeoutException

@Service
class UserService(private val repo: UserRepository) {

    //Criar
    fun criarUser(user: Users): Users{
        return repo.save(user)
    }

    //Listar
    fun listarUsers() = repo.findAll()

    //Buscar por Id
    fun buscarPorId(id: Long): Users {
        return repo.findById(id).orElseThrow{ RuntimeException("Usuário não encontrado.") }
    }

    //Atualizar
    fun atualizar(id: Long, userAtualizado: Users): Users {
        val userAtualizado = repo.findById(id).orElseThrow{ RuntimeException("Usuário não encontrado") }

        val userSalvar = userAtualizado.copy(
            name = userAtualizado.name,
            email = userAtualizado.email,
            password = userAtualizado.password
        )
        return repo.save(userSalvar)
    }

    //Deletar
    fun deletarUser(id: Long) {
        val userExistente = repo.findById(id).orElseThrow{ RuntimeException("Usuáro não encontrado") }
        repo.delete(userExistente)
    }
}