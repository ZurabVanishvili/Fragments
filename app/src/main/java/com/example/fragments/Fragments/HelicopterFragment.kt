package com.example.fragments.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.R

class HelicopterFragment : Fragment(R.layout.fragment_helicopter) {
    private lateinit var number: EditText
    private lateinit var shekvana: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        number = view.findViewById(R.id.number)
        shekvana = view.findViewById(R.id.shekvana)
        val xuti = number.toString()[0]

        shekvana.setOnClickListener() {



            if (number.text.toString().isNotEmpty() && !(number.text.toString()[0].equals("5")) )  {
                number.error = "ნომერი უნდა იწყებოდეს 5-ით  "
                return@setOnClickListener

            }else if (number.text.toString().isEmpty()){
                number.error = "შეიყვანეთ ნომერი "
            }else if (number.text.toString().length !=9){
                number.error = "ნომერი უნდა შეიცავდეს 9 სიმბოლოს "
            }
            else{
                Toast.makeText(activity, "წარმატებით დასრულდა ", Toast.LENGTH_SHORT).show()
            }



        }
    }
}


