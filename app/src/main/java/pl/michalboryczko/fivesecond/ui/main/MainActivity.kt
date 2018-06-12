package pl.michalboryczko.fivesecond.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import pl.michalboryczko.fivesecond.R
import pl.michalboryczko.fivesecond.app.BaseActivity

class MainActivity : BaseActivity() {

    lateinit var viewModel :MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(MainViewModel::class.java)

        viewModel.currentQuestion.observe(this, Observer{
            label.text = it?.question
        })

        questionCard.setOnClickListener {
            viewModel.onCardClicked()
        }


    }

}
