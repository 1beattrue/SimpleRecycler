package edu.mirea.onebeattrue.simplerecycler.presentation

import androidx.lifecycle.ViewModel
import edu.mirea.onebeattrue.simplerecycler.data.MessagesRepositoryImpl
import edu.mirea.onebeattrue.simplerecycler.domain.DeleteMessageUseCase
import edu.mirea.onebeattrue.simplerecycler.domain.GetMessagesUseCase
import edu.mirea.onebeattrue.simplerecycler.domain.Message

class MainViewModel : ViewModel() {
    private val repository = MessagesRepositoryImpl

    private val getMessagesUseCase = GetMessagesUseCase(repository)
    private val deleteMessageUseCase = DeleteMessageUseCase(repository)

    val messages = getMessagesUseCase.getMessages()

    fun deleteMessage(message: Message) {
        deleteMessageUseCase.deleteMessage(message)
    }
}