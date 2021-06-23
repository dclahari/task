package com.example.task

class CourseModal(toString: String, toString1: String) {
    // variables for our course
    // name and description.
    private var email: String? = null
    private var number: String? = null

    // creating constructor for our variables.
    fun CourseModal(email: String?, number: String?) {
        this.email = email
        this.number = number
    }

    // creating getter and setter methods.
    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getNumber(): String? {
        return number
    }

    fun setNumber(number: String?) {
        this.number = number
    }

}