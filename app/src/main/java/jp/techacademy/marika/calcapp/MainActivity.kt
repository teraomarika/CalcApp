package jp.techacademy.marika.calcapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button_plus.setOnClickListener(this)

        button_minus.setOnClickListener(this)

        button_double.setOnClickListener(this)

        button_division.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        var value1: Double? = null
        var value2: Double? = null

        try {
            value1 = edit1.text.toString().toDouble()
            value2 = edit2.text.toString().toDouble()

        } catch (e: NumberFormatException) {
            Log.d("error","数字なし")
            textView.text = "数字を入れてね"

        } finally {
            Log.d("zero", "計算する")






            if (v != null) {
                if (v.id == R.id.button_plus) {
                    val intent = Intent(this, Subapp::class.java)

                    intent.putExtra("VALUE1", value1)
                    intent.putExtra("VALUE2", value2)
                    startActivity(intent)

                } else if (v.id == R.id.button_minus) {
                    val intent = Intent(this, minus::class.java)
                    intent.putExtra("VALUE3", value1)
                    intent.putExtra("VALUE4", value2)
                    startActivity(intent)

                } else if (v.id == R.id.button_double) {
                    val intent = Intent(this, double1::class.java)
                    intent.putExtra("VALUE5", value1)
                    intent.putExtra("VALUE6", value2)
                    startActivity(intent)

                } else if (v.id == R.id.button_division) {
                    val intent = Intent(this, division::class.java)
                    intent.putExtra("VALUE7", value1)
                    intent.putExtra("VALUE8", value2)
                    startActivity(intent)

                }
            }

        }


        val intent = Intent(this, Subapp::class.java)
    }

    }



