class MemberFunctions {

    inline fun inlineFun(myFun: () -> Unit){
        myFun()
        println("hi we  are  inside inline function")
    }

    fun localFun(){
        println("Local Function implementation:")
        fun innerFunction(awesome: String) {
            println(awesome)
        }
        innerFunction("This is awesome")
    }

    //Lambda Function
    val sum = { a: Int, b: Int ->
        val num = a + b
        num.toString()
    }
    fun lambdaFun(){
        println("Lambda Function implementation:")
        val result1 = sum(5,15)
        println("The sum of two numbers is: $result1")


    }
}