object Main extends Thread { //el objeto
  def main(args: Array[String]): Unit =
    println("*****Números pares en Scala*****")

  var t_ini = System.nanoTime() //Variables para determinar el tiempo de ejecución
  var number = 1;
  while (number <= 100) {
    if (number % 2 == 0) {
      println("Número:  \t" + number + "\n")
    }
    number +=1;
  }
  var t_fin = System.nanoTime() //Tomamos tiempo en que finalizó el algoritmo
  var duration = (t_fin - t_ini)/100000000
  println("Tiempo transcurrido: \t" + duration + " segundos\n")
}