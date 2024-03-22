package com.kaushik.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score : Int = intent.getIntExtra("score",0)
        val totalQuestions : Int = intent.getIntExtra("totalQuestions",0)
        val username : String? = intent.getStringExtra("username")

        val tvUsername : TextView = findViewById(R.id.tv_name)
        tvUsername.text = username

        val tvScore : TextView = findViewById(R.id.tv_score)
        tvScore.text =  "Your score is $score out of $totalQuestions"

        val btnFinish : Button = findViewById(R.id.btn_finish)
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}