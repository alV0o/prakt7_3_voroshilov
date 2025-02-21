fun main(){
    try{
        println("Введите r1")
        val r1 = readLine()!!.toDouble()
        println("Введите r2")
        val r2 = readLine()!!.toDouble()

        when {
            (r1<r2)-> {
                val s = Math.PI * (r2 * r2 - r1 * r1)
                println("Площадь кольца = ${String.format("%.2f", s)}")
            }
            else-> println("r1 должно быть меньше r2!")
        }
    }
    catch(e:Exception){
        println("Неверный формат")
    }
}
