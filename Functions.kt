fun setUser(name: String, hobby: String , age: Int) = "My name is $name, I like $hobby, and i'm $age years old"
fun printUser(name: String): Unit {
    print("My name is $name")
}
fun main() {
    val user = setUser("Febian Alan Saputra",  hobby =  "Basket Ball" , age = 16)
    println(user)
}