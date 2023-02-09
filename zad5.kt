fun main() {
    try {
        println("Введите делитель чисел")
        var k = readLine()!!.toInt()
        println("Введите второе число")
        var l = readLine()!!.toInt()
        println("Введите третье число")
        var n = readLine()!!.toInt()
        println("Введите четвертое число")
        var m = readLine()!!.toInt()
        var g = l%k
        if (g == 0)
        {
            var g1 = n%k
            if (g1 == 0)
            {
                var g2 = m%k
                if (g2 == 0)
                {
                    println("Число является делителем чисел")
                }
                }
            }
        else
        print ("число не является делителем чисел ")
    } catch (e: Exception) {
        println("Неверный формат ввода")
    }
}
