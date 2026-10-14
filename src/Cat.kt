class Cat (private val name: String, private var age: Int, private var weight: Int) {

    fun walk() : Boolean {
        if(weight > 5) {
            weight--
            return true
        }
        return false
    }

    fun eat(amount : Int) {
        if((weight+amount) <= 20) {
            weight += amount
        }
        return
    }

    override fun toString() : String {
        return "Name: $name Age: $age, Weight: $weight"
    }
}
