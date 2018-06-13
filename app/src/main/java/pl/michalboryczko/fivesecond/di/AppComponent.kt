package pl.michalboryczko.fivesecond.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import pl.michalboryczko.fivesecond.source.api.ApiModule
import pl.michalboryczko.fivesecond.app.MainApplication
import pl.michalboryczko.fivesecond.source.database.AppDatabase
import pl.michalboryczko.fivesecond.source.database.DatabaseModule
import pl.michalboryczko.fivesecond.ui.main.MainModule
import javax.inject.Singleton

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
@Singleton
@Component(
        modules = arrayOf(
                AndroidSupportInjectionModule::class,
                AppModule::class,
                ApiModule::class,
                DatabaseModule::class,
                ViewModelBuilder::class,
                MainModule::class
        ))
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()
}