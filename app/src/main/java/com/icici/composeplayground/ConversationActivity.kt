package com.icici.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.icici.composeplayground.data.SampleData
import com.icici.composeplayground.ui.theme.ComposePlayGroundTheme
import com.icici.composeplayground.viewComponents.Conversation

class ConversationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlayGroundTheme {
                Conversation(SampleData.conversationSample)
            }
        }
    }
}