package hr.ferit.zeljkosabo.inspired

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //prva
        textView01.text = getString(R.string.geoffrey_hinton)
        textView02.text = getString(R.string.geoffrey_hinton_born)
        textView03.text = getString(R.string.geoffrey_hinton_about)
        //image01.setImageDrawable(R.drawable.geoffrey_hinton.toDrawable())

//        val arrayGeoffreyHinton: Array<String> = resources.getStringArray(R.array.quotes_geoffrey_hinton)
//
//        for (item in arrayGeoffreyHinton)

        image01.setOnClickListener {
            //kod koji govori sto ce se desiti kada se klikne na sliku
            //Toast.makeText(baseContext, getString(R.string.geoffrey_hinton_quote01), Toast.LENGTH_LONG).show()
            val randomNumber = (1..3).random()

            if (randomNumber == 1)
                Toast.makeText(baseContext, getString(R.string.geoffrey_hinton_quote01), Toast.LENGTH_LONG).show()
            else if (randomNumber == 2)
                Toast.makeText(baseContext, getString(R.string.geoffrey_hinton_quote02), Toast.LENGTH_LONG).show()
            else if (randomNumber == 3)
                Toast.makeText(baseContext, getString(R.string.geoffrey_hinton_quote03), Toast.LENGTH_LONG).show()
        }

        //druga osoba
        textView04.text = getString(R.string.linus_torvalds)
        textView05.text = getString(R.string.linus_torvalds_born)
        textView06.text = getString(R.string.linus_torvalds_about)
        // image02.setImageDrawable(R.drawable.linus_torvalds.toDrawable())

        image02.setOnClickListener {
            //sto ce se desiti
            val randomNumber = (1..3).random()

            if (randomNumber == 1)
                Toast.makeText(baseContext, getString(R.string.linus_torvalds_quote01), Toast.LENGTH_LONG).show()
            else if (randomNumber == 2)
                Toast.makeText(baseContext, getString(R.string.linus_torvalds_quote02), Toast.LENGTH_LONG).show()
            else if (randomNumber == 3)
                Toast.makeText(baseContext, getString(R.string.linus_torvalds_quote03), Toast.LENGTH_LONG).show()
        }

        //treca osoba
        textView07.text = getString(R.string.steve_wozniak)
        textView08.text = getString(R.string.steve_wozniak_born)
        textView09.text = getString(R.string.steve_wozniak_about)

        image03.setOnClickListener {
            val randomNumber = (1..3).random()

            if (randomNumber == 1)
                Toast.makeText(baseContext, getString(R.string.steve_wozniak_quote01), Toast.LENGTH_LONG).show()
            else if (randomNumber == 2)
                Toast.makeText(baseContext, getString(R.string.steve_wozniak_quote02), Toast.LENGTH_LONG).show()
            else if (randomNumber == 3)
                Toast.makeText(baseContext, getString(R.string.steve_wozniak_quote03), Toast.LENGTH_LONG).show()
        }

    }
}
