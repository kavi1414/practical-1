object Q4 {
    def main(args: Array[String]): Unit = {
        val book_price = 24.95;
        val discount = 0.4
        val shiping_cost = 3
        val shiping_cost_for_next = 0.75
        val Total_price = shiping_cost+New_book_price(book_price,discount)+Shiping_cost_for_next(shiping_cost_for_next)
        println(Total_price)
        
    }

    def New_book_price(book_price:Double,discount:Double): Double = {
        var new_book_price = book_price*(1-discount)*60
        new_book_price
    }
    def Shiping_cost_for_next(shoping_cost_for_next:Double): Double = {
        var new_shiping_cost = 10*shoping_cost_for_next
        new_shiping_cost
    }
   
}