#!/usr/bin/env groovy
GroovyShell shell = new GroovyShell()
def tools = shell.parse(new File('tools_007.groovy'))

def call(name) {
    echo "I'm running on node ${env.NODE_NAME} and my name is ${name}"
    tools.hello()
}