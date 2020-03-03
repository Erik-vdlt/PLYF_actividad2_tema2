object ejercicio {

    def promedioGeneral(datos : Array[Int]) : Unit = {
        var sum = 0
        for (i <- datos){
            sum += i
        }
        sum = sum / datos.length
        println("promedio general: "+sum)
    }

    def promedioParcial(dato : Array[Int]*) : Array[Int] = {
        var sum = 0
        var longi = 0
        var cont = 0
        val parciales = new Array[Int](4)
        for (i <- dato){
                //cont+=1
            for(e <- i){
                sum += e
                longi = i.length
            }
            sum = sum / longi
            parciales(cont) = sum
            cont+=1
            println("promedio parcial "+cont+" : "+sum)
            sum = 0
        }
        parciales    
    }

    def main(args : Array[String]) : Unit = {
        val parcial1 = Array(70,80,90,100,85,60)
        val parcial2 = Array(75,80,90,100,85,60)
        val parcial3 = Array(45,80,90,100,85,60)
        val parcial4 = Array(80,80,90,100,85,60)
        //parciales()
        promedioGeneral(promedioParcial(parcial1,parcial2,parcial3,parcial4))
    }
}