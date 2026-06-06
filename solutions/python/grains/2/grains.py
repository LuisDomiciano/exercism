"""Module to calculate the number of wheat grains on a chessboard."""
def square(number):
    """Calculate the number of grains on a specific square."""
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    return 2 ** (number - 1)
def total():
    """Calculate the total number of grains on the entire board."""
    return (2 ** 64) - 1
