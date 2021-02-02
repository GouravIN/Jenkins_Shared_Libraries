#!/usr/bin/env groovy
def tools = new GroovyScriptEngine( '.' ).with {
    loadScriptByName( 'tools.groovy' )
}
this.metaClass.mixin tools

def call(name) {
    echo "I'm running on node ${env.NODE_NAME} and my name is ${name}"
    hello()
}