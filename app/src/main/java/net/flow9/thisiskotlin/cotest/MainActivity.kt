package net.flow9.thisiskotlin.cotest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import net.flow9.thisiskotlin.cotest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // String 익스텐션 테스트 하기
        fun testStringExtension() {
            var original = "Hello"
            var added = " Guys~"
            // plus 함수를 사용해서 문자열을 더할 수 있다.
            Log.d("Extension", " added를 더한값은 ${original.plus(added)}입니다")
        }
    }

    fun String.plus(word: String): String {
        return this + word
    }

     }



