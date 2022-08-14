package com.example.testingapplication

import android.util.Log
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeworkTest{

      @Test
      fun `test valid`(){
            val result = true//Homework.testTrue()
            assertThat(result).isTrue()
      }

      @Test
      fun `fib fun work`(){
            val result = Homework.fib(5)
            assertThat(result).isEqualTo(5)
      }
}