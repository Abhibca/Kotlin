//Array2

fun main(args:Array<String>){
    var myArray=Array<Int>(5){0}

    myArray[1]=10
    myArray[3]=15

    for(element in myArray){
        println(element)
    }
}
