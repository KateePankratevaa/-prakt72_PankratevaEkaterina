fun main() {
    try {
        println("Введите первое число")
        var a = readLine()!!.toDouble()
        println("Введите второе число")
        var b = readLine()!!.toDouble()
        println("Введите третье число")
        var c = readLine()!!.toDouble()

        if (a>=b && b>=c)
        {
            println(a*a)
            println(b*b)
            println(c*c)
        }
            else
        {
            println(Math.abs(a))
            println(Math.abs(b))
            println(Math.abs(c))
        }

    } catch (e: Exception) {
        println("Неверный формат ввода")
    }
}

