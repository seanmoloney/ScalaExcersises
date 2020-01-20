package com.getvisibility.learning.lists

class ListsTest extends org.scalatest.WordSpec {
  import Lists._

  "A list of integers" when {
      "Populated" should {
        "return its last element" in {
          assert(Lists.last(List(1, 3, 7))==7)
        }
      }
  }

  "A list of Chars" when {
    "Populated" should {
      "return its last element" in {
        assert(Lists.last(List("a", "b", "c"))=="c")
      }
    }
  }
}
