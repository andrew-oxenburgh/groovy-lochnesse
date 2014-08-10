package org.adscale.groovyLochnesse



import javax.xml.parsers.SAXParserFactory
import org.xml.sax.helpers.DefaultHandler
import org.xml.sax.*

class XmlExamples {
    static def CAR_RECORDS = '''
    <records>
      <car name='HSV Maloo' make='Holden' year='2006'>
        <country>Australia</country>
        <record type='speed'>Production Pickup Truck with speed of 271kph</record>
      </car>
    </records>
  '''
}


class RecordsHandler extends DefaultHandler {
    def messages = []
    def currentMessage
    def countryFlag = false
    void startElement(String ns, String localName, String qName, Attributes atts) {
        switch (qName) {
            case 'car':
                currentMessage = atts.getValue('make') + ' of '; break
            case 'country':
                countryFlag = true; break
            case 'record':
                currentMessage += atts.getValue('type') + ' record'; break
        }
    }
    void characters(char[] chars, int offset, int length) {
        if (countryFlag) {
            currentMessage += new String(chars, offset, length)
        }
    }
    void endElement(String ns, String localName, String qName) {
        switch (qName) {
            case 'car':
                messages << currentMessage; break
            case 'country':
                currentMessage += ' has a '; countryFlag = false; break
        }
    }
}

def handler = new RecordsHandler()
def reader = SAXParserFactory.newInstance().newSAXParser().XMLReader
reader.setContentHandler(handler)
def inputStream = new ByteArrayInputStream(XmlExamples.CAR_RECORDS.getBytes("UTF-8"))
reader.parse(new InputSource(inputStream))

handler.messages.each {
    println it
}

assert handler.messages == [
        'Holden of Australia has a speed record',
        'Peel of Isle of Man has a size record',
        'Bugatti of France has a price record'
]
