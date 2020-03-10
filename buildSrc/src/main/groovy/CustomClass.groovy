class ParentClass {
    def var="My Variable"
    def method1(){
        println "Hello Method1"
    }
}
class MyClass extends ParentClass{
    static void helloWorld(){
        println "Hello World "
    }

    def method2(){
        println "Hello Method2"
    }
}

def method3(){
    println "Hello Method3"
}

method3()
def obj=new MyClass()
obj.method1()
obj.method2()
println obj.var