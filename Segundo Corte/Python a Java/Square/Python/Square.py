class Square:
    def __init__(self, side):
        print("Creating square with side {s}".format(s=side))
        self.side = side
    def area(self):
        return self.side*self.side
    def perimeter(self):
        return 4*self.side
    
paint = Square(12)
table = Square(20)
window = Square(35)
print("Area: ", paint.area(),", Perimetro: ", paint.perimeter())
print("Area: ", table.area(),", Perimetro: ", table.perimeter())
print("Area: ", window.area(),", Perimetro: ", window.perimeter())