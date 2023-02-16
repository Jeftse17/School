min = int((input("Minimum inches: ")))
max = int((input("Maximum inches: ")))

print("Inches\t\tCentimeters")
print("-"*28)
for inch in range(min, max + 1):
    centimeters = int((inch * 2.54))
    print(("{}\t\t{}".format(inch, centimeters)))
    