// Задача 1
val someValue: Option[Double] = Some(20.0)
val value = someValue match {
  case Some(v) => v
  case None => 0.0
}
// value => case Some(v) => v => = 20.0

val noValue: Option[Double] = None
val value1 = noValue match {
  case Some(v) => v
  case None => 0.0
}
// value1 => case None => 0.0

// Задача 2
val kaznuLabs = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
// Длина списка
kaznuLabs.length
// Удвоить значения
kaznuLabs.map(_ * 2)
// Перевернуть список
kaznuLabs.reverse
// Отфильтруйте все значения в списке, кратные 3
kaznuLabs.filter(_ % 3 == 0)

// Задача 3
val numbers = List(11, 22, 33)
var total = 0
for(i <- numbers) {
  total += i
}
println(total)
// total = 11 + 22 + 33 = 66

// Задача 4
def individual_analysis_data(expr: Any) =
  expr match {
    case ("go", "simple") => "Go language must have"
    case ("scala", "the best") => "Scala is the best high-load backend language"
    case ("python", "excellent") => "Python excellent for data and scripting"
    case _ => "Okey, every language matter"
  }
individual_analysis_data(("scala", "the best"))
// case "scala", "the best"
