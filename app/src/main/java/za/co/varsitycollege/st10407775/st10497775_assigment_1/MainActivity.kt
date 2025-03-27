package za.co.varsitycollege.st10407775.st10497775_assigment_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var resetButton: Button
    private lateinit var inputText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Morning=listOf("cereal","Pancakes","Bacon and eggs","Omelet")
        val MidMorning=listOf("Fruit salad","Yogurt","Protein bar",)
        val  Lunch=listOf("Pasta","chicken and rice","sandwhich",)
        val Afternoon=listOf("Tea with biscuits","Smoothie","Donuts")
        val Dinner=listOf("Rice and steak","Burger and chips")
        val snack=listOf("Chips","Fries","P and G sandwhich")
        if (inputText==Morning){

        }
        resetButton = findViewById(R.id.ResetButton)
        inputText = findViewById(R.id.InputText)

        resetButton.setOnClickListener {
            inputText.text.clear()
            Toast.makeText(this, "Reset has been executed", Toast.LENGTH_SHORT).show()



        }
    }
}