def rain_list_from_file(file):
    rain_list = []
    for line in file:
        rain = int(line.split()[1])
        rain_list.append(rain)
    return rain_list

def average_rain(list):
    avg = sum(list) / len(list)
    return round(avg, 2)

def max_rain(list):
    return max(list)

#? Test Code ?#
FILENAME = "rainfall.txt"
file = open(FILENAME, "r")
rain_list = rain_list_from_file(file)
average = average_rain(rain_list)
print(average)
max_rain = max_rain(rain_list)
print(max_rain)