fun main(){
    try{
        val y = readLine()!!.toDouble()
        val fy:Double

        when{
            (y>2)->{
                fy = y+2
                println("fy = " + String.format("%.2f",fy))
            }
            (y<1)->{
                fy = y*y + 2*y+0.3
                println("fy = " + String.format("%.2f",fy))
            }
            else->{
                fy = y*y*y + 2*y*y + 0.3*y +1
                println("fy = " + String.format("%.2f",fy))
            }
        }
    }
    catch(e:Exception){
        println("неверный формат")
    }
}