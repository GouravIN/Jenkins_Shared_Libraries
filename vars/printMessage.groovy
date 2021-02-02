#!/usr/bin/env groovy
def call(name) {
    echo "I'm running on node ${env.NODE_NAME} and my name is ${name}"
}