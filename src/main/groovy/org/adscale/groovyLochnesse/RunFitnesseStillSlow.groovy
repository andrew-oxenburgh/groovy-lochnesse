package org.adscale.groovyLochnesse

import javax.xml.stream.XMLInputFactory

URL url = new URL('http://localhost:10101/FrontPage?suite&format=xml')


def is = new BufferedReader(new InputStreamReader(url.openStream()), 128)
def reader = XMLInputFactory.newInstance().createXMLStreamReader(is)



def vals = []

long right = -1
long wrong = -1
long exceptions = -1
long ignored = -1
long runTimeInMillis = -1
String pageHistoryLink = 'undefined'

while (reader.hasNext()) {
    if (reader.startElement) {
        def name = reader.name.toString()
        if (name == 'right') {
            reader.next()
            right = reader.text.toLong()
        } else if (name == 'wrong') {
            reader.next()
            wrong = reader.text.toLong()
        } else if (name == 'exceptions') {
            reader.next()
            exceptions = reader.text.toLong()
        } else if (name == 'ignored') {
            reader.next()
            ignored = reader.text.toLong()
        } else if (name == 'runTimeInMillis') {
            reader.next()
            runTimeInMillis = reader.text.toLong()
        } else if (name == 'pageHistoryLink') {
            reader.next()
            pageHistoryLink = reader.text
        }
    }
    if (reader.endElement) {
        def name = reader.name.toString()
        if (name == 'result') {
            println "$right, $wrong, $exceptions, $ignored, $runTimeInMillis, $pageHistoryLink"
            right = -1
            wrong = -1
            exceptions = -1
            ignored = -1
            runTimeInMillis = -1
            pageHistoryLink = 'undefined'
        }
    }

    reader.next()
}
