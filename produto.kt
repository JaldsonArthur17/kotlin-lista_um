class Produto(var nome: String, var preco: Double, var quantidade: int){
  fun mostruario(): String {
    return "o produto é: $nome e o preço é: R$$preco: e sua quantidade é: $quantidade" }
}
fun main () {
  val produto = produto("PS5", 7.500, 5)
  println(produto.mostruario())
}
