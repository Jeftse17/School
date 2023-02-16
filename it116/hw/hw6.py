def print_conversion_table(min, max):
    print_table_header()
    for inch in range(min, max + 1):
        print_table_line(inch)

def print_table_header():
    print("Inches\t\tCentimeters")
    print("-" * 25)

def print_table_line(inch):
    centimeters = int(inch * 2.54)
    print("{}\t\t\t{}".format(inch, centimeters))

min = int((input("Minimum inches: ")))
max = int((input("Maximum inches: ")))

print_conversion_table(min, max)
