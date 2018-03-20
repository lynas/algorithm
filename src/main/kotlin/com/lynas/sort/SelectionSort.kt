package com.lynas.sort

fun selectionSort(A: Array<Int>, n: Int): Array<Int> {
    for (i in 0 until n - 1) {
        var iMin = i
        for (j in i + 1 until n) {
            if (A[j] < A[iMin]) {
                iMin = j

            }
        }
        val temp = A[i]
        A[i] = A[iMin]
        A[iMin] = temp

    }
    return A
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