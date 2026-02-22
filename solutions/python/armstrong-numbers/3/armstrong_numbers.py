def is_armstrong_number(number):
    if number < 10:
        return True

    original = number
    digits = 0
    temp = number

    while temp > 0:
        temp //= 10
        digits += 1

    temp = number
    total = 0
    while temp > 0:
        digit = temp % 10
        power = 1
        for _ in range (digits):
            power *= digit

        total += power
        if total > original:
            return False

        temp //= 10
    return total == original
