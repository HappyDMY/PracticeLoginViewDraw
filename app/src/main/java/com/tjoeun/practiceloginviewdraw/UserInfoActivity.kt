package com.tjoeun.practiceloginviewdraw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.practiceloginviewdraw.datas.UserData
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)
        val userdata = intent.getSerializableExtra("userData") as UserData

        val userHeight = intent.getDoubleExtra("userHeight", 0.1)
//        val userIdFormIntent =  intent.getStringExtra("userId").toString()
//        val userPwFormIntent =  intent.getStringExtra("userId").toString()

//        idTxt.text = userIdFormIntent
//        pwTxt.text = userPwFormIntent

        idTxt.text = userdata.userLoginId
        pwTxt.text = userdata.userLoginPw

    }
}
