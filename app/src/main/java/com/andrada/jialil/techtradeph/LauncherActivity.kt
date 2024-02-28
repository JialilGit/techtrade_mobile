package com.andrada.jialil.techtradeph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andrada.jialil.techtradeph.databinding.ActivityLauncherBinding

class LauncherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLauncherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.loginLauncherButton.setOnClickListener {
            startActivity(Intent(this@LauncherActivity, LoginActivity::class.java))
            finish()
        }

        binding.signupLauncherButton.setOnClickListener {
            startActivity(Intent(this@LauncherActivity, SignupActivity::class.java))
            finish()
        }
    }
}