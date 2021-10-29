
data class Person(var name: String ="", var age: Int = 0)

fun main(){

//    val numbers = listOf("one", "two", "three", "two")
//    println(numbers)
//    println("Number of elements: ${numbers.size}")
//    println("Third element: ${numbers[2]}")
//    println("Element at position 0 ${numbers.elementAt(2)}")
//    println("Index of element \"two\" ${numbers.indexOf("two")}")
//    println("Last index of element \"two\" ${numbers.lastIndexOf("two")}")
//    println("First element: ${numbers.first()}")
//    println("First element: ${numbers.last()}")
//    println(numbers.subList(2, 4))
//    println("List contains two?: ${numbers.contains("two")}")
//    println("two" in numbers)
//    println(numbers.indices)
//    println(numbers.asReversed())
//    val numbers = listOf(2, 6, 4, 5, 4, 0, 9)
//    println(numbers.distinct())
//    println(numbers.drop(3))
//    println(numbers.dropLast(2))
//    println(numbers.chunked(numbers.size/2 + 1))
//    println(numbers.indexOf(7))
//    var sortedNumbers =  numbers.sorted()
//    println(sortedNumbers.binarySearch(17))
//    2 6 1 8 4 0 -5 3 ... -> 1000 -> 1000 000
//    сортировка
//    -5 0 1 2 3 4 6 8  1000
//     3 4 6 8 500
//     3 250
//    125
//    62
//    31
//    15
//    7
//    3
//    1

//    val bob = Person("Bob", 31)
//    val people = listOf(Person("Adam", 20), bob, bob)
//    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
//    println(people == people2)
//    println(people)
//    bob.age = 32
//    println(people == people2)

//    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 2)
//    val evenNumbers = numbers.filter { it%3 != 0 }
//    println(evenNumbers)
//    val notMultiplesOf3 = numbers.filterNot { number -> number % 3 == 0 }
//    println(notMultiplesOf3)
//    var numbers = listOf("one", "two", "three", "four")
//    val groupNumbers = numbers.groupBy { it.length }
//    println(groupNumbers)
//    println(groupNumbers.keys)
//    println(groupNumbers.values)
//    var numbers = listOf(1, 2, 3, 4, 5, 6, 7)
//    val groupNumbers = numbers.groupBy { it%2 == 0 }
//    println(groupNumbers)

//    val list = listOf(Person("Tom", 18), Person("Andy", 32), Person("Sarah", 22))
//    val res = list.partition { it.age < 30 }
//    val res = list.filter { it.age < 30 }
//    println(res)
//    println(res.first[0].name)
//    val strings = listOf("a", "b", "c", "d")
//    var numbers = listOf(1, 2, 3, 4, 5, 6, 7)
//    println(strings.reduce { acc, str -> acc + " " + str})

//    val numbers = mutableListOf("one", "two", "three", "two")
//    numbers[0] = "first"
//    numbers.add("four")
//    println(numbers)
    val numbers2 = mutableListOf(1, 2, 3)
    val numbers3 = mutableListOf(4, 5, 6)
    numbers2.addAll(numbers3)
//    numbers2.clear()
//    numbers2.addAll(numbers3)
    numbers2.add(2, 10)
//    println(numbers2)
//    numbers2.removeAt(1)
//    numbers2.remove(123)
    numbers2.shuffle()
    println(numbers2)
}