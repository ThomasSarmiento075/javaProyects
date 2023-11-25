class Rectanglulo:
    def __init__(self, base, height):
        print("Creating rectangle with base {b} ".format(b=base))
        print("Creating rectangle with height {h}".format(h=height))
        self.base = base
        self.height = height
    
    def area(self):
        return self.base*self.height
        
    def perimeter(self):
        return 2 * self.base + 2 * self.height
    
screen = Rectangulo(20, 15)
table = Rectangulo(30, 20)
board = Rectangulo(45, 25)
    
print("Area: ", screen.area(),", Perimetro: ", screen.perimeter())
print("Area: ", table.area(),", Perimetro: ", table.perimeter())
print("Area: ", board.area(), ", Perimetro: ", board.perimeter())
