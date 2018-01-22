package edu.knoldus

@SerialVersionUID(123)
class Address(val street: String, val houseNo: Int ) {
  override def toString: String = {
    s"street $street, houseNo $houseNo"
  }
}
