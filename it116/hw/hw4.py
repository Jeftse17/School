# creates a grade converter function with the perameters
def grade_converter(number):
  if number >= 88:
    return "A"
  elif number >= 76:
    return "B"
  elif number >= 62:
    return "C"
  elif number >= 48:
    return "D"
  else:
    return "F"

# gets user input, runs that input through the
# function, and prints the correct letter grade

user_input = float(input("Score: "))
letter_grade = grade_converter(user_input)
print("The grade is " + letter_grade)
