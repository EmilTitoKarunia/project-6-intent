package id.ac.polbeng.emil.pertemuan_6_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Logger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val Log = Logger.getLogger(MainActivity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.info("onCreate")
        btnToSecondActivity.setOnClickListener {
            val m_intent = Intent(this@MainActivity,
                SecondActivity::class.java)
            startActivity(m_intent)
        }
    }
    override fun onPause() {
        super.onPause()
        Log.info("onPause")
    }
    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.info("onResume")
    }
}