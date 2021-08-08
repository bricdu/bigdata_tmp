package com.scalaTest



object HelloWorld {
  case class Car1(name :String , price: Double)

  case class Car2(name2 :String , price2: Double)

  def main(args: Array[String]) {

    println("Hello, world!") // 输出 Hello World
    val myApply:Counter = new Counter()
    val myCounter = myApply("seven",20)
    println(myCounter.name)
    myCounter.value = 5
    myCounter.increment(10)
    println(myCounter.value)  //15
    // 中缀调用法
    myCounter increment 20
    println(myCounter.value)  //35
    println(myCounter.name)// seven
    myCounter.name="123"
    println(myCounter.name)   //123
    // 辅助构造器1
    val myCC = new Counter("apple")
    println(myCC.name,myCC.age)   //(apple,0)
    //辅助构造器2
    val myCC2 = new Counter()
    println(myCC2.name,myCC2.age)   //(,0)

    println("======================")

    val car1 = Car1("car1",123.0)
    val car2  = Car2("car2",32.1)
    val union = car1.
  }
}
