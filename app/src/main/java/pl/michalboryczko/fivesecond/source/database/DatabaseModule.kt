package pl.michalboryczko.fivesecond.source.database

import android.content.Context
import dagger.Module
import dagger.Provides
import pl.michalboryczko.fivesecond.source.database.dao.QuestionDAO

/**
 * Created by ${michal_boryczko} on 13.06.2018.
 */
@Module
class DatabaseModule {

    @Provides
    fun provideDatbase(context: Context): AppDatabase{
        return AppDatabase.getAppDatabase(context)
    }

    @Provides
    fun provideQuestionDAO(appDatabase: AppDatabase): QuestionDAO{
        return appDatabase.getQuestionDAO()
    }

}