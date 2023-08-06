package edu.mirea.onebeattrue.simplerecycler.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.mirea.onebeattrue.simplerecycler.R
import edu.mirea.onebeattrue.simplerecycler.domain.Message

class MessagesAdapter: RecyclerView.Adapter<MessagesAdapter.MessageHolder>() {

    var messages = listOf<Message>()

    class MessageHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textTV: TextView = view.findViewById(R.id.textTV)
        val timeTV: TextView = view.findViewById(R.id.timeTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.message_bubble, parent, false)
        return MessageHolder(view)
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    override fun onBindViewHolder(holder: MessageHolder, position: Int) {
        holder.textTV.text = messages[position].text
        holder.timeTV.text = messages[position].time
    }
}