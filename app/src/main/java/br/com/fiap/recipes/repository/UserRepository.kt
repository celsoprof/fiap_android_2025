package br.com.fiap.recipes.repository

import br.com.fiap.recipes.model.User

interface UserRepository {

    fun saveUser(user: User)
    fun getUser(id: Int = 0): User
    fun login(email: String, password: String): Boolean

}