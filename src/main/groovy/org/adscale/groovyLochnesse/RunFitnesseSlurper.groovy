package org.adscale.groovyLochnesse

def xml = """<?xml version="1.0"?>
<testResults>
  <FitNesseVersion>v20140630</FitNesseVersion>
  <rootPath>FrontPage</rootPath>
    <result>
    <counts>
      <right>0</right>
      <wrong>0</wrong>
      <ignores>0</ignores>
      <exceptions>0</exceptions>
    </counts>
    <runTimeInMillis>6</runTimeInMillis>
    <relativePageName>EmptyTest</relativePageName>
    <pageHistoryLink>FrontPage.EmptyTest?pageHistory&amp;resultDate=20140809081940</pageHistoryLink>
                <content>&lt;br/&gt;&lt;a href="FrontPage.EmptyTest"&gt;EmptyTest&lt;/a&gt;&lt;br/&gt;</content>
          </result>
    <result>
    <counts>
      <right>0</right>
      <wrong>0</wrong>
      <ignores>0</ignores>
      <exceptions>19</exceptions>
    </counts>
    <runTimeInMillis>138</runTimeInMillis>
    <relativePageName>ExceptionTest</relativePageName>
    <pageHistoryLink>FrontPage.ExceptionTest?pageHistory&amp;resultDate=20140809081940</pageHistoryLink>
                <content>&lt;br/&gt;&lt;table&gt;
\t&lt;tr&gt;
\t\t&lt;td colspan="3"&gt;non.existent.fixture &lt;span class="error"&gt;Could not invoke constructor for non.existent.fixture[0]&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;numerator&lt;/td&gt;
\t\t&lt;td&gt;denominator&lt;/td&gt;
\t\t&lt;td&gt;quotient?&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;10 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;2 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;5.0 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;12.6 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;3 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;4.2 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;22 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;7 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;~=3.14 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;9 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;3 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;&amp;lt;5 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;11 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;2 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;4&amp;lt;_&amp;lt;6 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;100 &lt;span class="error"&gt;The instance decisionTable_0.setNumerator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;4 &lt;span class="error"&gt;The instance decisionTable_0.setDenominator. does not exist&lt;/span&gt;&lt;/td&gt;
\t\t&lt;td&gt;33 &lt;span class="error"&gt;The instance decisionTable_0.quotient. does not exist&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
&lt;/table&gt;
</content>
          </result>
    <result>
    <counts>
      <right>5</right>
      <wrong>1</wrong>
      <ignores>0</ignores>
      <exceptions>0</exceptions>
    </counts>
    <runTimeInMillis>55</runTimeInMillis>
    <relativePageName>FailingTest</relativePageName>
    <pageHistoryLink>FrontPage.FailingTest?pageHistory&amp;resultDate=20140809081940</pageHistoryLink>
                <content>&lt;br/&gt;&lt;table&gt;
\t&lt;tr&gt;
\t\t&lt;td colspan="3"&gt;&lt;span class="pass"&gt;eg.Division&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;numerator&lt;/td&gt;
\t\t&lt;td&gt;denominator&lt;/td&gt;
\t\t&lt;td&gt;quotient?&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;10&lt;/td&gt;
\t\t&lt;td&gt;2&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;5.0&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;12.6&lt;/td&gt;
\t\t&lt;td&gt;3&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;4.2&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;22&lt;/td&gt;
\t\t&lt;td&gt;7&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;3.142857142857143~=3.14&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;9&lt;/td&gt;
\t\t&lt;td&gt;3&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;3.0&amp;lt;5&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;11&lt;/td&gt;
\t\t&lt;td&gt;2&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;4&amp;lt;5.5&amp;lt;6&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;100&lt;/td&gt;
\t\t&lt;td&gt;4&lt;/td&gt;
\t\t&lt;td&gt;[25.0] &lt;span class="fail"&gt;expected [33]&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
&lt;/table&gt;
</content>
          </result>
    <result>
    <counts>
      <right>6</right>
      <wrong>0</wrong>
      <ignores>0</ignores>
      <exceptions>0</exceptions>
    </counts>
    <runTimeInMillis>23</runTimeInMillis>
    <relativePageName>PassingTest</relativePageName>
    <pageHistoryLink>FrontPage.PassingTest?pageHistory&amp;resultDate=20140809081940</pageHistoryLink>
                <content>&lt;br/&gt;&lt;table&gt;
\t&lt;tr&gt;
\t\t&lt;td colspan="3"&gt;&lt;span class="pass"&gt;eg.Division&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;numerator&lt;/td&gt;
\t\t&lt;td&gt;denominator&lt;/td&gt;
\t\t&lt;td&gt;quotient?&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;10&lt;/td&gt;
\t\t&lt;td&gt;2&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;5.0&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;12.6&lt;/td&gt;
\t\t&lt;td&gt;3&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;4.2&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;22&lt;/td&gt;
\t\t&lt;td&gt;7&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;3.142857142857143~=3.14&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;9&lt;/td&gt;
\t\t&lt;td&gt;3&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;3.0&amp;lt;5&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;11&lt;/td&gt;
\t\t&lt;td&gt;2&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;4&amp;lt;5.5&amp;lt;6&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
\t&lt;tr&gt;
\t\t&lt;td&gt;100&lt;/td&gt;
\t\t&lt;td&gt;4&lt;/td&gt;
\t\t&lt;td&gt;&lt;span class="pass"&gt;25.0&lt;/span&gt;&lt;/td&gt;
\t&lt;/tr&gt;
&lt;/table&gt;
</content>
          </result>
    <finalCounts>
    <right>1</right>
    <wrong>1</wrong>
    <ignores>1</ignores>
    <exceptions>1</exceptions>
  </finalCounts>
  <totalRunTimeInMillis>504</totalRunTimeInMillis>
</testResults>"""

def records = new XmlSlurper().parse(new URL('http://localhost:10101/FrontPage?suite&format=xml').openStream())


//def records = new XmlSlurper().parseText(xml)

records.result.each {
    println "# ${it.pageHistoryLink.text().split('\\?')[0]} #"
    boolean right = it.counts.right.toLong() > 0
    boolean wrong = it.counts.wrong.toLong() > 0
    boolean exceptions = it.counts.exceptions.toLong() > 0
    boolean ignore = it.counts.ignores.toLong() > 0

    if (wrong) {
        println "## failed ##"
    } else if (exceptions) {
        println "## exception ##"
    } else if (ignore) {
        println "## ignore ##"
    } else if (right){
        println "## passed ##"
    }else{
        println "## nothing ##"
    }

//    if(exceptions >)
//
//
//
//    println "## right: $it.counts.right ##"
//    println "## wrong: $it.counts.wrong ##"
//    println "## exceptions: $it.counts.exceptions ##"
//    println "## ignores: $it.counts.ignores ##"
//    println "## runTimeInMillis: $it.runTimeInMillis ##"
}