package com.icici.composeplayground.viewComponents

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.icici.composeplayground.data.Message
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview
import com.icici.composeplayground.data.SampleData

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}
