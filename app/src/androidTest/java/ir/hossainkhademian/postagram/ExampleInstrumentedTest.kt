package ir.hossainkhademian.postagram

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

import com.microsoft.appcenter.espresso.Factory
import org.junit.After


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
	@Rule
	@JvmField
	val reportHelper = Factory.getReportHelper()!!

	@Test
	fun useAppContext() {
		// Context of the app under test.
		val appContext = InstrumentationRegistry.getTargetContext()
		assertEquals("ir.hossainkhademian.postagram", appContext.packageName)

		reportHelper.label("Start")
	}

	@After
	fun theEnd() {
		reportHelper.label("this is the end")
	}
}
