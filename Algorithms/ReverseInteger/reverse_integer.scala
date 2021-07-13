object Solution {
    def reverse(x: Int): Int = {
        val reverse_string = Math.abs(x).toString

        try {
          val reverse = reverse_string.reverse.toInt
          if (x > 0) reverse
          else -1 * reverse
        }
        catch {
          case e: Exception => 0
        }
            
    }

    def main(args: Array[String]): Unit = {
        println(reverse(1534236469));
    }
}