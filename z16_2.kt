fun main(){
    try{
        println("Введите a")
        val a = readLine()!!.toDouble()
        println("Введите b")
        val b = readLine()!!.toDouble()
        println("Введите c")
        val c = readLine()!!.toDouble()
        println("Введите первую границу")
        val u = readLine()!!.toDouble()
        println("Введите вторую границу")
        val v = readLine()!!.toDouble()

        val discr = b*b - 4*a*c
        val x0 = (-b)/(2*a)
        val y0 = -(discr/(4*a))

        when{
            (a>0)->{
                println("Точка минимума = ${x0};${y0}")
                val yMax1 = a*u*u + b*u + c
                val yMax2 = a*v*v + b*v + c

                when{
                    (yMax1>yMax2)-> println("Точка максимума = ${u};${yMax1}")
                    else -> println("Точка максимума = ${v};${yMax2}")
                }
            }
            (a<0)->{
                val yMin1 = a*u*u + b*u + c
                val yMin2 = a*v*v + b*v + c
                when{
                    (yMin1<yMin2)-> println("Точка минимума = ${u};${yMin1}")
                    else -> println("Точка минимума = ${v};${yMin2}")
                }
                println("Точка максимума = ${x0};${y0}")
            }
            else->{
                val min = a*u*u + b*u + c
                val max = a*v*v + b*v + c

                when{
                    (min<max)->{
                        println("Точка максимума = ${v};${max}")
                        println("Точка минимума = ${u};${min}")
                    }
                    else->{
                        println("Точка максимума = ${u};${min}")
                        println("Точка минимума = ${v};${max}")
                    }
                }
            }
        }
    }
    catch(e:Exception){
        println("неверный формат")
    }
}