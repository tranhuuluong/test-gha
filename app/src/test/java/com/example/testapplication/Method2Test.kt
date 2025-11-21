package com.example.testapplication

import org.junit.Test

class Method2Test {

    @Test
    fun testMethod1() {
        throw Exception()
        method1()
    }

    @Test
    fun testMethod2() {
        method2()
    }

}