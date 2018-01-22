package edu.knoldus

@SerialVersionUID(124)
class Person(val name: String, val age: Int,@transient val day : String = "Sunday",
             val adress: Address, val salary: Float,@transient  val luckyNo: Int = 1 ) {
  override def toString: String = {
    s"name $name, age $age, day $day, address $adress , salary $salary luckyNo $luckyNo"
  }
}
