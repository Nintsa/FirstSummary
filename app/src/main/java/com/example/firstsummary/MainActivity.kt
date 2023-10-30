package com.example.firstsummary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

//შექმენით კლასი სადაც აღწერილი გექნებათ რამდენიმე ფუნქცია მათემატიკური ოპერაციებისათვის
//
// + დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს უსგ. //Int
// დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს მათ უსჯ. //Int
//+ დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს შეიცავს თუ არა ეს მონაცემი შემგედ სიმბოლოს ‘$’’ /String
// + აღწერეთ რეკურსიული ფუნქცია რომელიც დაითვლის 100-მდე ყველა ლუწი რიცხვების ჯამს //Int
// + აღწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს მთელ რიცხვს და დააბრუნებს ამ რიცხვის შებრუნებულს. მაგალითად შემოვიდა 10220 უნდა დაბრუნდეს 2201 //Int
// + დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს არის თუ არა ეს მონაცემი პოლინდრომი //String



fun main(){
    val scanner = Scanner(System.`in`)
    val mathFunctions = MathFunctions()

    println("Enter Two Integers:")
    val x = scanner.nextInt()
    var y = scanner.nextInt()
    scanner.nextLine()

    println("Enter String")
    val string = scanner.nextLine()
}

class MathFunctions(){

   fun GCD(x: Int, y: Int){
       var gcd = 0
        if(x != 0 && y != 0){
            while(gcd <= x && gcd <= y){
                if(x % gcd == 0 && y % gcd == 0){
                    gcd++
                }
            }
            println("GCD of $x and $y is $gcd")
       }
   }

    fun LCM(x: Int, y: Int){
        var lcm = 0
        if(x != 0 && y != 0){
            if(x > y){
                lcm = x
            } else lcm = y
        }

        while (true){
            if (lcm % x == 0 && lcm % y == 0){
                break
            }
            ++ lcm
        }

        println("LCM of $x and $y is $lcm")

    }

    fun ifContains(string: String){
        var i = 0
        var char ='$'
        val result = string.contains(char, ignoreCase = true)
        if(result){
            println("$string contains @char")
        } else {
            println("$string does not contain $char")
        }
    }

    fun recursive(x: Int, y: Int){
        var curr = 1
        while (curr in 2..100){
            if(curr % 2 == 0){
                curr++
            }
        }
        println("sum of even numbers between 0 and 100 is $curr")
    }

    fun reversed(x: Int): String {
        var intToString = x.toString()
        var currString = intToString.reversed()
        if(currString[0] == '0'){
            currString = currString.drop(1)
        }
        return "$currString"
    }

    fun palindrome(string: String){
        var currString = string.reversed()
        if(currString == string){
            println("$string is Palindrome")
        } else {
            println("$string is not Palindrome")
        }
    }

}



