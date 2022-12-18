package `in`.com.clevertapassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clevertap.android.sdk.CleverTapAPI


class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        CleverTapAPI.getDefaultInstance(this)?.pushEvent("Home Screen Launched")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}