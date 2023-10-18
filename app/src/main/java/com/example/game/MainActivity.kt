package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onClickbtn1(view:View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        val userChoice = "Ножницы"
        binding.txt4.text = userChoice
        if (gameChoice == "Камень") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.txt3.text = "Ничья"
        else if (gameChoice == "Бумага") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.txt3.text = "Вы выиграли"
        else binding.txt3.text = "Вы проиграли"
    }

    fun onClickbtn2(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        val userChoice = "Бумага"
        binding.txt4.text = userChoice
        if (gameChoice == "Камень") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.txt3.text = "Ничья"
        else if (gameChoice == "Ящерица") binding.txt3.text = "Вы проиграли"
        else binding.txt3.text = "Вы выиграли"
    }

    fun onClickbtn3(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        val userChoice = "Камень"
        binding.txt4.text = userChoice
        if (gameChoice == "Камень") binding.txt3.text = "Ничья"
        else if (gameChoice == "Ножницы") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.txt3.text = "Вы выиграли"
        else binding.txt3.text = "Вы проиграли"
    }

    fun onClickbtn4(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        val userChoice = "Ящерица"
        binding.txt4.text = userChoice
        if (gameChoice == "Камень") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.txt3.text = "Ничья"
        else binding.txt3.text = "Вы выиграили"
    }

    fun onClickbtn5(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        val userChoice = "Спок"
        binding.txt4.text = userChoice
        if (gameChoice == "Камень") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.txt3.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.txt3.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.txt3.text = "Вы проиграли"
        else binding.txt3.text = "Ничья"
    }

    fun getGameChoice(optionsParam: Array<String>): String {
        var choice = optionsParam[(Math.random() * optionsParam.size).toInt()]
        if (choice == "Камень") binding.imgiew2.setBackgroundResource(R.drawable.background3)
        else if (choice == "Ножницы") binding.imgiew2.setBackgroundResource(R.drawable.bacground1)
        else if (choice == "Бумага") binding.imgiew2.setBackgroundResource(R.drawable.background2)
        else if (choice == "Ящерица") binding.imgiew2.setBackgroundResource(R.drawable.background4)
        else binding.imgiew2.setBackgroundResource(R.drawable.background5)
        return choice
    }
}