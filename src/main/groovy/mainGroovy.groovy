class mainGroovy {
    static void main(args) {
        println "This is running in groovy main!"
        MyClass.helloWorld()
        def obj=new MyClass()
        obj.method1()
        obj.method2()
    }
}
