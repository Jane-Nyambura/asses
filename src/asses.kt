fun main() {
    intro(20,"jane")
    drinks(16)
    drinks(3)
    drinks(38)


}
fun intro(age:Int,name:String){
    var words=("my name is $name and I am $age years")
    println(words)
}
fun drinks(age: Int){
  when (age) {
      in 1..5-> println("student get's a glass of milk")
      in 6..15-> println("student get's a bottle of fanta")
      else-> println("student to get cocacola")
  }
}
fun schools(q:String,w:String,e:String,r:String):String{
    var name= arrayOf(q,w,e,r)
    for(name in names)
        if(name.length>4){
            println("name")
        }
return names

}
class Human (var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println()
    }
}

