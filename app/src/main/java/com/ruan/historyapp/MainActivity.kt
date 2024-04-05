package com.ruan.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.NonCancellable

class MainActivity : AppCompatActivity() {

    private lateinit var serchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        serchButton= findViewById(R.id.SearchButton)
        clearButton= findViewById(R.id.clearButton)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)

        serchButton.setOnClickListener {

            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in  25 .. 100) {

                val employeeName = when (age) {
                    54 ->"Matthew perry"
                    25 ->"Angus cloud"
                    42 ->"Elvis presley"
                    71 ->"Kirstie alley"
                    67 ->"Ray liotta"
                    65 ->"Bob saget"
                    99 ->"Betty white"
                    57 ->"Willie garson"
                    61 ->"Norm macdonald"
                    44 ->"Dustin diamond"
                    else -> null

                }
                val message1 = if (54 !=null)"matthew perry was an actor who died on 28 october 2023"
                else "no famous historic person died on the entered age"
                resultTextView.text = message1

                val message2 = if (25 !=null)"angus cloud was an actor who died on 31 july 2023"
                else "no famous historic person died on the entered age"

                val message3 = if (42 !=null)"elvis presley was a singer who died on 16 august 1977"
                else "no famous historic person died on the entered age"

                val message4 = if (71 !=null)"kirstie alley was an actor who died on 5 december 2022"
                else "no famous historic person died on the entered age"

                val message5 = if (67 !=null)"ray liotta was an actor who died on 26 may 2022"
                else "no famous historic person died on the entered age"

                val message6 = if (65 !=null)"bob saget was a comedian who died on 9 january 2022"
                else "no famous historic person died on the entered age"

                val message7 = if (99 !=null)"betty white was a actor and comedian who died on 31 december 2021"
                else "no famous historic person died on the entered age"

                val message8 = if (57 !=null)"willie garson was a actor who died on 21 september 2021"
                else "no famous historic person died on the entered age"

                val message9 = if (61 !=null)"norm macdonald was a comedian who died on 14 september 2021"
                else "no famous historic person died on the entered age"

                val message10 = if (44 !=null)"dustin diamond was a actor and comedian who died on 1 february 2021"
                else "no famous historic person died on the entered age"

            }else{
                resultTextView.text ="invalid input.Please enter a valid age between 20 and 50"
            }
        }
        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text=""

        }
    }


}