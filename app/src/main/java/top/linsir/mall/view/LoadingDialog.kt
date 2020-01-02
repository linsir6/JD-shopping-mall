package top.linsir.mall.view

import android.app.Dialog
import android.content.Context
import top.linsir.mall.R

/**
 *  Created by linSir
 *  date at 2018/1/29.
 *  describe:
 */
object LoadingDialog {
    private var dialog: Dialog? = null

    fun show(context: Context) {
        cancel()
        dialog = Dialog(context, R.style.LoadingDialog)
        dialog?.setContentView(R.layout.dialog_loading)
        dialog?.setCancelable(false)
        dialog?.setCanceledOnTouchOutside(false)
        dialog?.show()
    }

    fun cancel() {
        dialog?.dismiss()
    }
}
