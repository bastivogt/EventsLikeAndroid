package name.sebastian.vogt

class Counter(start: Int = 0, end: Int = 10, step: Int = 1) {

    var start = start
        protected set

    var end = end
        protected set
    var step = step
        protected set

    var count = 0
        protected set



    var onCounterStart: ((source: Counter, count: Int) -> Unit)? = null
        protected set
    var onCounterChange: ((source: Counter, count: Int) -> Unit)? = null
        protected set
    var onCounterFinish: ((source: Counter, count: Int) -> Unit)? = null
        protected set

    fun setOnCounterStartListener(listener: ((source: Counter, count: Int) -> Unit)) {
        onCounterStart = listener
    }
    fun removeOnCounterStartListener() {
        onCounterStart = null
    }



    fun setOnCounterChangeListener(listener: ((source: Counter, count: Int) -> Unit)) {
        onCounterChange = listener
    }
    fun removeOnCounterChangeListener() {
        onCounterChange = null
    }




    fun setOnCounterFinishListener(listener: ((source: Counter, count: Int) -> Unit)) {
        onCounterFinish = listener
    }
    fun removeonCounterFinishListener() {
        onCounterFinish = null
    }



    protected fun notifyOnCounterStart(source: Counter, count: Int) {
        onCounterStart?.invoke(source, count)
    }


    protected fun notifyOnCounterChange(source: Counter, count: Int) {
        onCounterChange?.invoke(source, count)
    }

    protected fun notifyOnCounterFinish(source: Counter, count: Int) {
        onCounterFinish?.invoke(source, count)
    }





    fun run() {
        notifyOnCounterStart(this, count)
        for(i: Int in start..end) {
            count = i
            notifyOnCounterChange(this, count)

        }
        notifyOnCounterFinish(this, count)

    }

    fun reset(start: Int = 0, end: Int, step: Int = 1) {
        this.start = start
        this.end = end
        this.step = step
        this.count = 0
    }



}
