package top.linsir.mall.base

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.gyf.barlibrary.ImmersionBar
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
abstract class BaseActivity : RxAppCompatActivity() {


    protected lateinit var immersionBar: ImmersionBar

    private val imm: InputMethodManager by lazy {
        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initImmersionBar()
    }

    protected abstract fun setLayoutId(): Int

    open protected fun initImmersionBar() {
        //在BaseActivity里初始化
        immersionBar = ImmersionBar.with(this)
        immersionBar.init()
    }

    /**
     * cancel request
     */
    protected abstract fun cancelRequest()

    override fun onDestroy() {
        super.onDestroy()
        immersionBar.destroy()  //必须调用该方法，防止内存泄漏，不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态
        cancelRequest()
    }

    override fun finish() {
        // if not finish
        if (!isFinishing) {
            super.finish()
            hideSoftKeyBoard()
        }
    }

    private fun hideSoftKeyBoard() {
        currentFocus?.let {
            imm.hideSoftInputFromWindow(it.windowToken, 2)
        }
    }



}