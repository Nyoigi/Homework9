package com.example.homework9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomMotivation = listOf(
            "Если вы не победите себя, тогда будете побеждены самим собой",
            "Чем просто хотеть рыбы, лучше начни плести сети, чтобы её поймать",
            "Если ты не можешь, тогда должен. А если должен, значит сможешь",
            "Лучше сделать и пожалеть, чем не сделать и пожалеть дважды",
            "Всегда делай то, что ты боишься сделать",
            "Мечты не работают, пока не работаешь ты",
            "Сделай сегодня сколько сможешь, завтра сможешь еще больше",
            "Кто сильно желает подняться наверх, тот придумает лестницу",
            "Просто знайте, вы все сможете"
        )

        btnMotivation.setOnClickListener {
            tvMotivation.text = randomMotivation.random()
        }
    }
}