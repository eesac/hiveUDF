package com.mipakageHive

import org.apache.hadoop.hive.ql.exec.UDF

class miHiveClase extends UDF {
  def evaluate(str: String): Int = {
    str.length()
  }

}
