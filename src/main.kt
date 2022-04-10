//1
//Assignment 9: Lists
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)
//
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)
//
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)
//


fun main() {
stringscollection(listOf(34,3,5,23,10,2,4,6,8,10))
    var height = listOf(45.7,36.5,18.9,34.1,96.9,79.1)
    averageAndSum(height)
    var person1 = personsObjects("Roy",22,5.2,56.8 )
    var person2 = personsObjects("Anita",24,3.5,67.4)
    var person3 = personsObjects("Christine",25,9.7,89.0)
    var people = mutableListOf(person1,person2,person3)
var sortedPeople = people.sortedByDescending { people->people.age }
    println(sortedPeople)
    var newPeople = people.plusElement("person4").plusElement("person5")
    println(newPeople)
    var toyota = Car("KCD 101B",123.5)
    var jeep = Car("KCV 103H",56.7)
    var merceedez = Car("KDB 230J",45.6)
    var mycars = mutableListOf(toyota ,jeep,merceedez)
    var averageMileage = mycars.sortByDescending{ mycars -> mycars.mileage}
    println(averageMileage)
}

fun stringscollection(num: List<Int>): String {
    num.forEach { num ->
        if (num % 2 == 0) {
            println(num)
        }

    }
    return num.toString()
}
fun averageAndSum(height: List<Double>){
    var sum = 0.0
    for(x in height){
        sum+=x
    }
    println(" ${sum}")
    println(" ${sum/height.size}")

}
data class personsObjects( var name:String, var age:Int, var height: Double, var weight:Double){
}
fun addPeople(addedPeople:List<Any>):List<Any>{
return listOf(addedPeople)
}
data class Car( var registration:String,var mileage:Double){

}
fun car (carObjects:List<Any>){

}

