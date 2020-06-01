package kr.co.hgney.myprofile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nickBtn.setOnClickListener {



        }

        phoneBtn.setOnClickListener {
            val phoneNumber = phoneEdt.text.toString()
            val myUri = Uri.parse("tel:${phoneNumber}") // Uri - 안드로이드에서 제공하는걸로 선택. JAVA 제공 X
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        smsBtn.setOnClickListener {
            val phoneNumber = phoneEdt.text.toString()
            val myUri = Uri.parse("tel:${phoneNumber}") // Uri - 안드로이드에서 제공하는걸로 선택. JAVA 제공 X
            val myIntent = Intent(Intent.ACTION_SEND, myUri)
            startActivity(myIntent)

        }
    }
}
