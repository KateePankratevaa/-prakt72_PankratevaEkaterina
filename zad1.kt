import kotlin.math.ln

fun main() {
        try {
            println("Введите первый член прогрессии")
            var k = readLine()!!.toInt()
            println("Введите знаменатель прогрессии")
            var p = readLine()!!.toDouble()
            println("Введите число")
            var n = readLine()!!.toInt()
            if (p!=1.0)
            {
                if (p > 0)
                {
                    val pn = Math.exp(ln(p) * n)
                    val s = k * (1.0-pn)/(1-p)
                    println(s)
                }
                else if (p<0)
            {
                val pn1 = -Math.exp(ln(-p) * n)
                val s1 = k * (1.0-pn1)/(1-p)
                println(s1)

            }
                else {
                    val pn2 = 0
                    val s2 = k * (1.0-pn2)/(1-p)
                    println(s2)
                }
            }
            else {
                val s3 = n  *k
                println(s3)
            }

        } catch (e: Exception) {
            println("Неверный формат ввода")
        }
    }
