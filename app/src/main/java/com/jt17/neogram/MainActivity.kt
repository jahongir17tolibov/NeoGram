package com.jt17.neogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    var str = ""
    private val password = "1746"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<MaterialCardView>(R.id.once)
        val btn2 = findViewById<MaterialCardView>(R.id.ABC2)
        val btn3 = findViewById<MaterialCardView>(R.id.DEF3)
        val btn4 = findViewById<MaterialCardView>(R.id.GHI4)
        val btn5 = findViewById<MaterialCardView>(R.id.JKL5)
        val btn6 = findViewById<MaterialCardView>(R.id.MNO6)
        val btn7 = findViewById<MaterialCardView>(R.id.PQRS7)
        val btn8 = findViewById<MaterialCardView>(R.id.TUV8)
        val btn9 = findViewById<MaterialCardView>(R.id.WXYZ9)
        val btn0 = findViewById<MaterialCardView>(R.id.ZERO)
        val deleteBtn = findViewById<LinearLayout>(R.id.delete_btn)
        val checker = findViewById<LinearLayout>(R.id.check)
        var result = findViewById<TextView>(R.id.passcode_txt)

        btn1.setOnClickListener {
            str += "1"
            result.text = str
        }

        btn2.setOnClickListener {
            str += "2"
            result.text = str
        }

        btn3.setOnClickListener {
            str += "3"
            result.text = str
        }

        btn4.setOnClickListener {
            str += "4"
            result.text = str
        }

        btn5.setOnClickListener {
            str += "5"
            result.text = str
        }

        btn6.setOnClickListener {
            str += "6"
            result.text = str
        }

        btn7.setOnClickListener {
            str += "7"
            result.text = str
        }

        btn8.setOnClickListener {
            str += "8"
            result.text = str
        }

        btn9.setOnClickListener {
            str += "9"
            result.text = str
        }

        btn0.setOnClickListener {
            str += "0"
            result.text = str
        }

        deleteBtn.setOnClickListener {
            val txt = result.text.toString()
            if (txt.isNotEmpty()) {
                str = str.substring(0, txt.length - 1)
                result.text = str
            }
        }

        deleteBtn.setOnLongClickListener {
            val txt = result.text.toString()
            if (txt.isNotEmpty()) {
                str = ""
                result.text = str
            }
            true
        }

        checker.setOnClickListener {
            val txt = result.text.toString()
            if (txt.isNotEmpty()) {
                if (txt == password) {

                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    finish()
                    Toast.makeText(this, "To'g'riye qoyil", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "xato", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

}