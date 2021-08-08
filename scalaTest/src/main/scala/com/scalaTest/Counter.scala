package com.scalaTest

class Counter(
             var name:String,
             var age:Int
             ) {


  def apply(name: String, age: Int): Counter = {
    val c = new Counter(name, age)
    println("counter apply")
    c
  }
  // 辅助构造器1
  def this (name:String){
    this(name,0)  //之前的构造器
  }

  //辅助构造器2
  def this() {
    this("")
  }

  private var privateAge = 0;//私有变量，外界无法直接访问
  def value = privateAge;//定义一个方法，方法名为我们想要的字段的名称，代替getter
  def value_= ( newValue : Int ){//主语 value_= 是方法名字  代替setter
    privateAge =  newValue
  } //注意，scala中默认方法是public的

  def increment(step:Int):Unit = {
    privateAge += step
  }

  def current():Int = {
    privateAge
  }
}
