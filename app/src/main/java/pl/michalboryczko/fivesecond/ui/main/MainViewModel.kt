package pl.michalboryczko.fivesecond.ui.main

import android.arch.lifecycle.ViewModel
import pl.michalboryczko.fivesecond.repository.QuestionRepository
import javax.inject.Inject

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
class MainViewModel
    @Inject constructor(var repository: QuestionRepository) :ViewModel() {

    
}