package jp.techacademy.marika.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_double1.*

class double1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_double1)

        val value1  = intent.getDoubleExtra("VALUE5", 0.0)
        val value2 = intent.getDoubleExtra("VALUE6", 0.0)

        answer_double.text="${value1*value2}"

    }
}
