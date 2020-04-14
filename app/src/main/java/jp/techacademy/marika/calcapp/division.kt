package jp.techacademy.marika.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_division.*
import kotlinx.android.synthetic.main.activity_main.*

class division : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_division)

        val value1  = intent.getDoubleExtra("VALUE7", 0.0)
        val value2 = intent.getDoubleExtra("VALUE8", 0.0)

        
        answer_division.text="${value1/value2}"










        }
}

