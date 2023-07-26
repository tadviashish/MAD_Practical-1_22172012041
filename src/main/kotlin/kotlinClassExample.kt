import com.sun.org.apache.xml.internal.security.Init

fun main()
{
    var s1 = Student(11 ,"hello")
    println(s1.no)
    println(s1.name)
}

open class Person(var fname:String,var lname:String)
{

}
class Student(var no:Init,f:String,l:String):Person()





//class Student(n:Int){
//    var no:Int = n
//    var name:String ="";
//    constructor(n:Int,s:String):this(n)
//    {
//        name = s
//        println("Constructor called")
//    }
//    init {
//        println("I am Init")
//    }
//}