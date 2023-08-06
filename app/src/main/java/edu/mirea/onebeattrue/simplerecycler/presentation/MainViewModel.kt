package edu.mirea.onebeattrue.simplerecycler.presentation

import androidx.lifecycle.ViewModel
import edu.mirea.onebeattrue.simplerecycler.data.MessagesRepositoryImpl
import edu.mirea.onebeattrue.simplerecycler.domain.GetMessagesUseCase

class MainViewModel : ViewModel() {
    private val repository = MessagesRepositoryImpl

    private val getMessagesUseCase = GetMessagesUseCase(repository)

    val messages = getMessagesUseCase.getMessages()
}