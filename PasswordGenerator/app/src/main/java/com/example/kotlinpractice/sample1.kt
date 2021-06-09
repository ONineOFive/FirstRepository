package com.example.kotlinpractice

class sample1 {
}

fun main(){
//    helloworld()
//    println(add(56, 39))
//
//    // 3. string 템플릿
//    val name = "Jiwon"
//    val lastName = "Jeong"
//    println("My name is ${name + lastName} I'm 28")
//    println("This is 2\$sldkfj") // $를 출력해야하는데 바로 뒤에 다른 문자열이 오면 변수로 생각함. 그때는 $앞에 \붙여주면 변수로 인식하지 않음
//
//
//
//    checkNum(1)

//    forAndWhile()

//    nullcheck()

    ignoreNulls()
}

////1. 함수
//fun helloworld(){
//    println("Hello World!")
//}
//
//fun add(a : Int, b : Int) : Int{
//    return a + b
//}
//
//
////2. val 과 var
//// val = value 상수 / var = variable 변수
//fun hi(){
//    val a : Int = 10
//    var b : Int = 9
//    // a = 100 //불가능
//    b = 100 //가능
//
//    val c = 30 // 자료형을 자동으로 구분하기 때문에 따로 써줄필요는 없다
//    var d = 100
//    var name = "jiwon"
//
//    var e :String // 단 바로 초기화를 하지 않을 경우 자료형도 써줘야한다.
//}
//
//// 4. 조건식
//fun maxBy(a:Int, b:Int):Int{
//    if(a > b){
//        return a
//    }else{
//        return b
//    }
//}
//
//fun maxBy2(a:Int, b:Int) = if(a>b) a else b
//
//fun checkNum(score:Int){
//    when(score){ // 다른 언어의 switch case 문
//        0 -> println("This is 0")
//        1 -> println("This is 1")
//        2, 3 -> println("This is 2 or 3")
//    }
//
//    var b = when(score){
//        1 -> 1
//        2 -> 2
//        else -> 3
//    }
//
//    println("b : ${b}")
//
//    when(score){
//        in 90..100 -> println("You are genius")
//        in 10..80 -> println("not bad")
//        else -> println("okay")
//    }
//}

// Expression VS Statement
// 뭔가 뽀짝뽀짝 해서 값을 만들면 Expression || ex) if(a>b) a else b, Kotlin의 모든 함수
// 값을 만들지 않으면 Statement ||
// ex) when(score){ // 다른 언어의 switch case 문
//        0 -> println("This is 0")
//        1 -> println("This is 1")
//        2, 3 -> println("This is 2 or 3")
//        }


// 5. Array and List
// List : 값 변경 불가. 읽기 전용 / MutableList : 값 변경 가능

//fun array(){
//    val array = arrayOf(1, 2, 3)
//    val list = listOf(1, 2, 3)
//
//    val array2 = arrayOf(1, "d", 3.4f)
//    val list2 = listOf(1, "d", 11L)
//
//    array[0] = 3
//    // list[0] = 3 // 불가능
//
//    val arrayList = arrayListOf<Int>()
//    arrayList.add(10)
//    arrayList.add(20)
//
//}




// 6. for and while
//fun forAndWhile(){
//    val students = arrayListOf("joyce", "james", "jenny", "jennifer")
//
//    for (name in students){
//        println("${name}")
//    }
//
//    var sum : Int= 0
//    for (i in 1..10 step 2){
//        sum += i
//    }
//    println("${sum}")
//
//    for (i in 10 downTo 1){
//        sum += i
//    }
//
//    for (i in 1 until 100){ // 1..100 과 다른점은 until은 100 포함 x
//        sum += i
//    }
//}


// 7. Nullable and NonNull
//fun nullcheck(){
//    //NPE : NULL Pointer Exception
//    var name = "jiwon" // NonNull. 그래서 자료형 쓸 필요 없음
//
//    var nullName : String? = null // 자료형에 ? 붙으면 null값을 쓸 수 있음
//
//    var nameInUpperCase = name.uppercase()
//    var nullNameInUpperCase = nullName?.uppercase()
//
//    // 엘비스 연산자 ?: >> 위의 nullName?.uppercase() 에서 nullName이 null 이면 null을 바로 반환하는데 디폴트값을 주고싶을 때 사용
//    val lastName :String? = null
//
//    val fullName = name + " " + (lastName?: "No LastName")
//    println("${fullName}")
//
//
//
//
//}

fun ignoreNulls(){
//    !! : 절대절대 null이 들어올 리 없을 때 컴파일러에게 "이거 절대로 null 아니야!" 라고 말해주는거
//    정말로 확실하지 않은 이상 안쓰는게 좋음
//    val mNotNull : String = str!!
//    val upper = mNotNull.uppercase()

    val email : String? = "wldnjsdl1312@naver.com"
    email?.let{
        println("My email is ${email}")
    }
}