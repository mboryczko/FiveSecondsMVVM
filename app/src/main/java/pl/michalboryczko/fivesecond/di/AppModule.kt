package pl.michalboryczko.fivesecond.di

import android.content.Context
import dagger.Module
import dagger.Provides
import pl.michalboryczko.fivesecond.app.MainApplication

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
@Module
class AppModule{

    @Provides
    fun providesContext(application: MainApplication): Context {
        return application.applicationContext
    }

}