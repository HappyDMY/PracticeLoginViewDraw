package com.tjoeun.practiceloginviewdraw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tjoeun.practiceloginviewdraw.datas.UserData
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

            val intent = Intent(this, UserInfoActivity::class.java)

            val loginUser = UserData()
            loginUser.userLoginId = id
            loginUser.userLoginPw = pw
//            intent.putExtra("userData", loginUser) //그냥 만들면에러남
            intent.putExtra("userData", loginUser) //그냥 만들면 에러 남 userData에 Serializble 추가해야함



//            intent.putExtra("userId", id)
//            intent.putExtra("userPw", pw)
//            intent.putExtra("userHeight", 111.88)


            startActivity(intent)

        }




    }
}
