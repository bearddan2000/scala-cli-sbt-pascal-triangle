object MyApp {
def pascalTriangle(n: Int): Unit = {
  for(i <- 0 until n-1) {
    var c = 1;
    var k = 0;
    while(k<i+1) {
      print(c + ", ");
      c = c * (i-k)/(k+1);
      k+=1;
    }
    println();
}
}
def main(args: Array[String]): Unit = {
  var N:Int = 10;
  println("[INPUT] " + N);
  println("[OUTPUT] ");
  pascalTriangle(N);
}
}
