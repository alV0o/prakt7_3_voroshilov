fun main(){
    try {
        val r1 = readLine()!!.toDouble()
        val r2 = readLine()!!.toDouble()
        val r3 = readLine()!!.toDouble()

        when{
            (r1<=0 || r2<=0 || r3<=0)->println("Неправильные значения")
            else-> {
                val r = 1 / (1 / r1 + 1 / r2 + 1 / r3)
                println(String.format("%.2f", r))
            }
        }
    }
    catch (e:Exception){
        println("неверный формат")
    }
}