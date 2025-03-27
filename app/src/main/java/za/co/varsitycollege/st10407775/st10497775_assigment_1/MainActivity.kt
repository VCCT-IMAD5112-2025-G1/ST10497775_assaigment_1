package za.co.varsitycollege.st10407775.st10497775_assigment_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.awaitAll
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private lateinit var resetButton: Button
    private lateinit var inputText: EditText
    private lateinit var ConfirmButton: Button
    private lateinit var OutputView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Morning = listOf("cereal", "Pancakes", "Bacon and eggs", "Omelet")
        val MidMorning = listOf("Fruit salad", "Yogurt", "Protein bar",)
        val Lunch = listOf("Pasta", "chicken and rice", "sandwhich",)
        val Afternoon = listOf("Tea with biscuits", "Smoothie", "Donuts")
        val Dinner = listOf("Rice and steak", "Burger and chips")
        val snack = listOf("Chips", "Fries", "P and G sandwhich")
        resetButton = findViewById(R.id.ResetButton)
        OutputView = findViewById<TextView>(R.id.Output_View)
        inputText = findViewById(R.id.InputText)
        ConfirmButton = findViewById(R.id.ConfirmButton)
        ConfirmButton.setOnClickListener {
            if (inputText.text.toString() == "Morning") {
                OutputView.text = "Good Morning, Here is What you can eat${Morning}"
            } else {
                inputText.text.toString() == "MidMorning"
                OutputView.text = "Hi,Here is what you can eat ${MidMorning}"
            }
            else{
            inputText.text.toString() == "Lunch"
            OutputView.text = "Here is What you can Eat for lunch${Lunch}"
        }
            else{
            inputText.text.toString() == "Afternoon"
            OutputView.text = "Good Afternoon, Here is what you can eat${Afternoon}"
        }
            else
            {
                inputText.text.toString() == "Dinner"
                OutputView.text = "Good evening,Here is what you can eat ${Dinner}"
            }
            else
            {
                inputText.text.toString() == "snack"
                OutputView.text = "it's Snack Time,Time to bite${snack}"
            }
            Toast.makeText(this, "The Menu has appeared", Toast.LENGTH_SHORT).show()
        }

        resetButton.setOnClickListener {
                inputText.text.clear()
                OutputView.text = "Suggestions Display"
                Toast.makeText(this, "Reset has been executed", Toast.LENGTH_SHORT).show()


            }
        }
    }
