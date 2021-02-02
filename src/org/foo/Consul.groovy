
package org.foo

def insleep(arg_time) {
    sh "sleep ${arg_time}"
    echo "I RAN"
}