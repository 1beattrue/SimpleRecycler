package edu.mirea.onebeattrue.simplerecycler.domain

import androidx.lifecycle.LiveData

interface MessagesRepository {
    fun getMessages(): LiveData<List<Message>>
    fun deleteMessage(message: Message)
}