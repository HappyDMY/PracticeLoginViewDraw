package com.tjoeun.practiceloginviewdraw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val id = inputId.text.toString()
            val pw = inputPw.text.toString()

            if(id == "admin" ){
                if( pw == "123"){
                    Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this,  UserInfoActivity::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this, "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "일반사용자입니다.", Toast.LENGTH_SHORT).show()

            }
        }




    }
}
