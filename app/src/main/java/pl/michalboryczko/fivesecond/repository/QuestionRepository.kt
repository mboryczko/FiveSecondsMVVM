package pl.michalboryczko.fivesecond.repository

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import pl.michalboryczko.fivesecond.api.ApiService
import pl.michalboryczko.fivesecond.model.Question
import javax.inject.Inject

/**
 * Created by mjbor on 6/11/2018.
 */
class QuestionRepository
@Inject constructor(var apiService: ApiService){

    fun getQuestions() : Observable<List<Question>>{
        return getQuestionsFromApi()
    }

    private fun getQuestionsFromApi(): Observable<List<Question>>{
        return apiService.getAllQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

}