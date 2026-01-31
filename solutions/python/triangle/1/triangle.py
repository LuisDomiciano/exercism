def equilateral(sides):
    side1, side2, side3 = sides
    return is_triangle(sides) and side1 == side2 and side1 == side3

def isosceles(sides):
    side1, side2, side3 = sides
    return (
        is_triangle(sides) and 
        (side1 == side2 
        or side1 == side3 or
        side2 == side3)
    )
    
def scalene(sides):
    side1, side2, side3 = sides
    return (
        is_triangle(sides) and side1 != side2 and side1 != side3 and side2 != side3
    )
def is_triangle(sides):
    side1, side2, side3 = sides
    return (
        side1 > 0 and side2 > 0 and side3 > 0
        and side1 + side2 > side3
        and side1 + side3 > side2
        and side2 + side3 > side1
    )