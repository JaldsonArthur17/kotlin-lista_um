class Retangulo( val base: Double, val altura: Double) {
    fun calcArea(): Double {
        return base * altura
    }
    fun calcPerimetro(): Double {
        return 2 * (base + altura)
    }
}