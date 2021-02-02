#!/usr/bin/env groovy

def call(Map args = [:]) {
    def script = args.script
    def label = args.label
    sh label: label, script: script
}