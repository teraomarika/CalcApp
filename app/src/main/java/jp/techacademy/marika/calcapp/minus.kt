package jp.techacademy.marika.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minus.*
import kotlinx.android.synthetic.main.activity_subapp.*

class minus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minus)

        val value1  = intent.getDoubleExtra("VALUE3", 0.0)
        val value2 = intent.getDoubleExtra("VALUE4", 0.0)

        answer_minus.text="${value1-value2}"
    }
}
