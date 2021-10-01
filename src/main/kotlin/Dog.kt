class Dog  (val name: String, val weight:Int, val breed: String) {


    fun bark(){
        println(if (weight<20) "yip" else "WOW")
    }


}