package com.example.mad_practical_9_21012021003

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation:AnimationDrawable
    lateinit var heartanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imagealarm = findViewById<ImageView>(R.id.imagealarm)
        imagealarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation=imagealarm.background as AnimationDrawable
        val imageheart = findViewById<ImageView>(R.id.imageheart)
        imageheart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation=imageheart.background as AnimationDrawable
    }

     override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus){
            alarmanimation.start()
            heartanimation.start()
        }
        else{
            alarmanimation.stop()
            heartanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

}
