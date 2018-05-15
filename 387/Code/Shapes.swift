class Shape {
    //Shapes will have a number of sides
    var numberOfSides = 0
    var name: String

    //Constructor
    init(name: String){
        self.name = name
	}

    //Place Holder for Area Functions
    func calcArea() -> Double {
       //Placeholder
       return 0.0
    }


    //Place Holder for Perimeter function
    func calcPerimeter() -> Double {
       //Placeholder
       return 0.0
    }
    
    //A simple Function to return the numberr of sides
    func description() -> String {
    	 return ("\(name): a Shape with \(numberOfSides) sides")
	 }
}


class Rectangle: Shape {
  //Variables specific to rectangles
  var width = 0.0
  var height = 0.0

  init(width: Double, height: Double){
      //First update Superclass using its init method
      super.init(name: "Rectangle")
      numberOfSides = 4 //And update the number of sides
      //Then Class Specific
      self.width = width
      self.height = height
      }

   override func calcArea() -> Double {
      return height*width
   }

   override func calcPerimeter() -> Double {
      return 2*(height+width)
   }
}

var testShape = Shape(name:"Square")
print(testShape.description())

var testRec=Rectangle(width: 5, height: 10)
print(testRec.description())
print("Area \(testRec.calcArea()) Perimeter \(testRec.calcPerimeter())")    