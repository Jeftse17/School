
import random

def open_file_write(filename):
    file = open(filename, "w")
    return file

def random_numbers_write(file):
    for i in range(10):
        random_num = str(random.randint(1, 100)) + "\n"
        file.write(random_num)


def open_file_read(filename):
    file = open(filename, "r")
    return file

def count_odds(file):
    count = 0
    for line in file:
        num = int(line)
        if (num%2 != 0):
            count += 1
    return count

# Test code

random.seed(67)
FILENAME = "numbers.txt"
file = open_file_write(FILENAME)
random_numbers_write(file)
file.close()
file = open_file_read(FILENAME)
print(count_odds(file))