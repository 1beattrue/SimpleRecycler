package edu.mirea.onebeattrue.simplerecycler.domain

import androidx.lifecycle.LiveData

class GetMessagesUseCase(private val repository: MessagesRepository) {
    fun getMessages(): LiveData<List<Message>> {
        return repository.getMessages()
    }
}