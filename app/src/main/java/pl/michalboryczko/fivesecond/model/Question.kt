package pl.michalboryczko.fivesecond.model

/**
 * Created by ${michal_boryczko} on 12.06.2018.
 */
data class Question(
        val id_question: Int,
        val id_topic: Int,
        val question: String = ""
)