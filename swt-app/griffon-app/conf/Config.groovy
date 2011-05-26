log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    trace  'org.codehaus.griffon'

    trace   'griffon.util',
           'griffon.core',
           'griffon.swt',
           'griffon.app'
}

