package com.lynas.sort

fun bubbleSort(array: Array<Int>, arraySize: Int): Array<Int> {
    for (k in 1 until arraySize - 1) {
        var flag = true
        for (i in 0 until arraySize - 1) {
            if (array[i] > array[i + 1]) {
                val tmp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = tmp
            }
            flag = false
        }
        if (flag) {
            break
        }
    }
    return array
}

fun main(args: Array<String>) {
    val array = arrayOf(2, 7, 4, 1, 5, 3)
    bubbleSort(array, array.size).forEach { println(it) }
}

/*
* Complexity O (n^2)
*
*
* */