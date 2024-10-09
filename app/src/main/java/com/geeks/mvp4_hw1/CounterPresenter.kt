package com.geeks.mvp4_hw1

class CounterPresenter {

    private val model = CounterModel()
    private var counterContract: CounterContract? = null

    fun attachCounterContract(counterContract: CounterContract){
        this.counterContract = counterContract
    }

    fun onIncrement() {
        model.increment()
        counterContract?.showResult(model.getResult())
        checkForSpecialValue(model.getResult())
    }

    fun onDecrement() {
        model.decrement()
        counterContract?.showResult(model.getResult())
        checkForSpecialValue(model.getResult())
    }

    private fun checkForSpecialValue(value: Int) {
        if (value == 10) {
            counterContract?.showToast("Поздравляем")
        }
        if (value == 15) {
            counterContract?.changeColor(android.graphics.Color.GREEN)
        } else {
            counterContract?.changeColor(android.graphics.Color.BLACK)
        }
    }
}