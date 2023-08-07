package edu.mirea.onebeattrue.simplerecycler.domain

class DeleteMessageUseCase(private val repository: MessagesRepository) {
    fun deleteMessage(message: Message) {
        repository.deleteMessage(message)
    }
}