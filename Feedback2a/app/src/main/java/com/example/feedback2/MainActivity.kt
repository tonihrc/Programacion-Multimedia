package com.example.feedback2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener{group, checkedId ->
            mostrarBandera(checkedId)
        }
    }
    private fun mostrarBandera(checkedId: Int){
        when(checkedId){
            R.id.espana-> imageView.setImageResource(R.drawable.espana)
            R.id.portugal-> imageView.setImageResource(R.drawable.portugal)
            R.id.alemania-> imageView.setImageResource(R.drawable.alemania)
            R.id.argentina-> imageView.setImageResource(R.drawable.argentina)
            R.id.brasi-> imageView.setImageResource(R.drawable.brasil)
            R.id.canada-> imageView.setImageResource(R.drawable.canada)
            R.id.francia-> imageView.setImageResource(R.drawable.francia)
            R.id.holanda-> imageView.setImageResource(R.drawable.holanda)
            R.id.inglaterra-> imageView.setImageResource(R.drawable.inglaterra)
            R.id.italia-> imageView.setImageResource(R.drawable.italia)

        }
    }
}