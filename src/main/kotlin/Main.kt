fun main() {
   //num1
students()
   //num2
towns()
//num3
numbers()
   //num4
   println(names("Lisa","Kennedy","Gideon"))

}
//num1
fun students(){
   val pupils=arrayOf("James","Alice","Peter","Paul")
   println(pupils.contentToString())
}
//num2
fun towns(){
   val cities=arrayOf("harare","mumbai","dodoma","jakarta")
   for(city in cities){
      println(city.substring(0,1).uppercase() + city.substring(1))
   }
}
//num3
fun numbers(){
   val num=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
   val  total=num[1]+num[4]
   println(total)
   println(num.indexOf(158))
   num.sort()
   println(num.contentToString())
}
//num4
fun names(first:String,Second:String,Third:String):String{
   return ("$first $Second $Third")
   }


