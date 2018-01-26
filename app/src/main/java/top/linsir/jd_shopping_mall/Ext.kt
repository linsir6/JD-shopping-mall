package top.linsir.jd_shopping_mall

import android.annotation.SuppressLint
import android.app.ProgressDialog.show
import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.JobCancellationException

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */

/**
 * show toast
 * @param content String
 */


inline fun tryCatch(catchBlock: (Throwable) -> Unit = {}, tryBlock: () -> Unit) {
    try {
        tryBlock()
    } catch (_: JobCancellationException) {

    } catch (t: Throwable) {
        catchBlock(t)
    }
}

fun Deferred<Any>?.cancelByActive() = this?.run {
    tryCatch {
        if (isActive) {
            cancel()
        }
    }
}