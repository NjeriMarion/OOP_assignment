fun main(){
    // human class instance
    val student = Human("Marion", 21, 58.69)
    (student.eat(10))
   // println(student.weight)
    (student.birthday())
    student.speak("Hello World")
    // data class instance
    val newUser = User("Marion", "Njeri", "njeriwmarion@gmail.com", "+254711222333", 11111111)
    println(newUser.firstName)
    println(newUser.email)



}
class Human(var name:String, var age:Int, var weight:Double){
// prints interpolated string
    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating ${foodWeight} kgs of food")
    }
    // prints string passed to it
    fun speak(speech:String){
        println(speech)

    }
    // adds age by 1
    fun birthday(){
        age += 1

    }

}
// data class
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:Int )