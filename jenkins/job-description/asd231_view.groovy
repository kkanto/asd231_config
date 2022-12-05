 
listView('asd231 Jobs') {
    description('asd231 Jobs')
    jobs {
        regex('asd231_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
