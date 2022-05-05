package com.chaudharynabin.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chaudharynabin.happybirthday.databinding.ActivityGreetingCardBinding

class GreetingCard : AppCompatActivity() {
//    static values
    companion object{
        const val NAME_EXTRAS = "NAME_EXTRAS"
    }
//    binding
    private  lateinit var binding: ActivityGreetingCardBinding
//    onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        this.binding = ActivityGreetingCardBinding.inflate(this.layoutInflater)
        setContentView(this.binding.root)

        val name = this.intent.getStringExtra(NAME_EXTRAS)

        this.binding.happyBirthdayTextView.text  = name
    }
}