package $organization$.$name$

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Use this to test the app locally, from sbt:
  * sbt "run inputFile.txt outputFile.txt"
  *  (+ select CountingLocalApp when prompted)
  */
object $name$ {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}
