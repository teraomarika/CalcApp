package jp.techacademy.marika.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_subapp.*

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
//        if (v.id==R.id.button_plus){
//            edit1+edit2
//        }else if (v.id==R.id.button_minus){
//            edit1-edit2
//        }else if(v.id==R.id.button_double){
//            edit1*edit2
//        }else if(v.id==R.id.button_division){
//            edit1/edit2
//        }
        val intent = Intent(this, Subapp::class.java)
        val value1 = edit1.text.toString()
        val value2 = edit2.text.toString()



        intent.putExtra("VALUE1",value1)
        intent.putExtra("VALUE2", value2)
        startActivity(intent)

    }

}
