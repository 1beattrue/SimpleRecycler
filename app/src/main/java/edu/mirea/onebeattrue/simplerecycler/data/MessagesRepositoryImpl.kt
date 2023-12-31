package edu.mirea.onebeattrue.simplerecycler.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import edu.mirea.onebeattrue.simplerecycler.domain.Message
import edu.mirea.onebeattrue.simplerecycler.domain.MessagesRepository
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object MessagesRepositoryImpl : MessagesRepository {
    private val messages = sortedSetOf<Message>({ p0, p1 -> p0.id.compareTo(p1.id) })
    private val messagesLiveData = MutableLiveData<List<Message>>()

    private var incrementId = 0

    init {
        for (i in 0 until 100) {
            messages.add(
                Message(
                    "Message ${incrementId++}",
                    "${LocalDateTime.now().hour}:${LocalDateTime.now().minute}",
                    incrementId
                )
            )
            println(messages.toList())
        }
    }

    override fun deleteMessage(message: Message) {
        messages.remove(message)
        updateList()
    }

    override fun getMessages(): LiveData<List<Message>> {
        updateList()
        return messagesLiveData
    }

    private fun updateList() {
        println(messages.toList())
        messagesLiveData.value = messages.toList()
    }
}