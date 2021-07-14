object Solution {
    def isPalindrome(x: Int): Boolean = {
        val string_number: String = x.toString
        val length: Int = string_number.length
        for (i <- 0 until length / 2) {
            if (string_number(i) != string_number(length-i-1)) {
                return false;
            }
        }
        return true;
    }

    def main(args: Array[String]) {
      println(isPalindrome(123));
    }
}