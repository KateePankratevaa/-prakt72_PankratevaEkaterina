fun main() {
        try {
            println("Введите число")
            var k = readLine()!!.toDouble()
            println("Результат:")
            println(Math.pow(100.0,3.0)-Math.pow(92.0,2.0)+k)

        } catch (e: Exception) {
            println("Неверный формат ввода")
        }
    }

