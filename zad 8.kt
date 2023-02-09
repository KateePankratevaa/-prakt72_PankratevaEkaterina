fun main() {
    try {
        println("Введите первое число")
        var a = readLine()!!.toDouble()
        println("Введите второе число")
        var b = readLine()!!.toDouble()
        println("Введите третье число")
        var c = readLine()!!.toDouble()


        if (a>0&&b>0&&c>0 )
        {
            var p1 = (a+b+c)/2;
            println("Периметр треугольника равен")
            println(a+b+c)
            println("Площадь треугольника равна")
            println(Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c)))
        }

        else
            println("Стороны введены неверно")

    }
    catch (e: Exception) {
        println("Неверный формат ввода")
    }
}
