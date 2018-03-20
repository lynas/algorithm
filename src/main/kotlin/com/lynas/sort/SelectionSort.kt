package com.lynas.sort

fun selectionSort(array: Array<Int>, arraySize: Int): Array<Int> {
    for (i in 0 until arraySize - 1) {
        var minValLocation = i
        for (j in i + 1 until arraySize) {
            if (array[j] < array[minValLocation]) {
                minValLocation = j

            }
        }
        val temp = array[i]
        array[i] = array[minValLocation]
        array[minValLocation] = temp

    }
    return array
}

fun main(args: Array<String>) {
    val array = arrayOf(2, 7, 4, 1, 5, 3)
    selectionSort(array, array.size).forEach { println(it) }
}

/*
* Complexity O (n^2)
*
*
* */