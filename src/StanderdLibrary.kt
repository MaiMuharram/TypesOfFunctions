class StanderdLibrary(name:String){
var name:String = ""
var index:Int = 0

    fun applyFun(){
        val test = StanderdLibrary("apply").apply {
            index = 1
            name = "Apply Function"


        }
        println("${test.index}- ${test.name}")

    }
    
    fun letFun(){
        val test = StanderdLibrary("Let").let {
            it.index=2
            it.name= "Let Function"
            println("${it.index}- ${it.name}")

        }

    }

    fun alsoFun(){
        val test = StanderdLibrary("Also").also {
            it.index=3
            it.name= "Also Function"

        }
        println("${test.index}- ${test.name}")


    }

    fun withFun(){
        val test = StanderdLibrary("With")
            with(test) {
                index=4
                name= "With Function"

        }
        println("${test.index}- ${test.name}")


    }

    fun runFun(){
        val test = run{
            index = 5
            name = "Run Function"
            println("$index- $name")

        }


    }

    fun takeifFun(){
        val test = StanderdLibrary("Takeif Function").takeIf {
            it.name== "Takeif Function"

        }
        println("6- Takeif ${test?.name} ")
    }


}