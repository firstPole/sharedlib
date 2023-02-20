def helloWorld(String name = 'World') {
   echo "Hello, ${name}!"
}

def call(String name = 'World') {
    helloWorld.helloWorld()
}


