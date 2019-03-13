import name.sebastian.vogt.Counter

fun main(args: Array<String>) {
    println("Hallo")

    val counter = Counter()

    //counter.setOnCounterStartListener(::onStart)

    counter.setOnCounterStartListener { source, count ->
        println("counterStart, sount: $count")
        //source.removeOnCounterChangeListener()
    }

    counter.setOnCounterChangeListener { source, count ->
        println("counterChange, sount: $count")
    }

    counter.setOnCounterFinishListener { source, count ->
        println("counterFinish, sount: $count step: ${source.step}")
    }

    counter.run()
}

fun onStart(source: Counter, count: Int) {
    println("onStart count: $count")
}