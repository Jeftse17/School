def get_int(prompt):
    return int(input(prompt))

def inches_to_centimeters_table(min_inches, max_inches):
    print("Inches\tCentimeters")
    print("-" * 25)
    for i in range(min_inches, max_inches + 1):
        print("{}\t\t\t{}".format(i, inches_to_centimeters(i)))

def inches_to_centimeters(inches):
    return int(inches * 2.54)

def centimeters_to_inches_table(min_centimeters, max_centimeters):
    print("Centimeters\tInches")
    print("-" * 25)
    for i in range(min_centimeters, max_centimeters + 1):
        print("{}\t\t\t{}".format(i, centimeters_to_inches(i)))

def centimeters_to_inches(centimeters):
    return int(centimeters / 2.54)

min_inches = get_int("Minimum inches: ")
max_inches = get_int("Maximum inches: ")

inches_to_centimeters_table(min_inches, max_inches)

min_centimeters = get_int("Minimum centimeters: ")
max_centimeters = get_int("Maximum centimeters: ")

centimeters_to_inches_table(min_centimeters, max_centimeters)

