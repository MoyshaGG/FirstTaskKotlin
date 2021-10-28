package com.mysliukserhii.firsttatk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var countA = 0
    var countB = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countTextA: TextView = findViewById(R.id.countA)
        var countTextB: TextView = findViewById(R.id.countB)
        var a1: Button = findViewById(R.id.a1)
        var a2: Button = findViewById(R.id.a2)
        var a3: Button = findViewById(R.id.a3)
        var b1: Button = findViewById(R.id.b1)
        var b2: Button = findViewById(R.id.b2)
        var b3: Button = findViewById(R.id.b3)
        var reset: Button = findViewById(R.id.Reset)

        a1.setOnClickListener {
            countA+=1
            count(countA,countTextA)
        }
        a2.setOnClickListener {
            countA +=2
            count(countA,countTextA)
        }
        a3.setOnClickListener {
            countA +=3
            count(countA,countTextA)
        }

        b1.setOnClickListener {
            countB +=1
            count(countB,countTextB)
        }
        b2.setOnClickListener {
            countB +=2
            count(countB,countTextB)
        }
        b3.setOnClickListener {
            countB +=3
            count(countB,countTextB)
        }
        reset.setOnClickListener{
            countB=0
            countA=0
            count(countB,countTextB)
            count(countA,countTextA)
        }
    }

    fun count(count: Int, textView: TextView)
    {
        textView.text = count.toString()
    }
}