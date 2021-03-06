package com.neppplus.kotlinbasic_20210306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        testBtn2.setOnClickListener {
            Log.e("메인화면로그", "테스트2 눌림")

        }



        testBtn1.setOnClickListener {



//            ctrl + / : 코드에 메모 (주석 남기기)


//      이 중광로 ㅎ안에 적는 코드가, testBtn1이 눌렸을 때 실행해줄 일.

            Log.d("태그종류", "테스트1 버튼 눌림")
        }


    }
}