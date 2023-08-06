package edu.mirea.onebeattrue.simplerecycler.domain

class Message(
    val text: String,
    val time: String,
    var id: Int = DEFAULT_ID
) {
    companion object {
        const val DEFAULT_ID = -1
    }
}