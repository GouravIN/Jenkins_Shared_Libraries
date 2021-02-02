#!/usr/bin/env groovy

import tools

t = new tools()

def call(Map args = [:], String script) {
    script = "${args.sudo ? 'sudo ' : ''}${script}"
    def label = args.label ?: script
    sh label: label, script: script

    t.printHello("Gourav")
}