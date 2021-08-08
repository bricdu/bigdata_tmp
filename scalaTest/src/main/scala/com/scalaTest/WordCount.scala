package com.scalaTest

import java.io.File

import scala.io.Source
import collection.mutable.Map

object WordCount {
  def main(args: Array[String]): Unit = {
    val dirFile = new File("W:\\DB\\裤子")
    val files = dirFile.listFiles()
    files.foreach(x => println(x))
    val results = Map.empty[String, Int]

    val data = Source.fromFile("W:\\DB\\裤子\\一句命令永久激活windows.txt")
    val strs = data.getLines.flatMap { s => s.split(" ") }

    strs foreach { word =>
      if (results.contains(word))
        results(word) += 1
      else
        results(word) = 1
    }

    results foreach { case (k, v) => println(s"$k:$v") }

  }

}
