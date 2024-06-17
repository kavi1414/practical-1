object Q5 {
    def main(args: Array[String]): Unit = {
        var first_d = 2
        var first_t = 8
        var second_d = 3
        var second_t = 7
        var third_d = 2
        var third_t =8
        println(Calculate_Time(first_d, first_t, second_d, second_t, third_d, third_t))
    }
    def Calculate_Time(first_d: Int, first_t: Int, second_d: Int, second_t: Int, third_d: Int, third_t: Int): Int = {
        var FT = first_d*first_t
        var ST = second_d*second_t
        var TT = third_d*third_t
        var Total_Time = FT+ST+TT
        Total_Time  // This line ensures Total_Time is returned
    }
}