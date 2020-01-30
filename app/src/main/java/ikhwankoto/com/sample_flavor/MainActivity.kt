package ikhwankoto.com.sample_flavor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // for run to emu / real device
    // change build variants menu on left panel on you'r android studio by default
    // View > Tool Windows > Build Variants.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_text.text = "APPLICATION_ID: " + BuildConfig.APPLICATION_ID
        if (BuildConfig.FLAVOR == Util.flavor_dev) {
            tv_text2.text = "BuildConfig.FLAVOR: dev"
        } else if (BuildConfig.FLAVOR == Util.flavor_prod) {
            tv_text2.text = "BuildConfig.FLAVOR: prod"
        } else if (BuildConfig.FLAVOR == Util.flavor_devClient1) {
            tv_text2.text = "BuildConfig.FLAVOR: devCleint1"
        } else if (BuildConfig.FLAVOR == Util.flavor_devClient2) {
            tv_text2.text = "BuildConfig.FLAVOR: devCleint2"
        } else if (BuildConfig.FLAVOR == Util.flavor_prodClient1) {
            tv_text2.text = "BuildConfig.FLAVOR: prodCleint1"
        } else if (BuildConfig.FLAVOR == Util.flavor_prodClient2) {
            tv_text2.text = "BuildConfig.FLAVOR: prodCleint2"
        }
        tv_text3.text = "BUILD_TYPE: " + BuildConfig.BUILD_TYPE
        tv_text4.text = "buildConfigField SECURE_KEY: " + BuildConfig.SECURE_KEY
        tv_text5.text = "buildConfigField SECURE_KEY2: " + BuildConfig.SECURE_KEY2
        tv_text6.text = "buildConfigField SECURE_KEY3: " + BuildConfig.SECURE_KEY3
        tv_text7.text = "buildConfigField SECURE_DEFAULT: " + BuildConfig.SECURE_DEFAULT
    }
}
