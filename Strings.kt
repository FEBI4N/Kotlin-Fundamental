fun main() {
    var WordOne = "Modern"
    var WordTwo = "Concise"
    var WordThree = "Pragmatic"
    var WordFour = "Safe"
    var text = """
        kotlin is $WordOne
        kotlin is $WordTwo
        kotlin is $WordThree
        kotlin is $WordFour"""
    "".trimIndent()
    print(text)
}