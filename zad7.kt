fun main() {
    try {
        println("Введите порядковый номер дня недели")
        var a = readLine()!!.toInt()

        if (a<0&&a==0)
        {
            println("Номер введен неверно")
        }
        else
        {
            when {
                a == 1 -> println("Рабочий")
                a == 2 -> println("Рабочий")
                a == 3 -> println("Рабочий")
                a == 4 -> println("Рабочий")
                a == 5 -> println("Рабочий")
                a == 6 -> println("Выходной")
                a == 7 -> println("Выходной")
            }
        }


    } catch (e: Exception) {
        println("Неверный формат ввода")
    }
}

