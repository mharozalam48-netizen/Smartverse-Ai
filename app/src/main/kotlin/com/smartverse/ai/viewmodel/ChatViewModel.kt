import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ChatViewModel : ViewModel() {

    private val _messages = MutableLiveData<List<String>>()
    val messages: LiveData<List<String>> get() = _messages

    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference

    init {
        loadMessages()
    }

    private fun loadMessages() {
        // Load messages from Firebase
        // This would typically include a listener for changes in the Firebase database
        // and updating the _messages LiveData object accordingly.
        // Example: database.child("chats").addValueEventListener(...)
    }

    fun sendMessage(message: String) {
        // Logic to send a message to Firebase
        // database.child("chats").push().setValue(message)
    }
}