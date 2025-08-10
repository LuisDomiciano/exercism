EXPECTED_BAKE_TIME = 40
def bake_time_remaining(time):
    """back time remaning"""
    return EXPECTED_BAKE_TIME - time
def preparation_time_in_minutes(number_of_layers):
    """preparation time in minutes"""
    return number_of_layers * 2
def elapsed_time_in_minutes(number_of_layers,elapsed_back_time):
    """elapsed time in minutes"""
    return preparation_time_in_minutes(number_of_layers) + elapsed_back_time
