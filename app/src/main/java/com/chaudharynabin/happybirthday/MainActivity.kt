package com.chaudharynabin.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        val name = this.binding.nameEditText.editableText.toString()

//        Toast.makeText(this,"Name: $name",Toast.LENGTH_SHORT).show()
        val intent = Intent(this,GreetingCard::class.java)
        intent.putExtra(GreetingCard.NAME_EXTRAS,name)
        this.startActivity(intent)
    }
}