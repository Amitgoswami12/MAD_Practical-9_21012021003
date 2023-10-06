package com.example.mad_practical_9_21012021003

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var guni_imgg:ImageView
    lateinit var logo_animation:Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        guni_imgg=findViewById<ImageView>(R.id.uvpce)
        guni_imgg.setBackgroundResource(R.drawable.uvpce_logo_animation)


        logo_animation = AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logo_animation.setAnimationListener(this)
    }
    //imaglogo.startanimation  if condition of has focused

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            logo_animation.start()

        }
        else
        {
            logo_animation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        Intent(this,MainActivity::class.java).also { startActivity(it)}
        overridePendingTransition(R.anim.scale_center_in,R.anim.scale_center_out)
        finish()
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }


}
