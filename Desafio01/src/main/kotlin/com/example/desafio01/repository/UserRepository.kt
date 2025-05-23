package com.example.desafio01.repository

import com.example.desafio01.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Users, Long>