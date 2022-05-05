package com.chaudharynabin.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chaudharynabin.happybirthday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    view binding is important concept
//    https://www.youtube.com/watch?v=z0F2QTAKsWU
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(this.binding.root)

    }

    fun createBirthdayCard(view: View) {
        var name = this.binding.nameEditText.editableText

        Toast.makeText(this,"Name: $name",Toast.LENGTH_SHORT).show()

    }
}