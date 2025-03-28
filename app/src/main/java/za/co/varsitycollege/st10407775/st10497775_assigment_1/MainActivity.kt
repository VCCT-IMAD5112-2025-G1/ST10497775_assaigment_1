package za.co.varsitycollege.st10407775.st10497775_assigment_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var resetButton: Button
    private lateinit var inputText: EditText
    private lateinit var ConfirmButton: Button
    private lateinit var OutputView: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Morning = listOf("cereal", "Pancakes", "Bacon and eggs", "Omelet","Tea and Bread","Coffee","sausages with eggs","scrambled eggs")
        val MidMorning = listOf("Fruit salad", "Yogurt", "Protein bar","Samosas","Cheese and crackers","Cereal","Pringles","Hot Chocolate")
        val Lunch = listOf("Pasta", "chicken and rice", "sandwich","Rice and Meat","fries and chicken","Chicken wraps","beef Wraps","Sushi","Mac & cheese","Tacos")
        val Afternoon = listOf("Tea with biscuits", "Smoothie", "Donuts","Avocado ","Mini sandwich (turkey & cheese)","Chicken Or Beef Pie","Chicken Soup")
        val Dinner =listOf("Rice and steak", "Burger and chips","Wraps","Kentucky fried chicken","Steak with mashed potatoes","Fish and chips","Ramen with eggs","Lasagna")
        val snack =listOf("Chips", "Fries", "P and G sandwich","orange juice and biscuits","Chocolate","Popcorn","Grapes","Banana","Apples","Hard-boiled eggs","samosas")
        resetButton = findViewById(R.id.ResetButton)
        OutputView = findViewById<TextView>(R.id.Output_View)
        inputText = findViewById(R.id.InputText)
        ConfirmButton = findViewById(R.id.ConfirmButton)
        ConfirmButton.setOnClickListener {
            if (inputText.text.toString() == "Morning"){
                OutputView.text = "Good Morning, Here is What you can eat${Morning}"
            }else if(
                inputText.text.toString() == "MidMorning"){
                OutputView.text = "Hi,Here is what you can eat ${MidMorning}"} else if(
                    inputText.text.toString() == "Lunch"){
                        OutputView.text = "Here is What you can eat for lunch${Lunch}"}
            else if(inputText.text.toString() == "Afternoon"){
                        OutputView.text = "Good Afternoon,Here What you can eat${Afternoon}"
                    } else if(inputText.text.toString() == "Dinner"){
                            OutputView.text = "Good Evening,Here is what you can eat${Dinner}"}
            else if(inputText.text.toString() == "snack"){
                            OutputView.text = "it's Snack Time,Time to bite${snack}"}
            else{
                                inputText.text.toString() == ""
                    OutputView.text = "Please Enter The Correct Text Recomended Above"}
            }
            Toast.makeText(this, "The Menu has appeared", Toast.LENGTH_SHORT).show()

                            resetButton.setOnClickListener {
                                inputText.text.clear()
                                Toast.makeText(this, "Reset Has been Executed", Toast.LENGTH_SHORT).show()
                                OutputView.text="Suggestions Display"
                            }
                        }

                    }







