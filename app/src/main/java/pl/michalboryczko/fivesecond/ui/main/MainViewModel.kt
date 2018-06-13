package pl.michalboryczko.fivesecond.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import pl.michalboryczko.fivesecond.model.Question
import pl.michalboryczko.fivesecond.source.repository.QuestionRepository
import java.util.*
import javax.inject.Inject

/**
 * Created by ${michal_boryczko} on 11.06.2018.
 */
class MainViewModel
    @Inject constructor(private var repository : QuestionRepository ) :ViewModel() {

    var questions :List<Question> = mutableListOf()
    val currentQuestion: MutableLiveData<Question> = MutableLiveData()

    init {
        getQuestions()
    }

    fun onCardClicked(){
        //getQuestions()
        emitNextCard()
    }

    private fun getQuestions()  {
        repository.getQuestions()
                .subscribe (
                        {
                            questions = it },
                        {
                            it.printStackTrace() }
                )
    }

    private fun emitNextCard(){
        if(!questions.isEmpty()){
            val index = Random().nextInt(questions.size)
            currentQuestion.value = questions[index]
        }

    }

    
}