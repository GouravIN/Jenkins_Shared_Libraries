#!/usr/bin/env groovy

def printNode(name) {
    echo "I'm running on node ${env.NODE_NAME}"
    sh(script: "sleep 60", label: "Hello ${name},I'm sleeping for a minute now")
}