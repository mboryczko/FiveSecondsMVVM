package pl.michalboryczko.fivesecond.ui.main

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import pl.michalboryczko.fivesecond.di.ViewModelKey

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
@Module
internal abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel


    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}