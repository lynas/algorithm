package com.lynas.search

// complexity O(log n)
fun binarySearch(array: Array<Int>, arraySize: Int, searchElement: Int): Int {
    var startPosition = 0
    var endPosition = arraySize - 1

    while (startPosition <= endPosition) {
        val mid = (startPosition + endPosition) / 2
        if (array[mid] == searchElement) {
            return mid
        }else if (searchElement < array[mid]) {
            endPosition = mid - 1
        } else {
            startPosition = mid + 1
        }
    }
    return -1
}

fun main(args: Array<String>) {
    val array = arrayOf(2,6,13,21,36,47,63,81,97)
//    val array = arrayOf<Int>()
    println(binarySearch(array = array,arraySize = array.size,searchElement = 133))
}

/*
* worst case
* total steps = k
* n -> n/2 -> n/4 -> .............. 1
*
* n/ 2^K = 1
*
* k = log`2 n
*
* O(log n)
*
*
*
*
* */