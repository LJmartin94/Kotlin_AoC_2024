import java.io.File
import kotlin.math.abs

fun readInput() = File("input.txt").useLines{ it.toList() }

fun firstPart(rawInput: List<String>){
  val left = mutableListOf<Int>()
  val right = mutableListOf<Int>()
  for (line in rawInput) {
    val pair = line.split("   ")
    left.add(pair[0].toInt())
    right.add(pair[1].toInt())
  }
  left.toIntArray()
  right.toIntArray()
  left.sort()
  right.sort()
  var answer = 0
  left.forEachIndexed{i, item ->
    answer += abs(item - right[i])
  }
  println("Answer 1: $answer")
}

fun secondPart(rawInput: List<String>){
  val left = mutableListOf<Int>()
  val right = mutableListOf<Int>()
  for (line in rawInput) {
    val pair = line.split("   ")
    left.add(pair[0].toInt())
    right.add(pair[1].toInt())
  }
  left.toIntArray()
  right.toIntArray()
  var answer = 0
  left.forEachIndexed{i, item ->
    answer += (item * right.count{element -> element == item})
  }
  println("Answer 2: $answer")
}

fun main (args: Array<String>) {
  val rawInput = readInput()
  firstPart(rawInput)
  secondPart(rawInput)
}