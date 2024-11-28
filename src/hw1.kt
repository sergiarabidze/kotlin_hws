fun main() {
    do {
        var x: String = readln()//შეგვეძლო მნიშვნელობები შეგვეყვანა პირდაპირ მაგრამ პროგრამის თავიდან დაწყებას არანაირი აზრი აღარ ექნებოდა
        var y: String = readln()
        var  first = ""
        var second = ""
        var z: Double;
        for (char in x){
            if(char.digitToIntOrNull()!=null){
                first = first.plus(char)
            }
        }
        for (char in y){
            if(char.digitToIntOrNull()!=null){
                second = second.plus(char)
            }
        }
        x = first.ifEmpty {"0"}
        y = second.ifEmpty {"0"}
        //ორივე სტრინგიდან ამოვიღე არარიცხვითი სიმბოლოები და დამრჩა მხოლოდ რიცხები მაგრამ თუ რომელიმე ცარიელია მაშინ 0 დავტოვე
        if (y=="0") {
            println("ნულზე გაყოფა არ შეიძლება!")
        } else {
            z = ((x.toIntOrNull())!!.toDouble() / (y.toIntOrNull()!!.toDouble()))//აქ !! ნიშნავს რო უეჭველად იქსის მნიშვნელობა არის არა NULL
            println("X და Y განაყოფი არის: $z")//ორივე მნიშვნელობა double-დ გადავაქციე იმიტო რო ისე ზუსტ განაყოფს ვერ გავიგებდით
        }
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        val answer = readln()
    }
        while(answer.equals("y", ignoreCase = true))
    //      აქ თავიდან იწყებს პროგრამას თუ Y/y შემოვა მაგრამ
    //      თუ N/n ან რამე გაუთვალისწინებელი სიმბოლო შემოვა პროგრამა ჩერდება
}