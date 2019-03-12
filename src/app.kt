import name.sebastian.vogt.Counter

fun main(args: Array<String>) {
    println("Hallo")

    val counter = Counter()

    counter.setOnCounterStartListener { source, count ->
        println("counterStart, sount: $count")
    }

    counter.setOnCounterChangeListener { source, count ->
        println("counterChange, sount: $count")
    }

    counter.setOnCounterFinishListener { source, count ->
        println("counterFinish, sount: $count step: ${source.step}")
    }

    counter.run()
}