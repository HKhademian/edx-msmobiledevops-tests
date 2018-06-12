package ir.hossainkhademian.postagram

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
	private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
		when (item.itemId) {
			R.id.navigation_home -> {
				message.setText(R.string.title_home)
				Snackbar.make(container, "Hello Home", Snackbar.LENGTH_LONG).show()
				return@OnNavigationItemSelectedListener true
			}
			R.id.navigation_dashboard -> {
				message.setText(R.string.title_dashboard)
				return@OnNavigationItemSelectedListener true
			}
			R.id.navigation_notifications -> {
				message.setText(R.string.title_notifications)
				return@OnNavigationItemSelectedListener true
			}
		}
		false
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_dashboard)

		navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
	}
}
