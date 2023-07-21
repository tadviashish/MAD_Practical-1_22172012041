fun main()
{
    val a = arrayOf(1,11,111,1111)
    println("Array - 1 by using arrayof() method ")
    for(i in 0..a.size-1)
    {
        println(a[i])
    }

    println("Array - 1 by using arrayof()<> method ")
    var b = arrayOf<Int>(1,10,4,6,15)
    for(i in 0..b.size-1)
    {
        println(b[i])
    }


    println("Array - 1 by using intArrayOf method ")
    var d = intArrayOf(2,22,222)
    for(i in 0..d.size-1)
    {
        println(b[i])
    }
}