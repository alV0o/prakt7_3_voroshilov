fun main(){
    try {
        println("Введите x")
        val x = readLine()!!.toDouble()
        println("Введите y")
        val y = readLine()!!.toDouble()

        println("Введите выбранный график")
        val answer = readLine()!!.toInt()
        when (answer) {
            1 -> {
                val sFirstTriangle = (2 * 3) / 2.0
                val sSecTriangle = (2 * 1) / 2.0

                val x1 = -3.0
                val y1 = 0.0

                val x2 = 0.0
                val y2 = 1.0

                val x3 = 0.0
                val y3 = -1.0

                val S1 = Math.abs(((x1 - x) * (y2 - y) - (x2 - x) * (y1 - y))) / 2.0
                val S2 = Math.abs(((x - x3) * (y2 - y3) - (x2 - x3) * (y - y3))) / 2.0
                val S3 = Math.abs(((x1 - x3) * (y - y3) - (x - x3) * (y1 - y3))) / 2.0

                val x4 = 1.0
                val y4 = 0.0

                val S4 = Math.abs(((x - x3) * (y2 - y3) - (x2 - x3) * (y - y3))) / 2.0
                val S5 = Math.abs(((x4 - x) * (y2 - y) - (x2 - x) * (y4 - y))) / 2.0
                val S6 = Math.abs(((x4 - x3) * (y - y3) - (x - x3) * (y4 - y3))) / 2.0

                when {
                    (sFirstTriangle == S1 + S2 + S3 || sSecTriangle == S4 + S5 + S6) -> println("а - входит")
                    else -> println("а - не входит")
                }
            }

            2 -> {
                val sTriangle = (2 * 2) / 2.0

                val x1 = 0.0
                val y1 = 2.0

                val x2 = 1.0
                val y2 = 0.0

                val x3 = -1.0
                val y3 = 0.0

                val S1 = Math.abs(((x - x3) * (y2 - y3) - (x2 - x3) * (y - y3))) / 2.0
                val S2 = Math.abs(((x1 - x3) * (y - y3) - (x - x3) * (y1 - y3))) / 2.0
                val S3 = Math.abs(((x1 - x) * (y2 - y) - (x2 - x) * (y1 - y))) / 2.0

                when {
                    (sTriangle == S1 + S2 + S3 || (y >= -2 && y <= 0 && x >= -1 && x <= 1)) -> println("б - входит")
                    else -> println("б - не входит")
                }
            }

            3 -> {
                when {
                    ((x >= -1 && x <= 1 && y >= 0 && y <= 2) || (x * x + y * y <= 1)) -> println("в - входит")
                    else -> println("в - не входит")
                }
            }

            4 -> {
                val sFirstTriangle = (2 * 3) / 2.0
                val sSecTriangle = (3 * 1) / 2.0

                val x1 = -2.0
                val y1 = 0.0

                val x2 = 0.0
                val y2 = 1.0

                val x3 = 0.0
                val y3 = -2.0

                val S1 = Math.abs(((x1 - x) * (y2 - y) - (x2 - x) * (y1 - y))) / 2.0
                val S2 = Math.abs(((x - x3) * (y2 - y3) - (x2 - x3) * (y - y3))) / 2.0
                val S3 = Math.abs(((x1 - x3) * (y - y3) - (x - x3) * (y1 - y3))) / 2.0

                val x4 = 1.0
                val y4 = 0.0

                val S4 = Math.abs(((x - x3) * (y2 - y3) - (x2 - x3) * (y - y3))) / 2.0
                val S5 = Math.abs(((x4 - x) * (y2 - y) - (x2 - x) * (y4 - y))) / 2.0
                val S6 = Math.abs(((x4 - x3) * (y - y3) - (x - x3) * (y4 - y3))) / 2.0

                when {
                    (sFirstTriangle == S1 + S2 + S3 || sSecTriangle == S4 + S5 + S6) -> println("г - входит")
                    else -> println("г - не входит")
                }
            }
            else->{
                println("неправильное значение")
            }
        }
    }
    catch(e:Exception){
        println("неверный формат")
    }
}
