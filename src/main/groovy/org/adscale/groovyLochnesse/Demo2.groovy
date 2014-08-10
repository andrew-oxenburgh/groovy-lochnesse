package org.adscale.groovyLochnesse

import com.google.common.base.Charsets
import com.google.common.io.Resources

def fitnesse = 'http://localhost:10101/FrontPage?suite&format=xml'

def source = Resources.asByteSource(new URL(fitnesse))


while(true){
    println new String(source.read())
    sleep 1
}

//println "string = $string"

