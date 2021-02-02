#!/usr/bin/env groovy
import tools
def t=new tools()
def call(name) {
    echo "I'm running on node ${env.NODE_NAME} and my name is ${name}"
    t.hello()
}