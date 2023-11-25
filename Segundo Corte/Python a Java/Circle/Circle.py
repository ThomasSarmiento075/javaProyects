class Circle:
    pi = 3.1416
    def __init__(self, diameter):
        print("Creating circle with diameter {d}".format(d=diameter))
        
        self.radius = diameter/2
        
    def circumference(self):
        return self.pi*2*self.radius
medium_pizza = Circle(12)
teaching_table = Circle(36)
round_room = Circle(11460)
print(medium_pizza.circumference())
print(teaching_table.circumference())
print(round_room.circumference())
        