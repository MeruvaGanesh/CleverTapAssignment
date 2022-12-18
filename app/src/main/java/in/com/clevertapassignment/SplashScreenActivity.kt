package `in`.com.clevertapassignment

import android.app.NotificationManager
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.clevertap.android.sdk.CleverTapAPI

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        CleverTapAPI.getDefaultInstance(applicationContext)

        CleverTapAPI.createNotificationChannel(
            applicationContext,"testChannelId","Test Channel for Clevertap Assignment","This is a test channel created to test notifications in android app",
            NotificationManager.IMPORTANCE_MAX,true)
        CleverTapAPI.getDefaultInstance(this)?.pushEvent("Splash Screen Launched")
        CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.DEBUG)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val i = Intent(this@SplashScreenActivity, Main::class.java)
            startActivity(i)
            finish()
        }, 2500)
    }
}