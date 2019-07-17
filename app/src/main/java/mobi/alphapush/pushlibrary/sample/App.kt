package mobi.alphapush.pushlibrary.sample

import android.app.Application
import com.appspress.component.application.DaggerApplicationComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val applicationComponent = DaggerApplicationComponent.builder().setApplication(this).build()

    }

}