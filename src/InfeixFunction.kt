class InfeixFunction {


    fun standerdLibInfixFun(){

        println("Standerd Library Infix Function implementation:")
        var num1 = 8
        var num2 = 4
        var bol1= true
        var bol2=false

        println(++num1)
        println(--num2)
        println(bol1 and bol2)
        println(bol1 or bol2)
    }


    infix fun square(n : Int): Int{
        val num = n * n
        return num
    }
    fun userDefinedInfixFun(): Int {
        println("User Definde Infix Function implementation:")
       return this square 3
    }



}
