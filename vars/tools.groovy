class tools {
    static def hello() {
        def sh = {sh "sleep 10"}
        sh.call()
        def echo = {echo "I RAN"}
        echo.call()
    }
}
