fun main(){

 var obj = StanderdLibrary("Hellow Standerd Library Functions")
    obj.applyFun()
    obj.letFun()
    obj.alsoFun()
    obj.withFun()
    obj.runFun()
    obj.takeifFun()

    println("-------------------------------------------------------")
   var obj1 = InfeixFunction()
   obj1.standerdLibInfixFun()
   println(obj1.userDefinedInfixFun())

   println("-------------------------------------------------------")
   var obj3 = MemberFunctions()
   obj3.inlineFun { println("inline Function implementation:") }
   obj3.localFun()
   obj3.lambdaFun()

   println("-------------------------------------------------------")
    var obj4 = UserDefinedFunctions()
    obj4.anonymousFun()
    obj4.typeInference()
    obj4.explicitType()


}