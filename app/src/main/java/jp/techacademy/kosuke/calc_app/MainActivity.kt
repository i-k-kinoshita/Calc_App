package jp.techacademy.kosuke.calc_app

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // setSupportActionBar(toolbar)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString().toDouble() + editText2.text.toString().toDouble())
            startActivity(intent)

        } else if (v.id == R.id.button2) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString().toDouble() - editText2.text.toString().toDouble())
            startActivity(intent)
        } else if (v.id == R.id.button3) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString().toDouble() * editText2.text.toString().toDouble())
            startActivity(intent)
        } else if (v.id == R.id.button4) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString().toDouble() / editText2.text.toString().toDouble())
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
