package edu.knoldus

@SerialVersionUID(124)
class Person(val name: String, val age: Int,@transient val day: String,
             val adress: Address, val salary: Float,@transient  val luckyNo: Int ) {

}
