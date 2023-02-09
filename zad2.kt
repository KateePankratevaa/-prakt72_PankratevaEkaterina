import kotlin.math.PI
    fun main() {
        try {
            println("Введите первый радиус")
            var R = readLine()!!.toDouble()
            println("Введите второй радиус")
            var r = readLine()!!.toDouble()
            println("Введите высоту")
            var h = readLine()!!.toDouble()
              if (R>0&&h>0&&r>0)
            {
                  if(R!=0.0&&h!=0.0&&r!=0.0) {
                      var l: Double = Math.sqrt(Math.pow(h, 2.0) + Math.pow(R - r, 2.0))
                      println("площадь усеченного конуса равна:")
                      println(Math.PI * (R + r) * l + Math.PI * Math.pow(R, 2.0) + Math.PI * Math.pow(r, 2.0))
                      println("обьем усеченного конуса равна:")
                      println((1.0 / 3.0) * (Math.PI * (Math.pow(R, 2.0) + Math.pow(r, 2.0) + (R * r)) * h))
                  }
            }
            else
                println("Число введено не верно")

        } catch (e: Exception) {
            println("Неверный формат ввода")
        }
    }




