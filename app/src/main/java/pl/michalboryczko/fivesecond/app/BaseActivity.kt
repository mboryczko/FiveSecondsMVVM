package pl.michalboryczko.fivesecond.app

import android.arch.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.Disposable
import javax.inject.Inject

/**
 * Created by ${michal_boryczko} on 12.06.2018.
 */
open class BaseActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private val disposables :MutableList<Disposable> = mutableListOf()

    fun Disposable.addDisposable(){
        disposables.add(this)
    }

    override fun onStop() {
        super.onStop()
        for(disposable in disposables)
            if(!disposable.isDisposed)
                disposable.dispose()
    }
}