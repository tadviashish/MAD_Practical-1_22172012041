fun main()
{
    var n = 1
    var recur = factorial(n)
    println("Factorial of number ${n} is : "+recur)
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}