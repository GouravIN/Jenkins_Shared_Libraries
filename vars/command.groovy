#!/usr/bin/env groovy

def call(Map args = [:], String script) {
    script = "${args.sudo ? 'sudo ' : ''}${script}"
    def label = args.label ?: script
    sh label: label, script: script
}