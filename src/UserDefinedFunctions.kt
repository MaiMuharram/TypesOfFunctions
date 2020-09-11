class UserDefinedFunctions{

    val anonymous1 = fun(x: Int, y: Int): Int = x + y
 fun anonymousFun(){
     println("Anonymous Function implementaion:")

     val sum = anonymous1(3,5)
     println(sum)

 }

    fun tyinf() = "42"
    fun typeInference(){
        println("Type Inference Function implementaion:")
        println( tyinf())
    }

    fun explicitType():Unit{
        println("Explicit Type Function implementaion:")
    }

}