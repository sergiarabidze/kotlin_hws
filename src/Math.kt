class Math {
    fun gcd(a: Int, b: Int): Int {
        require(a > 0 && b>0)//I read this in the documentation
        //here I used Euclidean algorithm
        var x = a
        var y = b
        while (x!=y) {//while these variables are not equal it keeps going
            if (x > y) {
                x-= y
            } else {
                y-= x
            }
        }
        return x//when they are equal it is the answer
    }
    fun lcd (a : Int,b: Int):Int{
        return (a * b) /gcd(a,b)//so basically if they are not ურთიერთმარტივი we should divide their product with their gcd
    }
    fun checkDollar(input: String):Boolean{
        return ('\$' in input)
    }
    fun even(input:Int = 100):Int{
        if(input <1) return 0
        return input + even(input - 2)//simple recursive call until we get to the baseCase
    }

    fun reverse(input:Int):Int{
        var x:Int = input
        var ret : Int =0
        while(x%10==0){//check leading zeros
            x /= 10
        }
        while(x!=0){
            ret = (ret * 10) + (x%10)//reverse number
            x = x/10
        }
        return ret
    }
    fun palindrome(input:String): Boolean{
        val cleanedString= input.filter{it.isLetterOrDigit()}//it filters input and takes everything except for letters and digits
        return cleanedString == cleanedString.reversed()//then reverse and compare
    }
}