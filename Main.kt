// Задача 2: Функция для нахождения наибольшего общего делителя
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

// Задача 3: Функция для нахождения второго максимального числа
fun secondMax(numbers: List<Int>): Int? {
    if (numbers.size < 2) return null // Если чисел меньше 2, второго максимума нет

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (number in numbers) {
        if (number > max) {
            secondMax = max
            max = number
        } else if (number > secondMax && number < max) {
            secondMax = number
        }
    }

    return if (secondMax == Int.MIN_VALUE) null else secondMax
}

// Основная функция
fun main() {
    //Задача 1: Пример использования службы экстренного реагирования
    val service = AmbulanceService()
    println(service.getDescription())

    //Задача 2: Пример для нахождения наибольшего общего делителя
    val A = 48
    val B = 18
    val resultGCD = gcd(A, B)
    println("Наибольший общий делитель $A и $B: $resultGCD")

    //Задача 3: Пример для нахождения второго максимального числа
    val numbers = listOf(3, 5, 1, 4, 2, 5)
    val resultSecondMax = secondMax(numbers)
    if (resultSecondMax != null) {
        println("Второе максимальное число: $resultSecondMax")
    } else {
        println("Второго максимального числа нет.")
    }
}