import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object temperatura {

    def temperaturas() : Unit = {
        val temp = new Array[Int](48)
        var cont = 0
        var r = new Random()
        var na = 0

        for (i <- temp){
            if(cont%2==0){
                temp(cont) = na
                na+=1
            }
            else {
                temp(cont) = r.nextInt(51)
            }
            cont+=1
        }
        cont = 0
        temp(1) = 25

        val a = new ArrayBuffer[Int]()

        for (i <- temp){
            if(i == 25){
                //println(temp(cont))
                a += temp(cont-1)
                a += temp(cont)
                //cont += 1
            }
            cont += 1
        }
        cont = 0
        a.toArray
        println("---------------------")

        var prom = 0

        for (e <- a){
            if(e % 2 == 0){

            }
            else{
                prom += a(cont)
            }
            cont
        } 
        println("promedio de horas: "+(prom/(a.length/2)))
        //print(cont)
    }

    def main(args : Array[String]) : Unit = {
        temperaturas()
    }
}