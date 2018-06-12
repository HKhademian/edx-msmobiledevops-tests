package ir.hossainkhademian.postagram

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class App : Application() {
	override fun onCreate() {
		super.onCreate()
		AppCenter.start(this,
			"0fc34e19-7dd1-4b5d-90bf-5b14bbea9735",
			Analytics::class.java,
			Crashes::class.java)
	}
}
