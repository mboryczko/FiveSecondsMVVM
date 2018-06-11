package pl.michalboryczko.fivesecond.api

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by mjbor on 6/11/2018.
 */

@Singleton
class ApiService
@Inject constructor(var context: Context, var endpoint: String, var api: Api)
{


}