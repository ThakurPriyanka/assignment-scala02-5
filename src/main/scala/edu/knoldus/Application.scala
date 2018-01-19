package edu.knoldus

import java.io.{File, PrintWriter}

import org.apache.log4j.Logger
import org.json4s._
import org.json4s.jackson.Serialization
import org.json4s.jackson.Serialization.write
import org.json4s.jackson.Serialization.read

import scala.io.Source



object Application {

  def main(agrs: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)
    val street = "GTB nagar"
    val houseNo = 2555
    val address = new Address(street, houseNo)
    val name = "Priyanka"
    val age = 23
    val day = "Friday"
    val salary = 2500
    val lucky = 3
    implicit val formats = DefaultFormats
    val person = new Person(name, age, day, address, salary, lucky)
    val personJscon = write(person)
    val writer = new PrintWriter(new File("personData.txt"))
    writer.write(personJscon)


    writer.close()

    Source.fromFile("personData.txt").foreach { x => log.info(x) }
  }


}
