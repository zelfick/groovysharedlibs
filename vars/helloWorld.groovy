def call(Map config = [:]) {  //Define an empty map to pass variables
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
