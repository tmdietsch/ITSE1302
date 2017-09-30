//The students and their grades given
def students = [
    'Bart Simpson':[65,76,78,43,56,67,57],
    'John Doe':[85,69,67,84,90,46,78],
    'Ellen Ripley':[90,94,100,98,94,97,94],
    'Amanda Ripley':[86,94,84,84,87,89,86],
    'Doctor Who':[99,96,100,91,96,95,89]
]


//Looping through each student and their grades
students.each {k,v ->
    BigDecimal average = v.sum() / v.size()
    String letterGrade
    //If the average is between 90 and 100, then the student gets an A
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else 
    //If the average is between 80 and 89.99, then the student gets a B
    if (average >= 80 && average <= 89.99){
        letterGrade = 'B'
    } else 
    //If the average is between 70 and 79.99, then the student gets a C
    if (average >= 70 && average <= 79.9){
        letterGrade = 'C'
    } else 
    //If the average is between 60 and 69.99, then the student gets a D
    if (average >= 60 && average <= 69.9){
        letterGrade = 'D'
    } else {
    //If the average is less than 60, then the student gets an F
        letterGrade = 'F'
    }
    println "$k - $average - $letterGrade"
}