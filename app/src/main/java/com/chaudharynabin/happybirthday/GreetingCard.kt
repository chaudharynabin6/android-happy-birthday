package com.chaudharynabin.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.chaudharynabin.happybirthday.databinding.ActivityGreetingCardBinding

class GreetingCard : AppCompatActivity() {
//    static values
    companion object{
        const val NAME_EXTRAS = "NAME_EXTRAS"
    }
//    binding
    private  lateinit var binding: ActivityGreetingCardBinding

    private var array = arrayOf(R.drawable.frame_0,R.drawable.frame_1,R.drawable.frame_2,R.drawable.frame_3)
    private  var index  = 0
//    onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        this.binding = ActivityGreetingCardBinding.inflate(this.layoutInflater)
        setContentView(this.binding.root)

        val name = this.intent.getStringExtra(NAME_EXTRAS)

        this.binding.happyBirthdayTextView.text  = name
    }
    private fun decreaseIndex(){
        if(this.index == 0){
            this.index = this.array.size - 1
        }else{
            this.index--
        }
    }
    private fun increaseIndex(){
        if(this.index == this.array.size -1 ){
            this.index = 0
        }
        else{
            this.index++
        }
    }
    fun previousImage(view: View) {
        decreaseIndex()
        this.binding.frameImageView.setImageResource(this.array[index])
    }
    fun nextImage(view: View) {
        increaseIndex()
        this.binding.frameImageView.setImageResource(this.array[index])
    }
}