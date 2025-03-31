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
    // Declare Property that will be used later on the code
    private lateinit var resetButton: Button
    private lateinit var inputText: EditText
    private lateinit var ConfirmButton: Button
    private lateinit var OutputView: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Assigning The Part of the day to their  respective meals by creating a list and inputting text
        val Morning = listOf("cereal", "Pancakes", "Bacon and eggs", "Omelet","Tea and Bread","Coffee","sausages with eggs","scrambled eggs")
        val MidMorning = listOf("Fruit salad", "Yogurt", "Protein bar","Samosas","Cheese and crackers","Cereal","Pringles","Hot Chocolate")
        val Lunch = listOf("Pasta", "chicken and rice", "sandwich","Rice and Meat","fries and chicken","Chicken wraps","beef Wraps","Sushi","Mac & cheese","Tacos")
        val Afternoon = listOf("Tea with biscuits", "Smoothie", "Donuts","Avocado ","Mini sandwich (turkey & cheese)","Chicken Or Beef Pie","Chicken Soup")
        val Dinner =listOf("Rice and steak", "Burger and chips","Wraps","Kentucky fried chicken","Steak with mashed potatoes","Fish and chips","Ramen with eggs","Lasagna")
        val Snack =listOf("Chips", "Fries", "P and G sandwich","orange juice and biscuits","Chocolate","Popcorn","Grapes","Banana","Apples","Hard-boiled eggs","samosas","Cake")
        // Get the buttons,Outputview,inputext working by using their id that i set on the user interface
        resetButton = findViewById(R.id.ResetButton)
        OutputView = findViewById<TextView>(R.id.Output_View)
        inputText = findViewById(R.id.InputText)
        ConfirmButton = findViewById(R.id.ConfirmButton)
        ConfirmButton.setOnClickListener {
            //if the input is equal to Morning then the menu For Morning will be Displayed in the output view
            if (inputText.text.toString() == "Morning"){
                OutputView.text = "Good Morning, Here is What you can eat${Morning}"
            }else if(
                //else if the input is equal to MidMorning then the menu For MidMorning will be Displayed in the output view
                inputText.text.toString() == "MidMorning"){
                OutputView.text = "Hi,Here is what you can eat ${MidMorning}"} else if(
                //else if the input is equal to Lunch then the menu For Lunch will be Displayed in the output view
                    inputText.text.toString() == "Lunch"){
                        OutputView.text = "Here is What you can eat for lunch${Lunch}"}
            else if
                    //else if the input is equal to Afternoon then the menu For the Afternoon will be Displayed in the output view
                    (inputText.text.toString() == "Afternoon"){
                        OutputView.text = "Good Afternoon,Here What you can eat${Afternoon}"
                    } else if(
                //else if the input is equal to Dinner then the menu For Dinner will be Displayed in the output view
                inputText.text.toString() == "Dinner"){
                            OutputView.text = "Good Evening,Here is what you can eat${Dinner}"}
            else if(
                //else if the input is equal to snack then the menu For a snack will be Displayed in the output view
                inputText.text.toString() == "Snack"){
                            OutputView.text = "it's Snack Time,Time to bite${Snack}"}
            else{
                //else the input is equal to null or any other string then it will display a error text on the output view
                                inputText.text.toString() == ""
                    OutputView.text = "Please Enter The Correct Text Recommended Above"}
            }
        //when you enter the correct text input and click the button confirm it will display this text
            Toast.makeText(this, "The Menu has appeared", Toast.LENGTH_SHORT).show()
                    // Resets the InputText view and the Output view to the initial state and message will be displayed when action has been done
                            resetButton.setOnClickListener {
                                inputText.text.clear()
                                Toast.makeText(this, "Reset Has been Executed", Toast.LENGTH_SHORT).show()
                                OutputView.text="Suggestions Display"
                            }
                        }

                    }







