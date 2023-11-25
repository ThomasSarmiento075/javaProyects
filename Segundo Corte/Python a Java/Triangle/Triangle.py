class Triangle:
    def __init__(self, base, height):
        print("Creating triangle with base {b} ".format(b=base))
        print("Creating triangle with height {h}".format(h=height))
        
        self.base = base
        self.height = height
        self.hypotenuse = (base**2 + height**2)**(1/2)
    
    def area(self):
        return (self.base*self.height)/2
    
    def perimeter(self):
        return self.base + self.height + self.hypotenuse
    
half_pizza = Triangle(10, 20)
half_piramid_face = Triangle(100,500)
half_signal = Triangle(20, 40)

print("Hypotenuse: ", half_pizza.hypotenuse, ", Area: ", half_pizza.area(), ", Perimeter: ", half_pizza.perimeter())
print("Hypotenuse: ", half_piramid_face.hypotenuse, ", Area: ", half_piramid_face.area(), ", Perimeter: ", half_piramid_face.perimeter())
print("Hypotenuse: ", half_signal, ", Area: ", half_signal.area(), ", Perimeter: ", half_signal.perimeter())