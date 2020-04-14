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
        var value1: Double? = edit1.text.toString().toDouble()
        var value2: Double? = edit2.text.toString().toDouble()





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

        try {//ここどうしたら
        } catch (e: NumberFormatException) {
            Log.d("error","数字なし")
            textView.text = "数字を入れてね"

        } finally {
            Log.d("zero", "数字なし")
        }


        val intent = Intent(this, Subapp::class.java)
    }

//       open fun showAlertDialog() {
//            // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
//            val alertDialogBuilder: AlertDialog.Builder = android.app.AlertDialog.Builder(this)
//            alertDialogBuilder.setTitle("エラー")
//            alertDialogBuilder.setMessage("数値以外のものが入力されています．")
//
//            // 肯定ボタンに表示される文字列、押したときのリスナーを設定する
//            alertDialogBuilder.setPositiveButton("OK",
//                DialogInterface.OnClickListener { dialog, which -> })
//
//            // AlertDialogを作成して表示する
//            val alertDialog: AlertDialog = alertDialogBuilder.create()
//            alertDialog.show()
//        }


    }



