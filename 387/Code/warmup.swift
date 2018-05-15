class Circle {
     var radius : Double

     init(theradius: Double) {
         //Update classes radius value with the one provided
         radius = theradius
     }

     func getArea() -> Double {
         //Calculate the area of the circle (NOTE: Bad Programming, Magic Number)
         return 3.14 * (radius * radius)
     }

    //Add a Function to Caluclate the Circumference (Pi * R * R)
    func getCircumference()
    {
       //Code Goes Here

    }
 }

//List of Circles
var theList = [2.0,4.0,6.0]

for item in theList {
    //New Circle
    var theCircle = Circle(theradius: item)

    //Print
    print ("Circle of Radius \(item)")
    print ("\tArea: \(theCircle.getArea()), Circum: \(theCircle.getCircumference())")
}
 