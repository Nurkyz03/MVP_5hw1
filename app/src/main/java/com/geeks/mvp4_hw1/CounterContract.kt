package com.geeks.mvp4_hw1

interface CounterContract {

    fun showResult(count: Int)
    fun showToast(message: String)
    fun changeColor(color: Int)
}