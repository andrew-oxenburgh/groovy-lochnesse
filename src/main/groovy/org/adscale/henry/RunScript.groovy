package org.adscale.henry

import groovy.time.TimeCategory
import org.apache.commons.io.IOUtils
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def filename = '/script.adscale'

abstract class CreateScript extends Script {

    @Delegate
    @Lazy
    Create create = this.binding.create

    def invokeMethod(String name, args) {
        create."$name.toLowerCase()"(*args)
    }

}

runScript(filename)

def void runScript(String filename) {
    def binding = new Binding([create: new Create()])

    def importCustomizer = new ImportCustomizer()
    importCustomizer.addStaticStars Create.class.name

    def config = new CompilerConfiguration()
    config.addCompilationCustomizers importCustomizer
    config.scriptBaseClass = CreateScript.class.name

    InputStream is = this.class.getResourceAsStream(filename)

    assert is != null: 'no script found'

    def script = IOUtils.toString(is)

    def shell = new GroovyShell(binding, config)
    use(TimeCategory) {
        shell.evaluate(script)
    }
}


public static void main(String... args){
    args.each {
        runScript it
    }
}