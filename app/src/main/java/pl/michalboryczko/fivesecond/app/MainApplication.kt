package pl.michalboryczko.fivesecond.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import pl.michalboryczko.fivesecond.di.DaggerAppComponent

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
class MainApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}